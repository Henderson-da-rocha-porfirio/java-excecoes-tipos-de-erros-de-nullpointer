# Identificando erros
### 1. Erro de NullPointerException = Erro no meu código. Não estou desenvolvendo como deveria:
#### a. Significa que estou tentando acessar um objeto na memória nulo, ou seja, numa área desconhecida ( nula ).
#### b. Pode acontecer também quando tentamos referenciar uma variável de um determinado tipo, e daí quando vou acessar o objeto que aquela variável referencia. Só que o objeto não existe ou não está sendo referenciado corretamente, daí ele está null.
#### c. Observação: não fazer um tratamento dela com try/catch. O ideal é resolver a causa do problema.
#### d. Uma dica valiosa é procurar pelos " . ", porque antes dos pontos alguma variável estará apontando para null.
### 2. Erro de ClassCastException = Exceção indica também que fiz alguma coisa errada.
#### a. Significa que tentei fazer um cast para um tipo que não é suportado. O tipo que não é de verdade o tipo que está na memória.
#### b. Verificar o Cast explícito que tenha feito.
#### c. Ver se não esqueceu o Valueof().