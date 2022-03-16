-module(uniao).

-import(lists, [usort/1]).
-export([uniao/2, start/0]).

uniao([], []) -> [];
uniao(L1, []) -> L1;
uniao([], L2) -> L2;
uniao(L1, L2) -> lists:usort(L1 ++ L2).

start() ->
  L1 = [1,2,3],
  L2 = [2,5,3],
  Result = uniao(L1, L2),
  io:fwrite("~w ", [Result]).