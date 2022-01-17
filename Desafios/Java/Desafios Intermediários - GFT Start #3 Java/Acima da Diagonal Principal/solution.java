import java.io.IOException;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

      //digite o seu código
      int contElementosSoma = 0;
      double soma = 0;
      char O = leitor.next().toUpperCase().charAt(0);
      double[][] M = new double[12][12];
      
      for (int i = 0; i < 12; ++i) {
      	for (int j = 0; j < 12; ++j) {
      		M[i][j] = leitor.nextDouble();
      	}
      }
      
      for (int i = 0; i <= 10; ++i) {
      	for (int j = i+1; j <= 11; ++j) {
      		soma += M[i][j];
      		contElementosSoma++;
      	}
      }
  
      if (O == 'M') soma /= contElementosSoma;
        
    	System.out.println(String.format("%.1f", soma));
    }
	
}
