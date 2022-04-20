-module(calculadora).
-export([adicao/0, subtracao/0, multiplicacao/0, divisao/0, interpretador/1, calcular/1, start/0, cls/0]).

% Operações basicas da calculadora, cada uma será instanciada como um processo a parte.

% Como cada função funciona: 
% 1. Imprime um Log ao ser instanciada; 
% 2. Espera receber o Pid, X e Y; 
% 3. Imprime um Log informando de onde veio a requisição e a operação já com o seu resultado; 
% 4. Envia uma mensagem para quem pediu a requisição com o resultado da operação;
% 5. Recursão.

adicao() ->
	io:format("O processo de adicao foi (Re)iniciado.~n"),
	receive
		{From, X, Y} ->
			io:format("De ~p, ~p + ~p = ~p~n", [From, X, Y, X + Y]),
			From ! {result, X + Y},
			adicao()
	end.

subtracao() ->
	io:format("O processo de subtracao foi (Re)iniciado.~n"),
	receive
		{From, X, Y} ->
			io:format("De ~p: ~p - ~p = ~p~n", [From, X, Y, X - Y]),
			From ! {result, X - Y},
			subtracao()
	end.

multiplicacao() ->
	io:format("O processo de multiplicacao foi (Re)iniciado.~n"),
	receive
		{From, X, Y} ->
			io:format("De ~p: ~p * ~p = ~p~n", [From, X, Y, X * Y]),
			From ! {result, X * Y},
			multiplicacao()
	end.

divisao() ->
	io:format("O processo de divisao foi (Re)iniciado.~n"),
	receive
		{From, X, Y} ->
			io:format("De ~p: ~p / ~p = ~p~n", [From, X, Y, X / Y]),
			From ! {result, X / Y},
			divisao()
	end.

interpretador(Expressao) -> interpretador(Expressao, 0).

interpretador([], Cache) -> Cache;

interpretador([Atual | Rest], Cache) ->
	if
		[Atual] == "0" ;
		[Atual] == "1" ;
		[Atual] == "2" ;
		[Atual] == "3" ;
		[Atual] == "4" ;
		[Atual] == "5" ;
		[Atual] == "6" ;
		[Atual] == "7" ;
		[Atual] == "8" ;
		[Atual] == "9" -> Valor = element(1, string:to_integer([Atual])),
			interpretador(Rest, Cache * 10 + Valor);
		[Atual] == "+" ;
		[Atual] == "-" ;
		[Atual] == "*" ;
		[Atual] == "/" ->
			Operator = list_to_atom([Atual]),
			SubExpression = interpretador(Rest, 0),
			{Operator, Cache, SubExpression}
	end.

calcular(Expressao) when 
	is_integer(Expressao) ; 
	is_float(Expressao) ->
		Expressao;

calcular(Expressao) when is_tuple(Expressao) ->
	case Expressao of
		{'*', X, Y} ->
			multiplicacao ! {self(), calcular(X), calcular(Y)};
		{'/', X, Y} ->
			divisao ! {self(), calcular(X), calcular(Y)};
		{'+', X, Y} ->
			adicao ! {self(), calcular(X), calcular(Y)};
		{'-', X, Y} ->
			subtracao ! {self(), calcular(X), calcular(Y)}
	end,

	receive
		{result, Valor} ->
			Valor
	end;

calcular(Expression) -> calcular(interpretador(Expression)).

start() ->
	register(adicao, spawn(calculadora, adicao, [])),
	register(subtracao, spawn(calculadora, subtracao, [])),
	register(multiplicacao, spawn(calculadora, multiplicacao, [])),
	register(divisao, spawn(calculadora, divisao, [])).

cls() -> io:format("\e[H\e[J").