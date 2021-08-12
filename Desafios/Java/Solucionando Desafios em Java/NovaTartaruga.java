package desafios;

import java.util.*;

public class NovaTartaruga {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        //Não precisa usar dois Scanner
        //Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        while (sc.hasNext() == true ) {
            //for(int j = 0; j<1;j++) {

            int n = sc.nextInt();

            for (int i = 0; i < n; i++)
            {
                int valor = sc.nextInt();
                list.add(valor);
            }

            int maior = Collections.max(list);
            if (maior < 10) {
                System.out.println(1);
            }

            if (maior >= 10 && maior < 20) {
                System.out.println(2);
            }

            if (maior >= 20) {
                System.out.println(3);
            }

            list.clear();
        }
        sc.close();
    }
}
