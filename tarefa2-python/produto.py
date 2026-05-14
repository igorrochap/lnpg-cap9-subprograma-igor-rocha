class Produto:
    nome: str
    quantidade: int
    valor_unitario: float

    def __init__(self, nome: str, quantidade: int, valor_unitario: float):
        self.nome = nome
        self.quantidade = quantidade
        self.valor_unitario = valor_unitario