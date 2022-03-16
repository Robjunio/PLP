-module(intercala).

-export([intercala/2, start/0]).

intercala([], []) -> [];
intercala(L1, []) -> L1;
intercala([], L2) -> L2;
intercala([H1|T1], [H2|T2]) -> [[H1, H2] | intercala(T1, T2)].

start() ->
  L1 = [1,2,3],
  L2 = [4,5,6],
  Result = intercala(L1, L2),
  io:fwrite("~w ", [Result]).