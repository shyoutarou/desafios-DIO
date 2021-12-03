
/*
Desafio
O seu instrutor de lógica de programação, Damilson Bonetti, quer que você desenvolva uma tela com as seguintes características:
1.	Conter 39 traços horizontais ( - ) na primeira linha;
2.	Conter um traço vertical ( | ) embaixo do primeiro traço e do trigésimo nono traço da primeira linha, preencher no meio com espaço em branco;
3.	Repita o procedimento 2 quatro vezes;
4.	Repita o procedimento 1.
No final deve ficar igual a imagem a seguir:
--------------------------------------- (39 traços)
|                                     |
|                                     |
|                                     |
|                                     |
|                                     |
--------------------------------------- (39 traços)
Entrada
Não há.
Saída
A saída será impresso conforme a figura acima.
 
Exemplo de Entrada	Exemplo de Saída
 	---------------------------------------
|                                     |
|                                     |
|                                     |
|                                     |
|                                     |
---------------------------------------



*/

public class Main {
	public static void main(String[] args) {
        for (int i = 0; i < 39; i++) {
            System.out.print("-");

        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 39; j++) {

            if (j == 0 || j == 38){
                System.out.print("|");
            } else System.out.print(" ");

            }
            System.out.println();
        }


        for (int i = 0; i < 39; i++) {
            System.out.print("-");

        }
	}
}

