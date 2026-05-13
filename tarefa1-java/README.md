# tarefa1-java

## Descrição breve da tarefa

Implementar um sistema de controle acadêmico em Java que:

- leia o nome de 5 alunos;
- leia 3 notas para cada aluno;
- calcule a média;
- determine a situação de cada aluno:
  - aprovado;
  - recuperação;
  - reprovado;
- mostre um relatório final.

## Estrutura

Projeto organizado para execução via linha de comando com Java simples.

```text
tarefa1-java/
├── run.sh
├── README.md
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── Main.java
│   │   │   ├── Aluno.java
│   │   │   └── Relatorio.java
│   │   └── resources/
│   └── test/
│       └── java/
```

## Ponto de entrada

O ponto de entrada da aplicação é `src/main/java/Main.java`.

## Execução

Utilizar o script auxiliar:

```bash
./run.sh
```

Ou ompilar e executar com Java simples:

```bash
javac -d out src/main/java/*.java
java -cp out Main
```

## Comparação entre versões

### Versão monolítica

Na versão monolítica, toda a lógica ficaria concentrada no `Main.java`, provavelmente dentro do método `main()`. Isso até funciona para um programa pequeno, mas faz com que leitura de dados, cálculo de média, definição de situação e impressão do relatório fiquem misturados no mesmo lugar.

### Versão modularizada

Na versão modularizada, cada parte da responsabilidade fica mais separada. O `Main` cuida do fluxo principal da aplicação, `Aluno` representa os dados e comportamentos relacionados ao aluno, e `Relatorio` pode centralizar a exibição do resultado final. Assim, o código fica dividido em partes menores e mais organizadas.

## Comentários

### Legibilidade

A versão modularizada apresenta melhor legibilidade, pois cada classe possui uma responsabilidade mais clara. Já na versão monolítica, a concentração de toda a lógica em um único ponto torna a leitura mais cansativa e dificulta a identificação do papel de cada trecho.

### Reutilização

A modularização favorece a reutilização, já que classes e métodos podem ser aproveitados em outros contextos com menos esforço. Na versão monolítica, a lógica tende a ficar muito dependente do `main()`, reduzindo ou eliminando essa possibilidade.

### Facilidade de manutenção

A manutenção se torna mais simples na versão modularizada, porque as responsabilidades estão melhor separadas. Isso facilita localizar onde fazer alterações e reduz o impacto de mudanças. Na versão monolítica, uma modificação tende a afetar um bloco maior de código.

### Clareza do fluxo

Na versão modularizada, o fluxo principal da aplicação fica mais claro, porque o `Main` pode se concentrar em chamar métodos que representam etapas bem definidas. Na versão monolítica, esse fluxo fica misturado com detalhes de implementação, o que dificulta a compreensão geral do programa.

### Tamanho dos métodos

Na versão modularizada, os métodos tendem a ser menores, mais objetivos e mais fáceis de entender. Isso melhora a leitura e também favorece testes e correções. Na versão monolítica, é comum que o `main()` fique extenso e acumule muitas tarefas diferentes.

### Coesão

A coesão é maior na versão modularizada, porque cada classe concentra comportamentos relacionados ao seu próprio papel. Na versão monolítica, diferentes responsabilidades ficam misturadas no mesmo método ou arquivo, o que torna a organização menos consistente.
