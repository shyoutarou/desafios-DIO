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

import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
        Scanner sc = new Scanner(System.in);

        int combustivel = 0;
        int alcool=0, gasolina=0, diesel=0;
        
        while (combustivel != 4){
            combustivel = sc.nextInt();
            if (combustivel == 1){
                alcool++;
            }
            else if (combustivel == 2){
                gasolina++;
            }
            else if (combustivel == 3){
                diesel++;
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d\n",alcool);
        System.out.printf("Gasolina: %d\n",gasolina);
        System.out.printf("Diesel: %d\n",diesel);

        sc.close();
	}
}

