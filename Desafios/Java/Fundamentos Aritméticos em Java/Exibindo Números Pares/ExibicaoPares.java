import java.util.Scanner;

public class ExibicaoPares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada = sc.nextInt();
        for (int i = 2; i <= entrada; i = i + 2)
            System.out.println(i);
    }

}