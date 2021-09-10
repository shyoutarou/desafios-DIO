import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class ValidadorSenhas {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String password;

        while ((password = br.readLine()) != null) {
            boolean isCorrectLength = password.length() >= 6 && password.length() <= 32;
            boolean containsPontuation = !password.matches("^(?=.*[a-zA-Z])(?=.*[0-9])[A-Za-z0-9]+$");
            boolean containsNumber = false;
            boolean containsUpperCase = false;
            boolean containsLowerCase = false;

            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) {
                    containsNumber = true;
                } else if (Character.isUpperCase(password.charAt(i))) {
                    containsUpperCase = true;
                } else if (Character.isLowerCase(password.charAt(i))) {
                    containsLowerCase = true;
                }
            }

            if (isCorrectLength && !containsPontuation && containsNumber && containsUpperCase && containsLowerCase) {
                System.out.println("Senha valida.");
            } else {
                System.out.println("Senha invalida.");
            }
        }
    }
}
