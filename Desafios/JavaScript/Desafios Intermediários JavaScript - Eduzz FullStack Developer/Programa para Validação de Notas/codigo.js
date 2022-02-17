/*
Desafio
O calendário escolar está passando bem rápido, devido a isso, as professoras de uma escola estão com dificuldade para calcular as notas dos alunos. Visando em resolver a situação, a diretora da escola contratou você para desenvolver um programa que leia as notas da primeira e da segunda avaliação de um aluno. Calcule e imprima a média semestral.

O programa só aceitará notas válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve ser validada separadamente.

No final deve ser impressa a mensagem “novo calculo (1-sim 2-nao)”, solicitando as professoras que informe um código (1 ou 2) indicando se ele deseja ou não executar o algoritmo novamente, (aceitar apenas os código 1 ou 2). Se for informado o código 1 deve ser repetida a execução de todo o programa para permitir um novo cálculo, caso contrário o programa deve ser encerrado.

Entrada
O arquivo de entrada contém vários valores reais, positivos ou negativos. Quando forem lidas duas notas válidas, deve ser lido um valor inteiro X . O programa deve parar quando o valor lido para este X for igual a 2.

Saída
Se uma nota inválida for lida, deve ser impressa a mensagem “nota invalida”. Quando duas notas válidas forem lidas, deve ser impressa a mensagem “media = ” seguido do valor do cálculo.

Antes da leitura de X deve ser impressa a mensagem "novo calculo (1-sim 2-nao)" e esta mensagem deve ser apresentada novamente se o valor da entrada padrão para X for menor do que 1 ou maior do que 2, conforme o exemplo abaixo.

A média deve ser impressa com dois dígitos após o ponto decimal.

--------------------------------------------------
Exemplo de Entrada		Exemplo de Saída
--------------------------------------------------
-3.5					nota invalida
3.5						nota invalida
11.0					media = 6.75
10.0					novo calculo (1-sim 2-nao)
4						novo calculo (1-sim 2-nao)
1						media = 8.50
8.0						novo calculo (1-sim 2-nao)
9.0
2
---------------------------------------------------
*/
let notas = [];
let nota = 0;
let opcao = 0;

while(opcao != 2)
{
  nota = parseFloat(gets());
  
  if((nota>=0) && (nota<=10))
  {
    notas.push(nota);
    
    if(notas.length == 2)
    {
      total = parseFloat(notas[0]) + parseFloat(notas[1])
      media = (total / 2).toFixed(2);
      console.log("media = "+ media)
      notas.length = 0;
      opcao = 0;
      
      while(opcao != 1)
      {
        
        if(opcao==2)
        {
          break
        }
        
        console.log('novo calculo (1-sim 2-nao)')
        opcao = +gets();
      }
    }
  }
  
  else
  {
    console.log('nota invalida');
  }  
}
