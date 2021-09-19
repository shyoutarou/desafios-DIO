// Desafios Aritméticos Intermediários em C#
// Notas e Moedas

using System; 

class minhaClasse {

    static void Main(string[] args) { 

            double valor;
            int inteiro, auxNotas, auxMoedas;

            valor = Convert.ToDouble(Console.ReadLine());

            inteiro = (int)valor;
            valor *= 100;
            auxMoedas = (int)valor;
            auxNotas = inteiro;

            Console.WriteLine("NOTAS:");
            Console.WriteLine("{0} nota(s) de R$ 100.00", inteiro/100);
            auxNotas = (inteiro % 100);
            
            inteiro = auxNotas;
            Console.WriteLine("{0} nota(s) de R$ 50.00", inteiro/50);
            auxNotas = (inteiro % 50);


            inteiro = auxNotas;
            Console.WriteLine("{0} nota(s) de R$ 20.00", inteiro/20);
            auxNotas = (inteiro % 20);


            inteiro = auxNotas;
            Console.WriteLine("{0} nota(s) de R$ 10.00", inteiro/10);
            auxNotas = (inteiro % 10);
  
            inteiro = auxNotas;          
            Console.WriteLine("{0} nota(s) de R$ 5.00", inteiro/5);
            auxNotas = (inteiro % 5);

            inteiro = auxNotas;          
            Console.WriteLine("{0} nota(s) de R$ 2.00", inteiro/2);
            auxNotas = (inteiro % 2);

            Console.WriteLine("MOEDAS:");
            Console.WriteLine("{0} moeda(s) de R$ 1.00", auxNotas / 1);
            auxMoedas %= 100;
            
            Console.WriteLine("{0} moeda(s) de R$ 0.50", auxMoedas/50);
            auxNotas = (auxMoedas % 50);

            auxMoedas = auxNotas;
            Console.WriteLine("{0} moeda(s) de R$ 0.25", auxMoedas/25);
            auxNotas = (auxMoedas % 25);
            
            auxMoedas = auxNotas;
            Console.WriteLine("{0} moeda(s) de R$ 0.10", auxMoedas/10);
            auxNotas = (auxMoedas % 10);
  
            auxMoedas = auxNotas;
            Console.WriteLine("{0} moeda(s) de R$ 0.05", auxMoedas/5);
            auxNotas = (auxMoedas % 5);
  
            auxMoedas = auxNotas;
            Console.WriteLine("{0} moeda(s) de R$ 0.01", auxMoedas/1);
            auxNotas = (auxMoedas % 5);
    }

}