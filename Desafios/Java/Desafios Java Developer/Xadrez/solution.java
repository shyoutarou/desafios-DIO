import java.io.IOException;
import java.util.Scanner;

public class Xadrez {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int L = leitor.nextInt();
        int C = leitor.nextInt();
        if (L % 2 == C % 2) 
        	System.out.println(1);
        else
        	System.out.println(0);
    }
	
}
