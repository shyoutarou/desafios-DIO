package desafios;

/*
Neste problema você é solicitado a escrever um simples programa de conversão de base. A entrada será um valor hexadecimal ou decimal.
Você deverá converter cada valor da entrada.
Se o valor for hexadecimal, você deve convertê-lo para decimal e vice-versa.
O valor hexadecimal inicia sempre com 0x ou tambem e aquele valor cuja segunda casa contem a letra 'x'.

Entrada
A entrada contém vários casos de teste. Cada linha de entrada, com exceção da última, contém um número não-negativo, decimal ou hexa. O valor decimal será menor ou igual a 231. A última linha contém um número negativo que não deve ser processado, indicando o encerramento do programa.

Saída
Para cada linha de entrada (exceto a última) deve ser produzido uma linha de saída. Todo número hexadecimal deve ser precedido na saída por '0x' (zero xis).


Exemplo de Entrada
4
7
44
0x80685
-1

Exemplo de Saída
0x4
0x7
0x2C
525957



 */

import java.util.Locale;
import java.util.Scanner;

public class ConversaoSimplesdeBase {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String read;

        while (leitor.hasNext()) {
            read = leitor.next();
            int value;

            if (read.length() > 2 && read.charAt(1) == 'x') {
                value = Integer.parseInt(read.substring(2), 16);
                System.out.println(value);
            } else if (Integer.parseInt(read) == -1) {
                System.exit(0);
            } else {
                value = Integer.parseInt(read);
                System.out.println("0x" + (Integer.toHexString(value)).toUpperCase(Locale.ROOT));
            }
        }
    }
}
