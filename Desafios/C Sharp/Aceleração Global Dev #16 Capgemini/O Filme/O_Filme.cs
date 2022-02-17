// https://web.digitalinnovation.one/coding/desafio-c-aceleracao-global-dev-16-capgemini/algorithm/o-filme?back=/tests/cc6ca2ad-fd79-4108-b6d1-ab1af4ba81a4

// O Filme

/* Bem-vindo à 3ạ Maratona de Programação Júnior da UFFS. Esperamos sinceramente que as próximas horas sejam muito produtivas para você, que você faça muitos balões e que, acima de tudo, você se divirta! Lembre que você sempre pode pedir esclarecimento quando não entender direito a descrição de um problema. Lembre também que às 17:30 os juízes automáticos serão desligados e a competição entrará em modo blind, de modo que todas as submissões neste período só começarão a ser julgadas às 18:10. Por favor, fique conosco até o fim da competição, trabalhando nas soluções dos problemas até o último minuto, pois, enquanto a competição ainda está ocorrendo, sempre há esperança!

E foi esperança que motivou a Vovó Zazá, uma senhora de 72 anos, a realizar seu sonho de começar um curso universitário. Ela está fascinada com tudo o que diz respeito à Universidade: com as aulas, com a biblioteca, com os projetos de pesquisa e extensão, com o restaurante universitário, mas especialmente com a carteirinha de estudante que ela pode utilizar para pagar meia entrada no cinema. Semana passada, Vovó Zazá e seus colegas de turma foram ao cinema assistir a um filme, mas ficaram estarrecidos com o aumento do preço do ingresso. Revoltados, eles decidiram fazer uma manifestação contra o sistema capitalista opressor, agendada para amanhã na Praça General Bertaso. Vovó Zazá quer colaborar com o movimento fazendo um cartaz com a seguinte palavra de ordem:

QUE ABSURDO! O PREÇO DO CINEMA SUBIU … % !!

Mas ela não é muito boa em Matemática, e está solicitando sua ajuda para calcular a porcentagem de que precisa para completar o cartaz.

Entrada
A única linha da entrada consiste de dois valores A e B (0.00 < A ≤ B ≤ 1000.00), os quais, fornecidos com exatos dois dígitos após o ponto separador decimal, representam respectivamente o valor antigo e o valor novo do ingresso do cinema.

Saída
A única linha da saída deve consistir unicamente de um valor, que represente como uma porcentagem o aumento do valor do ingresso. O valor deve ser acompanhado do símbolo % e conter exatos dois dígitos após o ponto separador decimal.

 
Exemplos de Entrada	Exemplos de Saída
20.00 30.00

50.00%

 
50.00 100.00

100.00%

 
10.00 10.00

0.00%

3ạ Maratona de Programação Júnior da UFFS
*/



using System; 
 
class Problem {
     
    static void Main(string[] args) { 
        string[] input = Console.ReadLine().Split(' ');

        double A = double.Parse(input[0]);
        double B = double.Parse(input[1]);
        double aumento = ((B - A) / A) * 100;

        Console.WriteLine("{0:F2}%", aumento);

    }
    
}



