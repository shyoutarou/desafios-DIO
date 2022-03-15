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

import java.util.Stack;
import java.util.Scanner;

class ParenthesisBalance {
    public static String solution(String s) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        Stack<Character> stack = new Stack<>();
        if(s.length() == 0){
            return "incorrect";
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            }
            if (s.charAt(i) == ')') {
                if(stack.isEmpty()){
                    return "incorrect";
                }
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            return "correct";

        } else {
            return "incorrect";
        }
    }
}

public class TESTE_2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ParenthesisBalance checker = new ParenthesisBalance();

        while (leitor.hasNext()) {
            var line = leitor.next();
            System.out.println(checker.solution(line));
        }

        leitor.close();
    }
}

