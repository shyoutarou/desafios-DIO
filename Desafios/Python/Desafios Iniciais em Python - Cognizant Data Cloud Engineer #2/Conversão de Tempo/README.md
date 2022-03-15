## Desafio

Você terá o desafio de ler um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma loja, e informe-o expresso no formato horas:minutos:segundos.

## Entrada

O arquivo de entrada contém um valor inteiro N.

## Saída

Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.

| Exemplo de Entrada | Exemplo de Saída|
| ---|--- |
| 556 | 0:9:16 |
| 1 | 0:0:1 |

```bash
segundos = int(input())

minutos = #TODO Implementar a formula para calcular os minutos.
segundos = int(segundos - (minutos * 60))
horas = #TODO Implementar a formula para calcular as horas.
minutos = int(minutos - (horas * 60))

print("{}:{}:{}".format(horas, minutos, segundos))

```
	
	

