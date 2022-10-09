/* Desafio
Leia um valor inteiro entre 1 e 12, inclusive. Correspondente a este valor, deve ser apresentado como resposta o mês do ano por extenso, em inglês, com a primeira letra maiúscula.
Entrada
A entrada contém um único valor inteiro.
Saída
Imprima por extenso o nome do mês correspondente ao número existente na entrada, com a primeira letra em maiúscula.
 
Exemplo de Entrada	Exemplo de Saída
4					April
 */

// a função gets é implementada dentro do sistema para ler as entradas(inputs) dos dados e a função print para imprimir a saída (output) de dados e já pula uma linha ("\n")
// Abaixo segue um exemplo de código que você pode ou não utilizar

let lines = gets().split('\n');

let month = parseInt(lines.shift());

let months = [
  'none', 
  'January',
  'February', 
  'March', 
  'April', 
  'May', 
  'June', 
  'July', 
  'August', 
  'September', 
  'October', 
  'November',
  'December'
//TODO: Complete os espaços em branco com uma possível solução para o desafio

  ]

print(months[month]);
