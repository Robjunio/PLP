class Aluno:
    def __init__(self, nome):
        self.nome = nome
        self.material = None

class Caneta:
    def __init__(self, tipo, marca):
        self.tipo = tipo
        self.marca = marca

    def escrever(self):
        print("Escrevendo...")

class Notebook:
    def __init__(self, marca, processador):
        self.marca = marca
        self.proc = processador
    
    def digitar(self):
        print("Digitando...")

aluno = Aluno("João")
caneta = Caneta("Esferográfica", "Stabilo")
note = Notebook("Dell", "i7")

print("Nome:", aluno.nome)

print("\nCaneta\nTipo:", caneta.tipo, "\nMarca:", caneta.marca)
caneta.escrever()

print("\nNotebook\nMarca:", note.marca, "\nProcessador:", note.proc)
note.digitar()
print()

aluno.material = caneta
aluno.material.escrever()

aluno.material = note
aluno.material.digitar()