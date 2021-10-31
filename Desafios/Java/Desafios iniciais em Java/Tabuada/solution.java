import java.io.IOException;
import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int N = leitor.nextInt();
    	
    	for (var i = 1; i <= 10; i++) {
          System.out.println(i + " x " + N + " = " + (N * i));
      }
	}
}