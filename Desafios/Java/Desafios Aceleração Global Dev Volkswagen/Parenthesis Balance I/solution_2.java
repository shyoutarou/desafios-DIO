// Parenthesis Balance I

/*
Considering an expression with parenthesis, print a message informing if the among of parenthesis is correct or incorrect, without considering the rest of the expression. Example:

a+(b*c)-2-a        is correct
(a+b*(2-c)-2+a)*2  is correct
when
(a*b-(2+c)         is incorrect
2*(3-a))           is incorrect
)3+b*(2-c)(        is incorrect
 
Resuming, all closing parenthesis must have an open parenthesis and it's not possible a closing parenthesis without a previous open parenthesis, and the quantity of closing and open parenthesis must be the same.
Input
The input file contains N expressions (1 <= N <= 10000), each one with up to 1000 characters. 
Output
The output must be correct or incorrect for each test case according with above rules.
 
Input Sample	Output Sample
a+(b*c)-2-a 
(a+b*(2-c)-2+a)*2 
(a*b-(2+c) 
2*(3-a))  
)3+b*(2-c)( 	correct
correct
incorrect
incorrect
incorrect

*/

import java.util.Scanner;
import java.util.Stack;

public class desafio3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		try {
			while (input.hasNext()) {

				String line = input.nextLine();
				Stack<Character> s = new Stack<>();

				for (Character ch : line.toCharArray()) {
					if (ch == '(')
					s.push(ch);

					if (ch == ')') {
						if (!s.empty()) {
							s.pop();
						} else {
							s.push(ch);
						}
					}
				}

				if (s.empty()) {
					System.out.println("correct");
				} else {
					System.out.println("incorrect");
				}
			}
		} 
		catch (Exception e) 
		{
		} 
		finally 
		{
			input.close();
		}
	}
}

