-module(fat).
-export([start/0]).

fat(0) -> 1;
fat(X) -> X * fat(X - 1).

start() ->
  X = 10,
  Result = fat(X),  
	io:fwrite("~w", [Result]).