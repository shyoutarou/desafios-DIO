## Desafio

Você recebeu desafio para determinar qual dos produtos é o preferêncial dos clientes de um posto de abastecimento de combustível. Para isso você deve escrever um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa será encerrado quando o código informado for o número 4.

## Entrada

A entrada contém apenas valores inteiros e positivos.

## Saída

Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo.

| Exemplo de Entrada | Exemplo de Saída|
| ---|--- |
| 8<br />1<br />7<br />2<br />2<br />4 | MUITO OBRIGADO<br />Alcool: 1<br />Gasolina: 2<br />Diesel: 0 |

```bash
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		
		
		int combustivel, stop=1;
		int soma1=0, soma2=0, soma3=0;

		
		while (stop != 2){
			if (stop == 1){
				combustivel = sc.nextInt();
				if (combustivel == 1){
					soma1 = soma1 + 1;
				}
				else if (          ){
					;
				}
				else if (           ){
					;
				}
				else if (            ){
					;
				}
				else {
					;
				}
			}
			if (stop == 2){
				System.out.println("MUITO OBRIGADO");
				System.out.printf("Alcool: %d\n",soma1);
				System.out.printf("Gasolina: %d\n",soma2);
				System.out.printf("Diesel: %d\n",soma3);
			}
		}
		sc.close();
	}
}


```