/*
Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou a média considerando somente aqueles elementos que estão na área superior da matriz, conforme ilustrado abaixo (área verde).

Entrada
A primeira linha de entrada contem um único caractere Maiúsculo O ('S' ou 'M'), indicando a operação (Soma ou Média) que deverá ser realizada com os elementos da matriz. Seguem 144 valores com ponto flutuante de dupla precisão que compõem a matriz.

Saída
Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal.

-----------------------------------------
Exemplo de Entrada      Exemplo de Saída
-----------------------------------------
S                       112.4
1.0
330.0
-3.5
2.5
4.1
...
-----------------------------------------
*/

const isSum = String(gets());

var xL = 1,
    yL = 11;

let sum = 0.0,
    av = 0.0;
    
var matriz = new Array(12); 

var count = 0;


  for (var x = 0; x < 12; x++) 
  {
    matriz[x] = new Array(12);
  
    for (var y = 0; y < 12; y++) 
    {
      const i = Number(gets());
      matriz[x][y] = i;
      count++;
    }
  }


  for (var x = 0; x < 5; x++) 
  {

    for (var y = xL; y < yL; y++) 
    {
      sum += matriz[x][y];
    }
    xL++;
    yL--;
  }


  if (Number.isInteger(sum))
  {
  
    if (isSum === 'S') 
    {
      console.log(sum.toFixed(1));
    }
  
  else if (isSum === 'M') 
  {
    av = sum / 30.0;
    
    if (Number.isInteger(av.toFixed(1)))
    {
      console.log(av);
    } 
    
    else {
      console.log(av.toFixed(1));
    }
  }
} 


else if (isSum === 'S') 
{
    console.log(sum.toFixed(1));
  } 
  
  else if (isSum === 'M') 
  {
    av = sum / 30.0;
    console.log(av.toFixed(1));
  }

