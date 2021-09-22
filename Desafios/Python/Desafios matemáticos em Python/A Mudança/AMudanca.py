'''
Desafio
Hermione está criando um novo Vira Tempo especialmente para programadores. É impressionante as vantagens que ele oferece e o conforto pra codar que ele tem. O artefato ainda está em desenvolvimento e ele prometeu consertar os bugs e colocar uns apetrechos melhores e, em troca, pediu um sistema simples para o modo Standy Bay. O problema é que o artefato por si só sempre tem o ângulo de inclinação do Sol/Lua(de 0 a 360). Valendo um Vira Tempo, caso deseja aceitar: dada em grau da inclinação do Sol/Lua, informe em qual período do dia ele se encontra.

Entrada
A entrada contém um número inteiro M (0 ≤ M ≤ 360) representando o grau do Sol/Lua. Como a posição muda constantemente seu programa receberá diversos casos a cada segundo(EOF).

Saída
Imprima uma saudação referente ao período do dia que ele se encontra: "Boa Tarde!!", "Boa Noite!!", "Bom Dia!!" e "De Madrugada!!".

 
Exemplo de Entrada	
0
45
360
90
180

Exemplo de Saída
Bom Dia!!
Bom Dia!!
Bom Dia!!
Boa Tarde!!
Boa Noite!!

'''

while True:
    try:

        graus = int(input())
        
        if graus == 360 or graus >= 0 and graus < 90:
          msg = 'Bom Dia!!'
        elif graus >= 90 and graus < 180:
          msg = 'Boa Tarde!!'
        elif graus >= 180 and graus < 270:
          msg = 'Boa Noite!!'
        else :
          msg = 'De Madrugada!!'
        
        print(msg)  


    except EOFError:
        break