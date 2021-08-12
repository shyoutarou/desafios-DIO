package desafios;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class QuantidadeNumerosPositivos {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        String line = null;

        while( (line = br.readLine()) != null) {

            if(line.equals(""))
            {
                break;
            }

            StringTokenizer tokens = new StringTokenizer(line);
            while (tokens.hasMoreTokens()) {
                var valor = Double.parseDouble(tokens.nextToken());
                if (valor > 0) {
                    i++;
                }
            }
        }

        System.out.println(i + " valores positivos" );
    }
}
