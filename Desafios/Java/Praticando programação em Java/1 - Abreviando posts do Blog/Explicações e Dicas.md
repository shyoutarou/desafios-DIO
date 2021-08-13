## Explicações
Utilizemos o exemplo dado pelo desafio: “hoje eu programei em python”. Python está em minúsculo porque as entradas são todas minúsculas. A saída esperada neste caso seria "h. eu p. em python": a palavra "hoje" pode ser reduzida para "h.", e a palavra "eu" e a palavra "em" não são reduzidas para "e." porque manteria o mesmo número de caracteres da palavra. Entre as palavras "programei" e "python", se abreviarmos "programei" por "p." estaremos reduzindo 7 caracteres, e se abreviarmos "python" por "p." estaremos reduzindo 4 caracteres. Logo, escolhemos a palavra que gera a maior redução, que é "programei"

Mantendo neste exemplo, qual seria o resultado esperado se a entrada fosse "hoje eu programei em python python"? Repare que neste caso, se abreviarmos "python" para "p.", estaremos reduzindo o texto em 8 caracteres (4 caracteres * 2 palavras), o que é uma redução maior do que abreviar "programei" para "p.". Assim, o resultado seria "h. eu programei em p. p.", com "p." abreviando "python".

Assim, as regras seriam:
1. Se uma palavra tem 2 caracteres ou menos, não faz sentido abreviá-la, porque não reduziria a quantidade de caracteres.
1. Se há mais de uma palavra que inicia pela mesma letra, você deve escolher não necessariamente a maior, mas a que reduzirá o maior número de caracteres. Ou seja, deve levar em conta quantas vezes cada palavra se repete para saber qual reduz mais a quantidade de caracteres. 

Um caso especial que deve ser levado em conta é quando a palavra abreviada escolhida é uma substring de outra palavra do texto. Neste caso, deve-se tomar o cuidado de substituir somente a palavra toda, e não um pedaço dela. Observe o último exemplo dos casos de teste abaixo. Caso seu código não tenha levado isto em consideração, sua saída provavelmente será 'a. a. a a.a'.

## Mais casos de teste
Para verificar se o seu código está funcionando, tente os casos abaixo:

| Exemplo de Entrada | Exemplo de Saída|
| ---|--- |
|abcd abc abc abc|abcd a. a. a.<br />1<br />a. = abc|
|abcd abcd abc abc abc|a. a. abc abc abc<br />1<br />a. = abcd |
|dwh t cohor dkvwcsg sqoqms b a|dwh t c. d. s. b a<br />3<br />c. = cohor<br />d. = dkvwcsg<br />s. = sqoqms |
|aaaa aaaa a aaaaa|a. a. a aaaaa<br />1<br />a. = aaaa|

## Dicas
<details> 
  <summary>Dica 1</summary>
   Como você pode separar as palavras de uma lista de palavras?
</details>
<details> 
  <summary>Dica 2</summary>
   Você pode utilizar o método split(separador), que separa uma String em um array de Strings de acordo com o separador. No caso, o separador é espaço em branco (" ").
</details>
<details> 
  <summary>Dica 3</summary>
   Como você pode guardar o número de vezes em que cada palavra ocorre?
</details>
<details> 
  <summary>Dica 4</summary>
   Um jeito de guardar o número de ocorrências de cada palavra é usar um Map, com chave igual a palavra, e valor igual ao número de ocorrências dela.
</details>
<details> 
  <summary>Dica 5</summary>
   Sabendo o número de ocorrências de cada palavra, como você determina, para cada letra, qual é a palavra que gera a maior redução de caracteres quando abreviada?
</details>
<details> 
  <summary>Dica 6</summary>
   Você pode criar outro mapa, com chave igual ao caracter, e valor igual à palavra que mais reduz a quantidade de caracteres. A fórmula para saber quantos caracteres uma palavra reduz é (tamanhoPalavra-2)*numeroOcorrencias. Você pode usar um array ao invés de um mapa também, em que a posição 0 representa 'a', a posição '1' representa 'b' e assim por diante.
</details>
<details> 
  <summary>Dica 7</summary>
   Como você imprime as abreviações em ordem alfabética?
</details>
<details> 
  <summary>Dica 8</summary>
   Se você usar um array, basta imprimir pela ordem das posições. Se usar um Map, uma sugestão é utilizar TreeMap, que consegue retornar as chaves ordenadas.
</details>
<details> 
  <summary>Dica 9</summary>
   Para substituir apenas a palavra inteira ao invés de um pedaço dela, é possível utilizar o regex '\b': https://www.regular-expressions.info/wordboundaries.html. Lembre-se de utilizar "\\b" caso decida por esta abordagem.
</details>
