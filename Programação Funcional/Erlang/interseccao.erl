-module(interseccao).

-export([interseccao/2, start/0]).

interseccao([], []) -> [];
interseccao(L1, []) -> L1;
interseccao([], L2) -> L2;
interseccao(L1, L2) -> [X || X <- L1, Y <- L2, X == Y].

start() ->
  L1 = [1,2,3],
  L2 = [2,5,3],
  Result = interseccao(L1, L2),
  io:fwrite("~w ", [Result]).