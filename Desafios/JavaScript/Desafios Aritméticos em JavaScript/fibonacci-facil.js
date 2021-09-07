// Fibonacci Fácil

/*
A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como série
de Fibonacci. Nessa sequência, cada número, depois dos 2 primeiros, é igual à
soma dos 2 anteriores. Escreva um algoritmo que leia um inteiro N (N < 46) e
mostre os N primeiros números dessa série.

•	Entrada

O arquivo de entrada contém um valor inteiro N (0 < N < 46).

•	Saída

Os valores devem ser mostrados na mesma linha, separados por um espaço em
branco. Não deve haver espaço após o último valor.

 
Exemplo de Entrada	
5

Exemplo de Saída
0 1 1 2 3

Dado de entrada:
2
Saída esperada:
0 1

Dado de entrada:
39
Saída esperada:
0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711 28657 46368 75025 121393 196418 317811 514229 832040 1346269 2178309 3524578 5702887 9227465 14930352 24157817 39088169


*/

const input = parseInt(gets());

const fib = n => {
  if (n <= 1) {
    return [0, 1];
  } else {
    const s = fib(n-1);
    s.push(s[s.length - 1] + s[s.length - 2]);
    return s;
  }
};

if (input === 1){
  console.log('0')
}
else if (input > 0 && input < 46){
  const index = Number(input) - 1;
  const sequence = fib(index).join(" ");
  console.log(sequence);
}