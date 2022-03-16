-module(fat_2).
-export([fat_cauda/1, fat_aux/2, start/0]).

fat_aux(1,Parcial) -> Parcial;
fat_aux(X, Parcial) -> fat_aux((X - 1), (Parcial * X)).
  
fat_cauda(X) -> fat_aux(X, 1).

start() ->
  X = 5,
  Result = fat_cauda(X),
	io:fwrite("~w", [Result]).