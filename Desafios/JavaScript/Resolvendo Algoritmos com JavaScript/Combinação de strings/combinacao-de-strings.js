// Combinação de strings

/* Crie um algoritmo que receba dois inputs que sejam strings e combine-as
alternando as letras de cada string. 

Deve começar pela primeira letra da primeira string, seguido pela primeira
letra da segunda string, em seguida pela segunda letra da primeira string e
continuar dessa forma sucessivamente.

As letras restantes da cadeia mais longa devem ser adicionadas ao fim da
string resultante e retornada.

- Entrada

A entrada contém vários casos de teste. A primeira linha contém um inteiro N
que indica a quantidade de casos de teste que vem a seguir. Cada caso de teste
é composto por uma linha que contém duas cadeias de caracteres, cada cadeia de
caracteres contém entre 1 e 50 caracteres inclusive.

- Saída

Combine as duas cadeias de caracteres da entrada como mostrado no exemplo
abaixo e exiba a cadeia resultante. 


//### Saída
Para cada caso de teste imprima o valor de hash que é calculado conforme o exemplo apresentado acima.
|---------------------------------------|
| Exemplo de Entrada | Exemplo de Saída |
|--------------------|------------------|
| 1                  | 594              |
| 2                  |                  |
| OSADOISAJDSAOIDJA  |                  |
| ASOIJDOSAJDASOIDJA |                  |
|---------------------------------------|
*/
*/

let qtdCasos = gets();
let leituras = [];
const CARACTER = 65;

for(let i=0; i<qtdCasos; i++){
  let qtdLinhas = gets();
  let linhas = [];
  for(let j=0; j<qtdLinhas; j++){
      linhas.push(gets());
  }
  leituras.push(linhas);
}

for(leitura of leituras){
  let codigoHash = 0;
  for(linha in leitura){
    let elemento = parseInt(linha);
    for(let posicao=0; posicao<leitura[linha].length; posicao++){
      let crt = leitura[linha].substring(posicao, posicao+1);
      let valorCrt = parseInt(crt.charCodeAt(0) - CARACTER);
      codigoHash += (posicao + elemento + valorCrt);
    }
  }
  console.log(codigoHash);
}