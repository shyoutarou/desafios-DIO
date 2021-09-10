## Explicações
O enunciado desta questão não está tão bem escrito. A regra geral é a seguinte: dada uma palavra, divida-a em uma duas, digamos parteInicial e parteFinal. Se a parteInicial terminar com a parteFinal, imprima a parteInicial. Se não houver uma forma de dividir a palavra para atender esta regra, imprima a própria palavra.
Alguns exemplos para ficar mais claro:
- sanduicheiche -> parteInicial = 'sanduiche', parteFinal = 'iche'. Como 'sanduiche' termina em 'iche', imprimimos a parteInicial, que é 'sanduiche'.
- barrilarril -> parteInicial = 'barril', parteFinal = 'arril'. Como 'barril' termina em 'arril', imprimimos a parteInicial, que é 'barril'.
- sol -> Não há como dividir 'sol' de tal forma que a parteInicial termine com a parteFinal. Imprimimos 'sol'.

É importante ressaltar que uma palavra pode ser dividida de mais de uma forma, e cada uma delas deve ser impressa. Exemplos:
- testetetete
    1. parteInicial = 'testete', parteFinal = 'tete'. Como 'testete' termina em 'tete', imprimimos 'testete'
    1. parteInicial = 'testetete', parteFinal = 'te'. Como 'testetete' termina em 'te', imprimimos 'testetete'
- aaaaa
    1. parteInicial = 'aaa', parteFinal = 'aa'. Como 'aaa' termina em 'aa', imprimimos 'aaa'
    1. parteInicial = 'aaaa', parteFinal = 'a'. Como 'aaaa' termina em 'a', imprimimos 'aaaa'

Nestes casos em que uma palavra gera mais de uma saída, deve-se imprimir em ordem crescente de tamanho. Nos exemplos acima, 'aaa' vem antes de 'aaaa' e 'testete' vem antes de 'testetete'.

## Mais casos de teste
Para verificar se o seu código está funcionando, tente os casos abaixo, além dos exemplos passados no enunciado:

| Exemplo de Entrada | Exemplo de Saída|
| ---|--- |
|aaaaaaaaaa|aaaaa<br />aaaaaa<br />aaaaaaa<br />aaaaaaaa<br />aaaaaaaaa|
|testetetete|testete<br />testetete|
|testandoando|testando|
|agorasimassim|agorasimassim|
|agorassimassim|agorassim|
|abcdefghijklmnopqrstuvwxyzwxyz|abcdefghijklmnopqrstuvwxyz|
|a|a|
|bb|b|
|bbb|bb|
|bab|bab|
|baba|ba|

## Dicas
<details> 
  <summary>Dica 1</summary>
   Como você pode garantir que todas as formas de dividir a palavra em duas serão testadas?
</details>
<details> 
  <summary>Dica 2</summary>
   Ao invés de checar caractere a caractere para verificar se uma palavra termina com outra, tente utilizar o método endsWith
</details>
<details> 
  <summary>Dica 3</summary>
   Lembre de garantir que todas as saídas de uma palavra sejam impressas, e de que elas estejam em ordem crescente de tamanho. Isso significa que você não deve utilizar um break e deve percorrer a palavra do início ao fim, e não do fim ao início.
</details>
<details> 
  <summary>Dica 4</summary>
   Lembre de imprimir a própria palavra caso não encontre uma forma de dividir.
</details>
