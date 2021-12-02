import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int x1,y1,x2,y2;
		//se estiver na mesma linha ou mesma coluna ou mesma diagonal, gasta 1 movimento
		//se estiver em qualquer outra posição, a rainha gastará 2 movimentos!


	    while(true){
	    	x1 = sc.nextInt();
	    	y1 = sc.nextInt();
	    	x2 = sc.nextInt();
	    	y2 = sc.nextInt();
	    	
	    	boolean isDiagonal = (((x1 + y1) % 2 != 0) && ((x2 + y2) % 2 != 0)) || (((x1 + y1) % 2 == 0) && ((x2 + y2) % 2 == 0));
	    	boolean isLineOrColumn = x1 == x2 || y1 == y2;
	    	
	    	if(x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) break; //condição de parada
	    	if(x1 == x2 && y1 == y2)		// verifica se o destino é o mesmo da origem
	    		System.out.println("0");
	        else if( isLineOrColumn || isDiagonal)	// verifica se o destino fica na mesma linha, coluna ou diagonal
	        	System.out.println("1");
	        else 
	        	System.out.println("2");	
	    }
		sc.close();
	}
}

