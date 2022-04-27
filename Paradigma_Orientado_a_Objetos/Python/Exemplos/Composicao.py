class Cliente:
    def __init__(self, nome, idade):
        self.nome = nome
        self.idade = idade
        self.enderecos = []

    def inserir_end(self, cidade, estado):
        self.enderecos.append(Endereco(cidade, estado))

    def listar_end(self):
        for endereco in self.enderecos:
            print(endereco.cidade, "-", endereco.estado)

    def __del__(self):
        print(self.nome,"(APAGADO)")

class Endereco:
    def __init__(self, cidade, estado):
        self.cidade = cidade
        self.estado = estado
    
    def __del__(self):
        print(self.cidade, "-", self.estado,"(APAGADO)")

cli1 = Cliente("Maria", 18)
print("Cliente:", cli1.nome)
cli1.inserir_end("Manaus", "AM")
cli1.inserir_end("Rio Grande do Sul", "RS")
cli1.listar_end()
print("------")
del cli1
print()

cli2 = Cliente("João", 21)
print("Cliente:", cli2.nome)
cli2.inserir_end("Rio de Janeiro", "RJ")
cli2.inserir_end("Manaus", "AM")
cli2.inserir_end("Recife", "PE")
cli2.listar_end()
print("------")
del cli2
print()

cli3 = Cliente("Felipe", 43)
print("Cliente:", cli3.nome)
cli3.inserir_end("São Paulo", "SP")
cli3.listar_end()
print("------")
del cli3