## Desafio

Paulinho tem em suas mãos um novo problema. Agora a sua professora lhe pediu que construísse um programa para verificar, à partir de dois valores muito grandes A e B, se B corresponde aos últimos dígitos de A.

## Entrada

A entrada consiste de vários casos de teste. A primeira linha de entrada contém um inteiro N que indica a quantidade de casos de teste. Cada caso de teste consiste de dois valores A e B maiores que zero, cada um deles podendo ter até 1000 dígitos.

## Saída

Para cada caso de entrada imprima uma mensagem indicando se o segundo valor encaixa no primeiro valor, confome exemplo abaixo.

| Exemplo de Entrada | Exemplo de Saída|
| ---|--- |
|4<br />56234523485723854755454545478690 78690<br />5434554 543<br />1243 1243<br />54 64545454545454545454545454545454554  | encaixa<br />nao encaixa<br />encaixa<br />nao encaixa |

```bash
#TODO: Complete os espaços em branco com uma solução possível para o problema.
n = int(input())
for i in range(n):
    x, y = input().split()
    teste = 0
    cont = 0
    if       :
        print("nao encaixa")
 
    else:
        for j in range(      ):
            teste -= 1
            if x[teste] == y[teste]:
                cont += 1
 
        if        :
            print("encaixa")
 
        else:
            print("nao encaixa")


```
	
	

