// Acima da Diagonal Secundária

/* 
Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou a média considerando somente aqueles elementos que estão acima da diagonal secundária da matriz, conforme ilustrado abaixo (área verde).

 


Entrada
A primeira linha de entrada contem um único caractere Maiúsculo O ('S' ou 'M'), indicando a operação (Soma ou Média) que deverá ser realizada com os elementos da matriz. Seguem os 144 valores de ponto flutuante que compõem a matriz.

Saída
Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal.

 
Exemplo de Entrada	
M
113 11 90 32 115 121 47 120 67 41 52 21     =   830 - 21 = 809
102 69 60 130 108 23 25 68 35 28 29 9       =   686 - 38 = 648
22 88 129 33 19 84 18 136 1 55 54 72        =   711 - 181 = 530
42 143 61 133 118 44 94 122 66 5 132 63		=   1023 - 266 = 757 
20 45 27 39 126 125 110 96 46 13 24 86		=   757  - 265 = 492
81 15 6 56 123 103   105 135 7 85 79 3		=   798  - 414 = 384
64 139 97 51 31   117 119 62 134 73 101 34	=   1022 - 640 = 382 
99 2 78 89 82 74 95 75 76 10 87 12			=   779  - 511 = 268
91 128 140 14 71 80 141 100 107 40 50 142	=   1104 - 745 = 359 
53 114 77 17 59 4 43 30 124 93 92 58		=   764  - 597 = 167
38 36 83 8 144 111 112 48 109 137 26 138	=   990  - 952 = 38
49 65 98 37 131 16 57 127 104 116 70 106	=   976  - 976 = 0   ===> 4834 / 66 = 73,2424

Saída esperada:
73.2


Dado de entrada:
S
113 11 90 32 115 121 47 120 67 41 52 21
102 69 60 130 108 23 25 68 35 28 29 9
22 88 129 33 19 84 18 136 1 55 54 72
42 143 61 133 118 44 94 122 66 5 132 63
20 45 27 39 126 125 110 96 46 13 24 86
81 15 6 56 123 103 105 135 7 85 79 3
64 139 97 51 31 117 119 62 134 73 101 34
99 2 78 89 82 74 95 75 76 10 87 12
91 128 140 14 71 80 141 100 107 40 50 142
53 114 77 17 59 4 43 30 124 93 92 58
38 36 83 8 144 111 112 48 109 137 26 138
49 65 98 37 131 16 57 127 104 116 70 106
Saída esperada:
4834.0


Dado de entrada:
S
-19
0
-7
13
-4
46
23
-28
33
-28
-31


25
-9
29
-48
36
7
-8
48
34
-42
31
-11
-41
25
-20
-46
14
34
49
38
-29
36
30
40
36
38
0
10
-41
-8
-21
-7
-46
-24
29
11
-22
4
12
8
-45
19
29
1
-29
-4
-28
-16
-38
14
39
35
-19
16
-12
-20
20
15
5
-37
38
4
4
8
-31
24
22
2
16
47
-48
6
32
18
10
36
-1
-23
46
20
-47
-17
32
-47
-8
9
26
-47
12
26
45
24
-4
8
-46
-29
13
9
48
11
36
-40
18
-28
41
40
47
-34
34
-28
-34
-41
-24
-42
0
48
-26
16
-48
6
26
5
15
-33
-33
-48
-3
-31
-29
-36
-47
-44
10
Saída esperada:
292.0


Dado de entrada:
M
-19
0
-7
13
-4
46
23
-28
33
-28
-31
25
-9
29
-48
36
7
-8
48
34
-42
31
-11
-41
25
-20
-46
14
34
49
38
-29
36
30
40
36
38
0
10
-41
-8
-21
-7
-46
-24
29
11
-22
4
12
8
-45
19
29
1
-29
-4
-28
-16
-38
14
39
35
-19
16
-12
-20
20
15
5
-37
38
4
4
8
-31
24
22
2
16
47
-48
6
32
18
10
36
-1
-23
46
20
-47
-17
32
-47
-8
9
26
-47
12
26
45
24
-4
8
-46
-29
13
9
48
11
36
-40
18
-28
41
40
47
-34
34
-28
-34
-41
-24
-42
0
48
-26
16
-48
6
26
5
15
-33
-33
-48
-3
-31
-29
-36
-47
-44
10
Saída esperada:
4.4

 */

// a função gets é implementada dentro do sistema para ler as entradas(inputs) dos dados
// Abaixo segue um exemplo de código que você pode ou não utilizar

const operacao = gets();
const isSum = operacao === "S";

const xL = 12, yL = 12;
let sum = 0.0, av = 0.0;

let linha = gets();

if(linha.length > 5)
{
  for (var y = 0; y < yL; y++) {
  
    if(av != 0.0) 
    {
      linha = gets();
    }
    let numeros = linha.trim().split(/[\s,]+/);
  
    for (var x = 0; x < xL; x++) {
      
      if(x < (xL - (y + 1)))
      {
        var valor = Number(numeros[x]);
        sum += valor;
        ++av;
      }
    }
  }
}
else
{

    
  for (var y = 0; y < yL; y++) {

    for (var x = 0; x < xL; x++) {
      
      if(av != 0.0) 
      {
        linha = gets().trim();
      }
      
      let valor = Number(linha);
    
      
      if(x < (xL - (y + 1)))
      {
        sum += valor;
        ++av;
      }
    }
  }
}

// console.log("sum: " + sum);
// console.log("av: " + av);

console.log((sum / (isSum ? 1 : av)).toFixed("1"));
