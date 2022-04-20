-module(calculadora).
-export([addition/0,subtraction/0, multiplication/0, division/0,interpret/1, compute/1, start/0, cls/0]).

% Operações basicas da calculadora, cada uma será instanciada como um processo a parte.

% Como cada função funciona: 
% 1. Imprime um Log ao ser instanciada; 
% 2. Espera receber o Pid, X e Y; 
% 3. Imprime um Log informando de onde veio a requisição e a operação já com o seu resultado; 
% 4. Envia uma mensagem para quem pediu a requisição com o resultado da operação;
% 5. Recursão.

addition() ->
	io:format("addition: (re)started~n"),
	receive
		{From, X, Y} ->
			Result = X + Y,
			io:format("addition: from ~p: ~p + ~p = ~p~n",
				  [From, X, Y, Result]),
			From ! {result, Result},
			addition()
	end.

subtraction() ->
	io:format("subtraction: (re)started~n"),
	receive
		{From, X, Y} ->
			Result = X - Y,
			io:format("subtraction: from ~p: ~p - ~p = ~p~n",
				  [From, X, Y, Result]),
			From ! {result, Result},
			subtraction()
	end.

multiplication() ->
	io:format("multiplication: (re)started~n"),
	receive
		{From, X, Y} ->
			Result = X * Y,
			io:format("multiplication: from ~p: ~p * ~p = ~p~n",
				  [From, X, Y, Result]),
			From ! {result, Result},
			multiplication()
	end.

division() ->
	io:format("division: (re)started~n"),
	receive
		{From, X, Y} ->
			Result = X / Y,
			io:format("division: from ~p: ~p / ~p = ~p~n",
				  [From, X, Y, Result]),
			From ! {result, Result},
			division()
	end.

interpret(Expression) -> interpret(Expression, 0).

interpret([], Buffer) -> Buffer;

interpret([Current | Rest], Buffer) ->
	if
		[Current] == "0" ;
		[Current] == "1" ;
		[Current] == "2" ;
		[Current] == "3" ;
		[Current] == "4" ;
		[Current] == "5" ;
		[Current] == "6" ;
		[Current] == "7" ;
		[Current] == "8" ;
		[Current] == "9" ->
			Value = element(1, string:to_integer([Current])),
			interpret(Rest, Buffer * 10 + Value);

		[Current] == "+" ;
		[Current] == "-" ;
		[Current] == "*" ;
		[Current] == "/" ->
			Operator = list_to_atom([Current]),
			SubExpression = interpret(Rest, 0),
			{Operator, Buffer, SubExpression}
	end.

compute(Expression) when is_integer(Expression) ; is_float(Expression) ->
	Expression;

compute(Expression) when is_tuple(Expression) ->
	case Expression of
		{'+', X, Y} ->
			addition ! {self(), compute(X), compute(Y)};
		{'-', X, Y} ->
			subtraction ! {self(), compute(X), compute(Y)};
		{'*', X, Y} ->
			multiplication ! {self(), compute(X), compute(Y)};
		{'/', X, Y} ->
			division ! {self(), compute(X), compute(Y)}
	end,

	receive
		{result, Value} ->
			Value
	end;

compute(Expression) -> compute(interpret(Expression)).

start() ->
	register(addition, spawn(calculadora, addition, [])),
	register(subtraction, spawn(calculadora, subtraction, [])),
	register(multiplication, spawn(calculadora, multiplication, [])),
	register(division, spawn(calculadora, division, [])).

cls() -> io:format("\e[H\e[J").