'''
Desafio
Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do jogo.

Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.

Entrada
Quatro números inteiros representando a hora de início e fim do jogo.

Saída
Mostre a seguinte mensagem: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)” .

 
Exemplo de Entrada	
7 8 9 10

Exemplo de Saída
O JOGO DUROU 2 HORA(S) E 2 MINUTO(S)


Exemplo de Entrada	
7 7 7 7

Exemplo de Saída
O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)


Exemplo de Entrada	
7 10 8 9

Exemplo de Saída
O JOGO DUROU 0 HORA(S) E 59 MINUTO(S)

PS: Se após concluir todas as atividades e cursos, você não conseguir gerar o certificado, 
entre novamente no desafio matemático, entregue novamente os 2 primeiros desafio e apenas 
execute os teste do 3º (sem entregá-lo). Está falhando no teste 13o.

'''

hi, mi, hf, mf = map(int, input().split())

h = hf - hi
m = mf - mi

if m >= 60:
  m -= 60
  h += 1
elif m < 0:
  m += 60
  h -= 1
  
if h > 24 or (h == 24 and m > 0):
  h -= 24
elif h < 0:
  h += 24

if h == 0 and m == 0:
  h = 24

if hf - hi >= 24 and hf >= 24:
  h = hf - hi

print(f"O JOGO DUROU {h} HORA(S) E {m} MINUTO(S)")