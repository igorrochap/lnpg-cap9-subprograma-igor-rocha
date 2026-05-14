# tarefa2-python

## Descrição breve da tarefa

Implementar um sistema de vendas em Python que:

- leia produtos;
- leia quantidade;
- leia preço unitário;
- calcule subtotal;
- calcule desconto:
  - 5% acima de R$ 200;
  - 10% acima de R$ 500;
- calcule total final;
- imprima cupom formatado.

## Estrutura

Projeto organizado para execução via linha de comando com Python simples.

```text
tarefa2-python/
├── README.md
├── main.py
├── produto.py
├── pedido.py
└── cupom.py
```

## Ponto de entrada

O ponto de entrada da aplicação é `main.py`.

## Execução

Executar com Python:

```bash
python3 main.py
```

## Comparação entre versões

### Versão monolítica

Na versão monolítica, toda a lógica ficaria concentrada em `main.py`, provavelmente no mesmo fluxo de leitura, cálculo e impressão. Isso até resolveria o problema, mas faria com que entrada de dados, regras de desconto, cálculo do total e geração do cupom ficassem todos misturados.

### Versão modularizada

Na versão modularizada, cada parte da responsabilidade fica mais separada. `Produto` representa os dados de cada item, `Pedido` centraliza os cálculos do subtotal, desconto e valor total, `Cupom` cuida da impressão formatada, e `main.py` organiza o fluxo principal da aplicação. Assim, o código fica dividido em partes menores e mais organizadas.

## Comentários

### Quais partes eram repetitivas

Na versão monolítica, seria natural repetir no mesmo arquivo etapas como acessar dados do produto, calcular valores a partir de quantidade e preço unitário, verificar faixa de desconto e formatar a saída final. Ao separar essas tarefas, evita-se repetir lógica de cálculo e impressão em diferentes trechos do programa.

### Quais partes ficaram mais reutilizáveis

Os cálculos de subtotal, desconto aplicável, desconto total e valor final ficaram mais reutilizáveis dentro de `Pedido`, porque agora estão encapsulados em métodos próprios. A representação de cada item também ficou mais reaproveitável com `Produto`, e a geração da saída ficou isolada em `Cupom`, o que facilita usar essa mesma lógica em outros contextos.

### Impacto da modularização na legibilidade

A modularização melhora a legibilidade porque cada arquivo passa a ter um papel mais claro. `main.py` mostra o fluxo geral da aplicação sem acumular todos os detalhes internos, enquanto `Pedido` concentra as regras de negócio e `Cupom` deixa explícita a parte da apresentação. Isso torna a leitura mais direta e ajuda a entender o sistema por partes.
