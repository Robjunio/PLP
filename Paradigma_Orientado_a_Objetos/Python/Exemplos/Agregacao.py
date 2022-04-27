class Carrinho:
    def __init__(self):
        self.produtos = []
    
    def inserir_prod(self, produto):
        self.produtos.append(produto)

    def listar_prod(self):
        for produto in self.produtos:
            print(produto.nome, "= $", produto.preco)
    
    def total(self):
        total = 0
        for produto in self.produtos:
            total += produto.preco
        print("\nTOTAL: $%.2f" %total)        

class Produto:
    def __init__(self, nome, preco):
        self.nome = nome
        self.preco = preco

carr_compras = Carrinho()
print(carr_compras)
print()
carr_compras.listar_prod()

p1 = Produto("Shampoo", 16.9)
carr_compras.inserir_prod(p1)
p2 = Produto("IPhone", 9000)
carr_compras.inserir_prod(p2)
carr_compras.inserir_prod(p2)
p3 = Produto("Blush", 23.95)
carr_compras.inserir_prod(p3)

carr_compras.listar_prod()
carr_compras.total()