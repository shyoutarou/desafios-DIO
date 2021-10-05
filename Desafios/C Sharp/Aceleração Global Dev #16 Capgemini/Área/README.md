## Desafio

Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.

## Entrada

O arquivo de entrada contém três valores com um dígito após o ponto decimal.

## Saída

O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima, sempre com mensagem correspondente e um espaço entre os dois pontos e o valor. O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.

| Exemplo de Entrada | Exemplo de Saída|
| ---|--- |
| 3.0 4.0 5.2 | TRIANGULO: 7.800<br />CIRCULO: 84.949<br />TRAPEZIO: 18.200<br />QUADRADO: 16.000<br />RETANGULO: 12.000 |
| 12.7 10.4 15.2 | TRIANGULO: 96.520<br />CIRCULO: 725.833<br />TRAPEZIO: 175.560<br />QUADRADO: 108.160<br />RETANGULO: 132.080 |


```bash
using System; 
 
class Problem {
 
    static void Main(string[] args) { 
		string[] line = Console.ReadLine().Split(' ');
        double a = double.Parse(line[0]);
        double b = double.Parse(line[1]);
        double c = double.Parse(line[2]);
		
		//Insira aqui o seu código 
		
        Console.WriteLine("TRIANGULO: {     }", triangulo);
        Console.WriteLine("CIRCULO: {     }", circulo);
        Console.WriteLine("TRAPEZIO: {    }", trapezio);
        Console.WriteLine("QUADRADO: {      }", quadrado);
        Console.WriteLine("RETANGULO: {      }", retangulo);
    }
    
}

```
