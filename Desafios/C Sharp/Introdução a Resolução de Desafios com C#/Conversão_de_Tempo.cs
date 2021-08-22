/*
Conversão de Tempo

Desafio
Você terá o desafio de ler um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma loja, e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.

 
Exemplo de Entrada	
556

Exemplo de Saída
0:9:16

Exemplo de Entrada
1

Exemplo de Saída
0:0:1

*/

using System;

    class MinhaClasse {
        static void Main(string[] args) {
            var timeInSeconds = int.Parse(Console.ReadLine());

            TimeSpan timespan = TimeSpan.FromSeconds(timeInSeconds);
            var hours = timespan.Hours;
            var minutes = timespan.Minutes;
            var seconds =   timespan.Seconds;

            Console.WriteLine($"{hours}:{minutes}:{seconds}");
        }
    }