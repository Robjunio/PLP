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


process(_) :-
    write('Não tenho uma resposta para isso. ;-;'), nl,
    write('Desculpa por não poder ajuda-lo, mas teria mais alguma dúvida?'), nl,
    talk.


% Base de dados
check_for('Quem é o professor?', 'É o Jucimar Jr.!').
check_for('quem é o professor?', 'É o Jucimar Jr.!').
check_for('quem e o professor?', 'É o Jucimar Jr.!').
check_for('quem é o professor?', 'É o Jucimar Jr.!').
check_for('quem e o professor?', 'É o Jucimar Jr.!').
check_for('Que outras matérias o professor dá?', 'Ele leciona MPS e PLP!').
check_for('que outras matérias o professor dá?', 'Ele leciona MPS e PLP!').
check_for('Que outras materias o professor dá?', 'Ele leciona MPS e PLP!').
check_for('que outras materias o professor dá?', 'Ele leciona MPS e PLP!').
check_for('Qual a data de entrega da próxima atividade?', '24/02/2022, quinta-feira.').
check_for('Qual a data de entrega da proxima atividade?', '24/02/2022, quinta-feira.').
check_for('qual a data de entrega da próxima atividade?', '24/02/2022, quinta-feira.').
check_for('qual a data de entrega da proxima atividade?', '24/02/2022, quinta-feira.').
check_for('A próxima atividade é em grupo?', 'Individual!').
check_for('A próxima atividade e em grupo?', 'Individual!').
check_for('a próxima atividade é em grupo?', 'Individual!').
check_for('a próxima atividade e em grupo?', 'Individual!').
check_for('Quantas atividades já foram passadas?', '4 atividades já foram passadas.').
check_for('quantas atividades já foram passadas?', '4 atividades já foram passadas.').
check_for('Quantas atividades ja foram passadas?', '4 atividades já foram passadas.').
check_for('quantas atividades ja foram passadas?', '4 atividades já foram passadas.').
check_for('Alguma atividade recebeu feedback?', 'Por enquanto, não :(').
check_for('alguma atividade recebeu feedback?', 'Por enquanto, não :(').
check_for('Tem algum grupo da turma?', 'O contato é feito através do Google Classroom (xuhgn4d).').
check_for('tem algum grupo da turma?', 'O contato é feito através do Google Classroom (xuhgn4d).').
check_for('Como entrar em contato com o professor?', 'Através do email jjunior@uea.edu.br').
check_for('como entrar em contato com o professor?', 'Através do email jjunior@uea.edu.br').
check_for('Quais as atividades estão em aberto?', 'Somente a atividade 004 de MPS').
check_for('Quais as atividades estao em aberto?', 'Somente a atividade 004 de MPS').
check_for('quais as atividades estão em aberto?', 'Somente a atividade 004 de MPS').
check_for('quais as atividades estao em aberto?', 'Somente a atividade 004 de MPS').
check_for('Tem como entregar as atividades anteriores?', 'As atividades 1, 2 e 3 já fecharam. Se entregar agora, será entregue com atraso :(').
check_for('tem como entregar as atividades anteriores?', 'As atividades 1, 2 e 3 já fecharam. Se entregar agora, será entregue com atraso :(').
check_for('Quando são as aulas do professor?', 'MPS é às terças e quintas às 18h e PLP é às quartas às 14:40!').
check_for('Quando sao as aulas do professor?', 'MPS é às terças e quintas às 18h e PLP é às quartas às 14:40!').
check_for('quando são as aulas do professor?', 'MPS é às terças e quintas às 18h e PLP é às quartas às 14:40!').
check_for('quando sao as aulas do professor?', 'MPS é às terças e quintas às 18h e PLP é às quartas às 14:40!').


bot_adauberto :- 
    write('Olá, sou o Adaubertinho! Quando quiser parar de conversar, escreva stop.'), nl,
    write('Quais suas dúvidas sobre as atividades de MPS?'), nl, 
    talk.

