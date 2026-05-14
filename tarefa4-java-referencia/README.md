# tarefa4-java-referencia

## Descrição breve da tarefa

Este programa demonstra como funciona a passagem de parâmetros em Java quando um objeto é enviado para um método. O código cria um objeto `Produto`, mostra seu preço antes da chamada, aplica um desconto no método `aplicarDesconto` e depois exibe o preço novamente.

## Estrutura

Projeto organizado para execução via linha de comando com Java simples.

```text
tarefa4-java-referencia/
├── Main.java
├── README.md
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

## Saída esperada

```text
Preço antes: 20.65
Preço depois: 14.22
```

## Explicação

### 1. Java possui passagem por referência verdadeira?

Não. Java não possui passagem por referência verdadeira. Em Java, a passagem de parâmetros é sempre por valor. No caso de objetos, o valor passado não é o objeto em si, mas sim a referência que aponta para ele.

### 2. O que exatamente é copiado na chamada?

O que é copiado na chamada `aplicarDesconto(produto)` é a referência armazenada na variável `produto`. Isso significa que o parâmetro `p` recebe uma cópia desse valor de referência e passa a apontar para o mesmo objeto `Produto` criado no `main`.

### 3. Por que alterações no objeto permanecem após a chamada?

As alterações permanecem após a chamada porque `produto` e `p` apontam para o mesmo objeto em memória. Assim, quando o método executa `p.preco = 14.22`, ele altera o estado desse objeto compartilhado. Ao voltar para o `main`, a variável `produto` continua apontando para esse mesmo objeto, agora com o preço modificado.
