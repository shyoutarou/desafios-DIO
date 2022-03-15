// https://web.digitalinnovation.one/coding/desafio-c-aceleracao-global-dev-16-capgemini/algorithm/area?back=/tests/cc6ca2ad-fd79-4108-b6d1-ab1af4ba81a4

// Área

/* Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.

Entrada
O arquivo de entrada contém três valores com um dígito após o ponto decimal.

Saída
O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima, sempre com mensagem correspondente e um espaço entre os dois pontos e o valor. O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.

 
Exemplos de Entrada	Exemplos de Saída
3.0 4.0 5.2

TRIANGULO: 7.800
CIRCULO: 84.949
TRAPEZIO: 18.200
QUADRADO: 16.000
RETANGULO: 12.000

12.7 10.4 15.2

TRIANGULO: 96.520
CIRCULO: 725.833
TRAPEZIO: 175.560
QUADRADO: 108.160
RETANGULO: 132.080
*/



using System; 
using System.Globalization;

class Problem {
 
    static void Main(string[] args) { 
		string[] line = Console.ReadLine().Split(' ');
        double A = double.Parse(line[0]);
        double B = double.Parse(line[1]);
        double C = double.Parse(line[2]);

        var Triangulo = A * C / 2.0;
        var circulo = 3.14159 * C * C;
        var trapezio = (A + B) / 2.0 * C;
        var quadrado = B * B;
        var retangulo = A * B;

        Console.WriteLine("TRIANGULO: " + Triangulo.ToString("F3", CultureInfo.InvariantCulture));
        Console.WriteLine("CIRCULO: " + circulo.ToString("F3", CultureInfo.InvariantCulture));
        Console.WriteLine("TRAPEZIO: " + trapezio.ToString("F3", CultureInfo.InvariantCulture));
        Console.WriteLine("QUADRADO: " + quadrado.ToString("F3", CultureInfo.InvariantCulture));
        Console.WriteLine("RETANGULO: " + retangulo.ToString("F3", CultureInfo.InvariantCulture));
    }
    
}





