## Desafio

Considering an expression with parenthesis, print a message informing if the among of parenthesis is correct or incorrect, without considering the rest of the expression. Example:

a+(b*c)-2-a        is correct
(a+b*(2-c)-2+a)*2  is correct
when
(a*b-(2+c)         is incorrect
2*(3-a))           is incorrect
)3+b*(2-c)(        is incorrect
 
Resuming, all closing parenthesis must have an open parenthesis and it's not possible a closing parenthesis without a previous open parenthesis, and the quantity of closing and open parenthesis must be the same.

## Entrada

The input file contains N expressions (1 <= N <= 10000), each one with up to 1000 characters. 

## Saída

The output must be correct or incorrect for each test case according with above rules.

| Exemplo de Entrada | Exemplo de Saída|
| ---|--- |
| a+(b*c)-2-a  | correct |
| (a+b*(2-c)-2+a)*2  | correct |
| (a*b-(2+c)  | incorrect |
| 2*(3-a))    | incorrect |
| )3+b*(2-c)(   | incorrect |

```bash
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
       //escreva o seu código aqui
    	
	}

}

```
