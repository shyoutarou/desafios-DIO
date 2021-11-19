import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i=0 ; i<n ; i++) {
			int x = sc.nextInt();
      double massa = Math.floor(Math.pow(2, x) / 12000);
      System.out.println(String.format("%.0f kg", massa));			
		}
		sc.close();
	}
}
