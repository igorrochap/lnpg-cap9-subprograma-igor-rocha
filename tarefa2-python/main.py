from produto import Produto
from pedido import Pedido
from cupom import Cupom

def ler_produtos() -> list[Produto]:
    produtos = []
    adicionar_novamente = True
    while adicionar_novamente:
        produtos.append(ler_produto())
        resposta = input("Deseja adicionar mais produtos? [S/n]: ")
        adicionar_novamente = False if resposta != "S" and resposta != "s" else True

    return produtos

def ler_produto() -> Produto:
    nome = input("Informe o nome do produto: ")
    quantidade = int(input("Informe a quantidade do produto: "))
    valor_unitario = float(input("Informe o valor unitario do produto (com duas casas decimais): "))

    return Produto(nome, quantidade, valor_unitario)


if __name__ == "__main__":
    produtos = ler_produtos()
    
    pedido = Pedido()
    pedido.adicionaVariosProdutos(produtos)

    cupom = Cupom(pedido)
    cupom.imprime()