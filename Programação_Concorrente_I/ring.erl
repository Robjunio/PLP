-module(ring).
-export([create_ring/1, ring_start/0, ring_start/1,
		 ring_element/1, send_message/3, time_message/3]).

% create_ring will return the data structure which is used
% for all of the ring functions. This is essentially a list of
% Pid's for processes which have already been spawned and are
% waiting for a message from the previous process in the ring.
% 
% 	N - the number of processes in the ring
% 

create_ring(N) -> 
	Pid = spawn(ring, ring_start, []),
	create_ring(N, [Pid], Pid).
create_ring(1, [PPid|Acc], Start) -> 
	Start ! {PPid},
	Ring = [PPid|Acc],
	lists:reverse(Ring);
create_ring(N, [PPid|Acc], Start) -> 
	Pid = spawn(ring, ring_element, [PPid]),
	NewAcc = [Pid|[PPid|Acc]],
	create_ring(N-1, NewAcc, Start).
	

% ring_start is a function which will handle the start node of the
% process ring. The first thing that this needs to do is to receive
% the next process in the ring's Pid value. This is
% so that the messaging can be started. After that, this
% function is then responsible for the counting of the
% ring iterations as well as terminating the ring messages.

ring_start() ->
	receive
		{NPid} ->
			ring_start(NPid)
	end.
ring_start(NPid) ->
	receive
		{From, Message, 0} ->
			From ! {Message},
			ring_start(NPid);
		{From, Message, Iter} ->
			NPid ! {Message},
			ring_start(NPid, From, Iter-1)
	end.
ring_start(NPid, From, 0) -> 
	receive
		{Message} ->
			From ! {Message},
			ring_start(NPid)
	end;
ring_start(NPid, From, Iter) ->
	receive
		{Message} ->
			NPid ! {Message},
			ring_start(NPid, From, Iter-1)
	end.


% ring_element will handle the passing of a message to the 
% next process in the ring. This happens until the message
% reaches the end of the ring.
% 
% 	NPid - this is the Pid of the next ring member
% 	
ring_element(NPid) -> 
	receive 
		Payload ->
			NPid ! Payload,
			ring_element(NPid)
	end.

% send_message will send a message to all of the processes
% in the ring. It will start with the head of the ring and
% leave it up to the ring to terminate.
% 
% 	Start - The starting node of the ring. This
% 		process should be running the ring_start
% 		handler.
% 	Message - This is the message to send around
% 		the ring.
% 	Iter - The number of times that Message should
% 		be sent around the ring.
% 
send_message([Start|_], Message, Iter) ->
	Start ! {self(), Message, Iter},
	receive
		{Message} ->
			{Message}
	end.

% time_message is a function which times how long it takes
% for a message to be sent around the ring.
time_message(Ring, Message, Iter) ->
	{Time, _} = timer:tc(ring, send_message, [Ring, Message, Iter]),
	TimeSecs = Time / 1000000,
	io:format("Time: ~p s~n", [TimeSecs]).