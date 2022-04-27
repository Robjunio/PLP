class Pessoa:
    def __init__(self, nome, cpf, rg, idade):
        self.nome = nome
        self.cpf = cpf
        self.rg = rg
        self.idade = idade

    def andar(self):
        print("Andando...")

    def correr(self):
        print("Correndo...")
    
    def comer(self):
        print("Comendo...")

    def aniv(self):
        self.idade += 1
        print("Parabéns pelos %d anos de vida!" %self.idade)

lais = Pessoa("Laís", "123.456.789-10", "1234567-8", 20)
print("Nome:", lais.nome, "\nCPF:", lais.cpf, "\nRG:", lais.rg, "\nIdade:", lais.idade, "\n")

lais.andar()
lais.correr()
lais.comer()
lais.aniv()