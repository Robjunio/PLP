from random import randint
def mutation_event(mutation_factor):
    #return the probability of mutation, in this case, 5%

    mutation_chance = randint(0,99)
    if mutation_chance <= (mutation_factor -1):
        mutation = True
    else:
        mutation = False
    return mutation

def character_randomizer(character_mutating = '0'):
    characters = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
                  'U', 'V', 'W', 'X', 'Y', 'Z', ' ']

    position = randint(0, 26)

    if character_mutating in characters:
        while characters.index(character_mutating) == position:
            position = randint(0, 26)

    return characters[position]

def monkey_is_typing():
    gibberish = []
    for i in range(28):
        gibberish.append(character_randomizer())
    return gibberish

def score(dump_monkey, smart_monkey):
    new_score = 0
    for i in range (28):
        if dump_monkey[i] == smart_monkey[i]:
            new_score += 1
    return new_score

def evolving(dump_monkey, mutation_factor):
    aux_monkey = dump_monkey.copy()
    for i in range (28):
        if mutation_event(mutation_factor) == True:
            aux_monkey[i] = character_randomizer(aux_monkey[i])
    return aux_monkey

def monkey_is_evolving(dump_monkey, smart_monkey, reproduction_factor, mutation_factor):

    new_score = score(dump_monkey, smart_monkey)

    for i in range(reproduction_factor - 1 ):
        aux_monkey = evolving(dump_monkey, mutation_factor).copy()
        if new_score < score(aux_monkey,smart_monkey):
            dump_monkey = aux_monkey.copy()
            new_score = score(dump_monkey, smart_monkey)

    return dump_monkey

def main():

    smart_monkey = "METHINKS IT IS LIKE A WEASEL"
    reproduction_factor = 100
    mutation_factor = 5
    gibberish = monkey_is_typing()
    number_of_gibberish = 1

    print("Attempt {}, the monkey is learning ".format(number_of_gibberish))
    monkey_score = score(gibberish, smart_monkey)

    print("{}, score = {}".format("".join(gibberish), monkey_score))


    while monkey_score < 28:
        number_of_gibberish += 1
        gibberish = monkey_is_evolving(gibberish, smart_monkey, reproduction_factor,mutation_factor)
        monkey_score = score(gibberish, smart_monkey)

        print(number_of_gibberish)
        print("{}, score = {}".format("".join(gibberish), monkey_score))

if __name__ == '__main__':
    main()







