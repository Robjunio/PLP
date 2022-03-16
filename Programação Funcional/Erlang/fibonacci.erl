-module(fibonacci).
-export([start/0]).

fibonacci(1) -> 1;
fibonacci(2) -> 1;
fibonacci(X) -> fibonacci(X - 1) + fibonacci(X - 2).

start() ->
  X = 8,
  Result = fibonacci(X),
  io:fwrite("~w", [Result]).