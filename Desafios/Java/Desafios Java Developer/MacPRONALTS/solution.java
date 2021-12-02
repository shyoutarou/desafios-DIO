import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int produtos=0, quantidade=0;
		double res=0, valor=0;
		int N = Integer.parseInt(sc.nextLine());
		
		for (int x=0 ; x<N ; x++){
			produtos = sc.nextInt();
			quantidade  = sc.nextInt();

      if (produtos == 1001){
          res += (1.50*quantidade);
      }else if (produtos == 1002){
          res+= (2.50*quantidade);
      }else if (produtos == 1003){
          res+= (3.50*quantidade);
      }else if (produtos == 1004){
          res+= (4.50*quantidade);
      }else if (produtos == 1005){
          res+= (5.50*quantidade);
      }
            
		}
		System.out.printf("%.2f\n",res);
		sc.close();
	}
}