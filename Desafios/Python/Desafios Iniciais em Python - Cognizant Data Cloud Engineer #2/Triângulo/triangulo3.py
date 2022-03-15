# Triângulo

# Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo.
# Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:
# Perimetro = XX.X

# Em caso negativo, calcule a área do trapézio que tem A e B como base e C como
# altura, mostrando a mensagem
# Area = XX.X

# - Entrada

# A entrada contém três valores reais.

# - Saída

# O resultado deve ser apresentado com uma casa decimal.

#entradas
A, B, C = map(float, input().split())
#processos
saoLadosValidos = (A != 0 and B != 0 and C != 0) and (A < B + C) and (B < C + A) and (C < A + B)
if(saoLadosValidos):
    perimetro = A + B + C
    print("Perimetro =", "{:.1f}".format(perimetro))
else:
    area = ((A + B) / 2) * C
    print("Area =", "{:.1f}".format(area))
#saídas