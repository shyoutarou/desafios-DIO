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

num1, num2, num3 = input().split(" ")
num1, num2, num3 = float(num1), float(num2), float(num3)

if abs(num2 - num3) < num1 < num2 + num3 and abs(num1 - num3) < num2 < num1 + num3 and abs(num1 - num2) < num3 < num1 + num2:
    print(f"Perimetro = {num1+num2+num3:.1f}")
else:
    print(f"Area = {(num1+num2)/2*num3:.1f}")