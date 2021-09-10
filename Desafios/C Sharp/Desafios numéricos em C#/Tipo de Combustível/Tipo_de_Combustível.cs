// Tipo de Combustível

/*
Desafio
Você recebeu desafio para determinar qual dos produtos é o preferêncial dos clientes de um posto de abastecimento de combustível. Para isso você deve escrever um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa será encerrado quando o código informado for o número 4.

Entrada
A entrada contém apenas valores inteiros e positivos.

Saída
Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo.

 
Exemplo de Entrada	
8
1
7
2
2
4

Exemplo de Saída
MUITO OBRIGADO
Alcool: 1
Gasolina: 2
Diesel: 0
*/

using System; 

class URI {

    static void Main(string[] args) { 
              var alcool = 0;
              var gasolina = 0;
              var diesel = 0;
            do
            {
            
                var numero = Convert.ToInt32(Console.ReadLine());
                
                switch (numero)
                {
                    case 1:
                     alcool++;
                      break;
                    case 2:
                      gasolina++;
                      break;                      
                    case 3:
                      diesel++; 
                      break;                      
                    case 4:
                      Console.WriteLine("MUITO OBRIGADO");
                      Console.WriteLine("Alcool: {0}", alcool);
                      Console.WriteLine("Gasolina: {0}", gasolina);
                      Console.WriteLine("Diesel: {0}", diesel);
                        return;
                    default:                       
                        continue;
                }
            }
       
         while (true);

    }

}