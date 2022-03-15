'''
Desafio
Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Para cada X e Y, escreva uma mensagem para indicar se tais valores foram digitados em ordem crescente ou decrescente.
Entrada
A entrada é composta por vários casos de teste. Cada caso contém dois valores inteiros: X e Y. A leitura deve ser encerrada caso sejam fornecidos os mesmos valores para X e Y.
Saída
Caso os valores tenham sido digitados na ordem crescente, imprima “Crescente”. No contrário, “Decrescente”.
 
Exemplo de Entrada	Exemplo de Saída
5 4
7 2
3 8
2 2	                Decrescente
                    Decrescente
                    Crescente

'''

#TODO: Complete os espaços em branco com uma possível solução para o problema.
X, Y = map(int, input().split())
while (X != Y): 
    floor = min(X, Y)
    top = max(X, Y)
    if (X < Y):  
        print("Crescente")
    elif (X > Y):  
        print("Decrescente")
    X, Y = map(int, input().split())
