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

if hf > hi and mf >= mi:
    print("O JOGO DUROU %i HORA(S) E %i MINUTO(S)" %(h,m))
elif hf > hi and mi > mf:
    print("O JOGO DUROU %i HORA(S) E %i MINUTO(S)" %(h-1,m+60))
elif hi > hf and mf >= mi:
    print("O JOGO DUROU %i HORA(S) E %i MINUTO(S)" %(h+24,m))
elif hi > hf and mi > mf:
    print("O JOGO DUROU %i HORA(S) E %i MINUTO(S)" %(h+23,m+60))
elif hf == hi and mf > mi:
    print("O JOGO DUROU 0 HORA(S) E %i MINUTO(S)" %m)
elif hf == hi and mf < mi:
    print("O JOGO DUROU 23 HORA(S) E %i MINUTO(S)" %(m+60))
elif hf == hi and mi == mf:
    print("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)")