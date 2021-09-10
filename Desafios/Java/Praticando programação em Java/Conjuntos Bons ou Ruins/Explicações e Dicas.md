## Explicações
Exemplos de palavras que são prefixos de outras:
  - 'dbc' é prefixo de 'dbcde'
  - 'bate' é prefixo de 'batedeira'
  - 'giro' é prefixo de 'giroscópio'

Neste desafio então, se você tiver em um conjunto 'giro' e 'giroscópio' e mais 1000 palavras, ele será um conjunto ruim de qualquer forma porque 'giro' é prefixo de 'giroscópio'. Ou seja, basta achar um caso desses para ser um conjunto ruim

## Dicas
<details> 
  <summary>Dica 1</summary>
   Uma forma de fazer é, para cada palavra, verificar se ela faz parte do início de alguma das outras palavras.
</details>
<details> 
  <summary>Dica 2</summary>
   Existe algum método que você consiga verificar a condição da dica anterior sem ter que comparar caracter por caracter?
</details>
<details> 
  <summary>Dica 3</summary>
   Cuidado para não confundir prefixo com estar contido. Ou seja, cuidado para não usar contains() ao invés de startsWith().
</details>
<details> 
  <summary>Dica 4</summary>
   O que acontece se você ordenar as palavras?
</details>
<details> 
  <summary>Dica 5</summary>
   Ao ordenar as palavras em ordem alfabética, é possível que uma palavra que venha depois na lista seja prefixo de uma anterior? Como você pode verificar então se uma palavra é prefixo da outra em uma lista ordenada?
</details>
