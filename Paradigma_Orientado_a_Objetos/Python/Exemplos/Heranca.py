class Veiculo:
    def __init__(self, tipo, chassi, marca, modelo, ano):
        self.tipo = tipo
        self.chassi = chassi
        self.marca = marca
        self.modelo = modelo
        self.ano = ano
    
    def andar(self):
        print("Andando...")

class Moto(Veiculo): 
    def __init__(self, tipo, chassi, marca, modelo, ano, cilindrada):
        super().__init__(tipo, chassi, marca, modelo, ano) 
        self.cilindrada = cilindrada

carro = Veiculo('carro', '9BGRD08X04G117974', 'Ferrari', 'F112', '2017')
moto = Moto('motocicleta', '5AZKG01Z12A339037', 'Honda', 'CG', '2015', '160')

print("Tipo:", carro.tipo, "\nChassi:", carro.chassi, "\nMarca:", carro.marca,
      "\nModelo:", carro.modelo, "\nAno:", carro.ano, "\n")
print("Tipo:", moto.tipo, "\nChassi:", moto.chassi, "\nMarca:", moto.marca, "\nModelo:", moto.modelo,
      "\nAno:", moto.ano, "\nCilindradas:", moto.cilindrada, "\n")

carro.andar()
moto.andar()