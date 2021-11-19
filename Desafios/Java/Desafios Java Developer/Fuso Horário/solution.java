import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int horasaida = sc.nextInt();
    int tempoviagem = sc.nextInt();
    int fuso = sc.nextInt();
    
    int chegada = horasaida + tempoviagem + fuso;

    if (chegada > 24){
        chegada = chegada - 24;
    }else if (chegada < 0) {
        chegada = 24 - Math.abs(chegada);
    }else if (chegada == 24){
        chegada = 0;
    }

    System.out.println(chegada);

    sc.close();		
	}
}
