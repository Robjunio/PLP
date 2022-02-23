:- initialization(bot_adauberto).


talk :-
    nl,
    read(Question),
    process(Question).


process(stop) :- 
    write('- Adaubertinho: Foi bom falar com você, até a próxima!'), !.


process(Question) :-
    check_for(Question, Answer), !,
    write('- Adaubertinho: '),
    write(Answer), nl,

    write('- Adaubertinho: Posso te ajudar com mais algo?'), nl,
    talk.


check_for('Professor', 'É o Jucimar Jr.!').


bot_adauberto :- 
    write('Olá, sou o Adaubertinho.'), nl,
    write('Como posso ajudá-lo?'), nl, 
    talk.

    