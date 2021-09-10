import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class MaiorSubstring {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String s1, s2, min, max;
        while ((s1 = in.readLine()) != null) {
            s2 = in.readLine();
            if ( s1.length() > s2.length() ) {  
                max = s1;
                min = s2;
            } else {
                max = s2;
                min = s1;
            }
            int minLength = min.length();
            int maxS = minLength;
            boolean f = true;
            while (maxS > 0 && f) {
                int diff = minLength - maxS;
                for (int i = 0; i <= diff; i++) {
                    if (max.contains(min.substring(i, i + maxS))) {
                        f = false;
                        maxS++;
                        break;
                    }
                }
                maxS--;
            }
            System.out.println(maxS);
        }
        out.close();
    }

}