# tarefa3-java-parametros

## Descrição breve da tarefa

Este programa demonstra como funciona a passagem de parâmetros em Java. O código cria uma variável `x` com valor `10`, chama o método `alterarNumero(x)` e depois mostra que o valor original continua o mesmo fora do método.

## Estrutura

Projeto organizado para execução via linha de comando com Java simples.

```text
tarefa3-java-parametros/
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
Antes: 10
Em alterarNumero: 20
Depois: 10
```

## Explicação

### Por que o valor original não mudou

O valor original não mudou porque o método `alterarNumero` recebeu apenas uma cópia do valor armazenado em `x`. Dentro do método, a variável local também se chama `x`, mas ela é independente da variável `x` do `main`. Ao fazer `x = 20`, a alteração acontece somente nessa cópia local.

### O que significa “passagem por valor”

Passagem por valor significa que, ao chamar um método, Java copia o valor da variável enviada como argumento e entrega essa cópia ao parâmetro do método. Isso quer dizer que o método trabalha com seu próprio valor local, e não com a variável original diretamente.

### Qual valor realmente foi copiado

O valor copiado foi o número `10`, que estava armazenado na variável `x` no momento da chamada `alterarNumero(x)`. Assim, o parâmetro `x` do método recebeu inicialmente o valor `10`. Depois disso, ele foi alterado para `20` apenas dentro do escopo do método.
