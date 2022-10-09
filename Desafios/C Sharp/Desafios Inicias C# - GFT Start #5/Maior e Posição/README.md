## Desafio

Você recebeu o desafio de ler 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 valores lidos.

## Entrada

O arquivo de entrada contém 100 números inteiros, positivos e distintos.

## Saída

Apresente o maior valor lido e a posição de entrada, conforme exemplo abaixo.

| Exemplo de Entrada | Exemplo de Saída|
| ---|--- |
| 2<br />113<br />45<br />34565<br />6<br />...<br />8  | 34565<br />4 |

```bash
using System; 

class TESTE {

    static void Main(string[] args) { 

            int n;
            int maior = 0;
            int posicao = 0;
            for(int i = 1; i <= 100 ; i++)
            {
                n = Convert.ToInt32(Console.ReadLine());
                if(n > maior)
                {
                    maior =           ;
                    posicao =       ;     //Complete o código nos espaços em branco
                } 
            }
            Console.WriteLine(maior);
            Console.WriteLine(posicao);

    }

}
```
