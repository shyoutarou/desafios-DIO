/* A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela abaixo:

Salário	          
0 - 400.00
400.01 - 800.00
800.01 - 1200.00
1200.01 - 2000.00
Acima de 2000.00

Percentual de Reajuste
15%
12%
10%
7%
4% */

const lines = gets();
const salary = Number(lines);
let percent;

if ( salary <= 400.00) {
  percent = 15;
} else if ( salary >= 400.01 && salary <= 800.00 ) {
  percent = 12;
} else if ( salary >= 800.01 && salary <= 1200.00  ) {
  percent = 10;
} else if ( salary >= 1200.01 && salary <= 2000.00 ) {
  percent = 7;
} else {
  percent = 4;
}

const reajust = (salary * percent) / 100;
const newSalary = salary + reajust;
console.log("Novo salario: " + newSalary.toFixed(2));
console.log("Reajuste ganho: " + reajust.toFixed(2));
console.log("Em percentual: " + percent + " %");