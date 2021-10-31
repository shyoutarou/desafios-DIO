// Jumping Frog

/*
In each stage of the Jumping Frog game you must safely get your amphibian through a sequence of pipes of different heights to the rightmost pipe. Nevertheless the frog just survives if the height difference of consecutive pipes is at most the frog jump height. If the next pipe height is too high, the frog hits the pipe and fall. If the next pipe height is too low, the frog does not survive the fall. The frog always starts on the top of the leftmost pipe.
In this game the distance of pipes is irrelevant, which means that the frog always can reach the next pipe with a jump.
 
You must write a program that, given the pipe heights and the frog jump height, show if the game stage can be beaten or not.
Input
The input is given in two lines. The first one has two positive integer numbers P and N, the frog jump height and the number of pipes (1 ≤ P ≤ 5 and 2 ≤ N ≤ 100). The second line has N positive integer numbers that indicate the pipes heights ordered from left to right. There are no height greater than 10.
Output
The output is given in a single line. If the frog can reach the rightmost pipe write "YOU WIN". If the frog fails, write "GAME OVER".
Input Samples	Output Samples
5 10
1 3 6 9 7 2 4 5 8 3	YOU WIN
1 2
2 2	YOU WIN
1 2
1 3	GAME OVER

*/

import java.io.IOException;
import java.util.Scanner;

class JumpingFrog{
	int P, N;
	
	int Winner(int first, int second){
		if (first>second){
			if (first-second <= P)
				return 0;
			else 
				return 1;
		}
		else{
			if (second-first <= P)
				return 0;
			else 
				return 1;
		}
	}
}
    
public class Main {

    public static void main(String[] args) throws IOException {
 
      Scanner sc=new Scanner(System.in);
  		JumpingFrog jf= new JumpingFrog();
  		
  		int i, Store[], WinOrNot = 0;;
  		
  		jf.P = sc.nextInt();
  		jf.N = sc.nextInt();
  		
  		Store = new int [jf.N];
  		
  		Store[0] = sc.nextInt();
  		for (i=1; i<jf.N; i++){
  			Store[i] = sc.nextInt();
  			if (WinOrNot == 0)
  				WinOrNot = jf.Winner(Store[i-1], Store[i]);
  		}
  		
  		if (WinOrNot == 0)
  			System.out.println("YOU WIN");
  		else
  			System.out.println("GAME OVER");
  		
  		System.exit(0);
 
 }
}
