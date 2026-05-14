from produto import Produto

class Pedido:
    produtos: list[Produto]

    def __init__(self):
        self.produtos = []
    
    def adicionaVariosProdutos(self, produtos: list[Produto]):
        self.produtos = produtos

    def desconto(self) -> float:
        return self.subtotal() - self.valor_total()

    def valor_total(self):
        subtotal = self.subtotal()
        desconto = self.desconto_aplicavel()
        if desconto == 0:
            return subtotal
        return subtotal - subtotal * desconto
    
    def desconto_aplicavel(self) -> float:
        subtotal = self.subtotal()
        if subtotal > 500:
            return 0.1
        if subtotal > 200:
            return 0.05
        return 0.0
            
    def subtotal(self) -> float:
        return sum((produto.valor_unitario * produto.quantidade) for produto in self.produtos)
    
    