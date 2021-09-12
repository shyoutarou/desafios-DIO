'''
Ramsay: "(...) você vence se conseguir adivinhar quem eu sou e por que estou torturando você."

Theon deve pensar rápido e adivinhar quem é seu algoz! Entretanto, Ramsay já decidiu o que ele irá fazer depois que Theon der sua resposta.

Theon pode dizer que seu algoz é alguma dentre N pessoas. Considere que as pessoas são numeradas de 1 a N. Se Theon responder que seu algoz é a pessoa i, Ramsay irá atingi-lo Ti vezes.

Sua tarefa é ajudar Theon a determinar qual deve ser sua resposta de forma a minimizar o número de vezes que ele será atingido.

Entrada
A primeira linha contém um inteiro N (1 ≤ N ≤ 100). A segunda linha contém N inteiros T1, T2, ..., TN (0 ≤ Ti ≤ 20).

Saída
Imprima uma linha contendo o número da pessoa que Theon deve dizer ser seu algoz. Se existe mais de uma resposta possível, imprima a menor.

 
Exemplos de Entrada	
3
8 0 7

Exemplos de Saída
2


Exemplos de Entrada	
2
1 1

Exemplos de Saída
1
'''

N = int(input())
persons = list(map(int, input().split()))
lowest = persons[0]
lowest_pos = 1

for i in range(N):
    if persons[i] < lowest:             
        lowest = persons[i]
        lowest_pos = i + 1
        
print(lowest_pos)