/**********************************************************************************************
 Desafio
Duas motos (X e Y) partem em uma mesma direção. A moto X sai com velocidade constante de 60 Km/h e a moto Y sai com velocidade constante de 90 Km/h.

Em uma hora (60 minutos) a moto Y consegue se distanciar 30 quilômetros da moto X, ou seja, consegue se afastar um quilômetro a cada 2 minutos.

O seu desafio é ler a distância (em Km) e calcular quanto tempo leva (em minutos) para a moto Y tomar essa distância da outra moto.

Entrada
O arquivo de entrada contém um número inteiro K que representa a quantidade de quilômetro que que a moto Y deve estar da moto X.

Saída
Imprima o tempo necessário para a moto Y ficar com a quantidade K de quilômetro da moto X, seguido da mensagem " minutos".

 
Exemplo de Entrada	
30

Exemplo de Saída
60 minutos

Exemplo de Entrada	
110

Exemplo de Saída
220 minutos
 **********************************************************************************************/

using System;

class Desafio {
    static void Main() {
        int quilometros = Int32.Parse(Console.ReadLine());
        int minutos = quilometros * 2; // Digite aqui o calculo dos minutos
        Console.WriteLine(minutos + " minutos");
    }
}