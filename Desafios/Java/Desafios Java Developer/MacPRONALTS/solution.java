
import java.io.IOException;
import java.util.Scanner;

public class Problem {

	public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int N = leitor.nextInt();
    	for (int i = 0; i < N; i++) {
    	   int x = leitor.nextInt();
    	   
    	  	VERIFICA(x);
    	}
	}
	
  public static void VERIFICA(int x){
     
      if(x == 0)
          System.out.println("NULL");
      else if((x % 2) == 0){
          if(x < 0)
              System.out.println("EVEN NEGATIVE");
          else
              System.out.println("EVEN POSITIVE");
      }else{
          if(x < 0)
              System.out.println("ODD NEGATIVE");
          else
              System.out.println("ODD POSITIVE");
      }
  }
}
