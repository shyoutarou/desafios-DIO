## Desafio

Uma escola está tentando tirar uma foto anual de todos os alunos. É solicitado que os alunos fiquem em uma única fila em linha em ordem crescente de acordo com a altura. Deixe essa ordenação ser representada pelo array de inteiros esperado onde esperado[i] é a altura esperada do iésimo aluno na fila.

## Entrada

Você recebe um array inteiro alturas que representa a ordem atual em que os alunos estão. Cada alturas[i] é a altura do i-ésimo aluno na linha (indexado a 0).

## Saída

Retorna o número de índices onde alturas[i] != esperado[i].

Exemplo 1

| Exemplo de Entrada | Exemplo de Saída|
| ---|--- |
| 6<br />1<br />1<br />4<br />2<br />1<br />3 | 3 |

Explicação: alturas: [1,1,4,2,1,3] esperado: [1,1,1,2,3,4] Os índices 2, 4 e 5 não coincidem.

Exemplo 2

| Exemplo de Entrada | Exemplo de Saída|
| ---|--- |
| 5<br />5<br />1<br />2<br />3<br />4 | 5 |

Explicação: alturas: [5,1,2,3,4] esperado: [1,2,3,4,5] Todos os índices não coincidem.

Exemplo 3

| Exemplo de Entrada | Exemplo de Saída|
| ---|--- |
| 5<br />1<br />2<br />3<br />4<br />5 | 0 |

Explicação: Todos os índices coincidem.

```bash
import java.util.*;
public class Solution{
     
// Abaixo segue um exemplo de código que você pode ou não utilizar

    //função para checar altura
    public static int heightChecker(int[] heights) {

	//TODO: Complete o código com uma solução possível

      
	//ordene o array (você pode utilizar algum método da classe de Arrays)

     
    }

public static void main(String[] args)
{ 
    
    //a classe Scanner auxilia na leitura dos dados de entrada
    Scanner input = new Scanner(System.in);
    
      int tamanho = input.nextInt();
      int[] heights = new int[tamanho];
    
      //preenchendo o array de alturas com as entradas
      for(                        ){
         
        }
    
 
    System.out.println(heightChecker(heights));
}
}


```