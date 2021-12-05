// Triângulo

/*

Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:

Perimetro = XX.X

Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem

Area = XX.X
Entrada
A entrada contém três valores reais.
Saída
O resultado deve ser apresentado com uma casa decimal.
 
Exemplo de Entrada	
6.0 4.0 2.0	

Exemplo de Saída
Area = 10.0

6.0 4.0 2.1	

Exemplo de Saída
Perimetro = 12.1

*/

let lines = gets().split('\n')

let line = lines.shift().split(" ");
let A = parseFloat(line[0]);
let B = parseFloat(line[1]);
let C = parseFloat(line[2]);
let maior;
let soma;
let triangulo;

if (A > B && A > C) maior = A;
else if (B > C) maior = B;
else maior = C;

if (maior == A) soma = B + C;
else if (maior == B) soma = A + C;
else soma = B + A;

if (soma > maior) triangulo = true;
else triangulo = false;

if (triangulo) {
    var perimetro = A + B + C; //complete com a sua lógica  
    console.log('Perimetro = ' + perimetro.toFixed(1));
} else {
    var areaTrapezio = ((A + B) * C) / 2;  //complete com a sua lógica   
    console.log('Area = ' + areaTrapezio.toFixed(1));
}
