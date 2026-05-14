from pedido import Pedido

class Cupom:
    _pedido: Pedido

    def __init__(self, pedido: Pedido):
        self._pedido = pedido

    def imprime(self):
        print()
        self._imprime_produtos()
        self._imprime_valores()

    def _imprime_produtos(self):
        print("Produto | Qtde. | Val. Unitário")
        for produto in self._pedido.produtos:
            print(f"{produto.nome} | {produto.quantidade} | R${produto.valor_unitario:.2f}")

    def _imprime_valores(self):
        desconto_aplicado = self._pedido.desconto_aplicavel() * 100
        print(f"Subtotal: R${self._pedido.subtotal():.2f}")
        print(f"Desconto ({desconto_aplicado}%): -R${self._pedido.desconto():.2f}")
        print(f"Valor total: R${self._pedido.valor_total():.2f}")