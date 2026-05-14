# tarefa5-projeto-livre

## Descrição breve da tarefa

Este projeto implementa um pequeno sistema de gerenciamento de tarefas em Java. O sistema permite cadastrar tarefas, listar tarefas, concluir tarefas, remover tarefas e mostrar um resumo com a quantidade total, pendente e concluída.

## Estrutura

Projeto organizado para execução via linha de comando com Java simples.

```text
tarefa5-projeto-livre/
├── GerenciadorTarefas.java
├── Main.java
├── README.md
├── Tarefa.java
├── run.sh
```

## Ponto de entrada

O ponto de entrada da aplicação é `Main.java`.

## Execução

Utilizar o script auxiliar:

```bash
./run.sh
```

Ou compilar e executar com Java simples:

```bash
javac -d out *.java
java -cp out Main
```

## Diagrama simples das chamadas

```text
main()
└── executarSistema()
    ├── exibirMenu()
    ├── lerOpcao()
    └── processarOpcao()
        ├── cadastrarTarefa()
        │   └── gerenciador.adicionarTarefa()
        ├── listarTarefas()
        │   └── gerenciador.listarTarefas()
        ├── concluirTarefa()
        │   └── gerenciador.concluirTarefa()
        │       └── buscarPorTitulo()
        ├── removerTarefa()
        │   └── gerenciador.removerTarefa()
        │       └── buscarPorTitulo()
        └── mostrarResumo()
            ├── gerenciador.contarTarefas()
            └── gerenciador.contarPendentes()
```

## Justificativa da divisão dos subprogramas

A divisão dos subprogramas foi feita para separar claramente as responsabilidades do sistema. A classe `Main` concentra o fluxo da interface de linha de comando e a interação com o usuário. A classe `GerenciadorTarefas` centraliza as regras de negócio, como cadastrar, buscar, concluir, remover e contar tarefas. A classe `Tarefa` representa os dados e comportamentos de uma tarefa individual.

Essa separação evita que toda a lógica fique acumulada em um único método ou arquivo. Além disso, facilita a reutilização de métodos como `buscarPorTitulo`, `contarPendentes` e `exibirResultadoOperacao`, que são chamados em mais de um ponto do sistema.

## Dificuldades encontradas

Uma das dificuldades foi definir um sistema pequeno, mas que ainda demonstrasse modularização de forma clara. Também foi necessário organizar os métodos para que o programa não ficasse concentrado apenas no `main`, mantendo o código simples e ao mesmo tempo atendendo aos requisitos de quantidade de subprogramas, passagem de parâmetros e reutilização de funções.

## Vantagens percebidas da modularização

A principal vantagem percebida foi a melhor organização do código. Com a lógica separada em classes e métodos menores, a leitura fica mais clara e as alterações se tornam mais simples. Também há ganho de reutilização, porque algumas operações podem ser chamadas em diferentes pontos sem repetir código. Outro benefício importante é a manutenção, já que cada parte do sistema possui uma responsabilidade mais definida.
