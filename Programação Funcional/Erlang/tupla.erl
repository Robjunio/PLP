-module(tupla).

-export([tupla/1, start/0]).

tupla([]) -> [];
tupla(L1) -> [[N || N <- L1, N rem 2 == 1],[N || N <- L1, N rem 2 == 0]].

start() ->
  L1 = [1,2,3,4,5,6,7,8,9,10],
  Result = tupla(L1),
  io:fwrite("~w ", [Result]).