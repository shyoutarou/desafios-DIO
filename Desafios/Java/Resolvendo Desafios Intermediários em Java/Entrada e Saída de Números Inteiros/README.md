## Desafio

Seu ex-colega de sala pediu que você desenvolvesse um programa com as seguintes características:

1. Crie três variáveis para armazenar números inteiros;
2. Leia o primeiro número, que pode ser um valor na faixa de: -10000 ≤ A ≤ 10000;
3. Leia o segundo número, que pode ser um valor na faixa de: 0 ≤ B ≤ 99;
4. Leia o terceiro número, que pode ser um valor na faixa de: 0 ≤ C ≤ 999;
5. Imprima a letra A, um espaço em branco, o sinal de igual, um espaço em branco, o número armazenado na primeira variável, uma virgula, um espaço em branco, a letra B, um espaço em branco, o sinal de igual, um espaço em branco, o número armazenado na segunda variável, uma virgula, um espaço em branco, a letra C, um espaço em branco, o sinal de igual, um espaço em branco, o número armazenado na terceira variável. Não esqueça de pular linha;
6. Repita o procedimento 5, colocando o número em um espaçamento de 10 dígitos e justificado a direita;
7. Repita o procedimento 5, colocando o número em um espaçamento de 10 dígitos e preenchido com zeros;
8. Repita o procedimento 5, colocando o número em um espaçamento de 10 dígitos e justificado a esquerda.

## Entrada

A entrada consiste vários arquivos de teste. Em cada arquivo de teste tem três linhas. Na primeira linha tem um inteiro A (-10000 ≤ A ≤ 10000). Na segunda linha tem um inteiro B (0 ≤ B ≤ 99). Na terceira linha tem um inteiro C (0 ≤ C ≤ 999). Conforme mostrado no exemplo de entrada a seguir.

## Saída

Para cada arquivo da entrada, terá um arquivo de saída. O arquivo de saída tem quatro linhas da forma descrita no item 5. Conforme mostra o exemplo de saída a seguir.

| Exemplo de Entrada | Exemplo de Saída|
| ---|--- |
| 11234<br />12<br />123 | A = 1234, B = 12, C = 123<br />A =       1234, B =         12, C =        123<br />A = 0000001234, B = 0000000012, C = 0000000123<br />A = 1234      , B = 12        , C = 123        |
| 4567<br />78<br />789 | A = 4567, B = 78, C = 789<br />A =       4567, B =         78, C =        789<br />A = 0000004567, B = 0000000078, C = 0000000789<br />A = 4567      , B = 78        , C = 789        |
| -9991<br />01<br />001 | A = -9991, B = 1, C = 1<br />A =      -9991, B =          1, C =          1<br />A = -000009991, B = 0000000001, C = 0000000001<br />A = -9991     , B = 1         , C = 1    |


```bash
import java.io.IOException;
import java.util.Scanner;

public class Teste  {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int C = leitor.nextInt();
        
        System.out.printf("A = %d, B = %d, C = %d\n", A , B, C);
     
       //implemente seu código aqui

    }
	
}
```

