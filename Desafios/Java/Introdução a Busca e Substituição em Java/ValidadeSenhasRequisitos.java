/* Desafio
Pedro e Fernando são os desenvolvedores em uma stratup e vão desenvolver o novo sistema de cadastro, e pediram a sua ajuda. Sua task é fazer o código que valide as senhas que são cadastradas, para isso você deve atentar aos requisitos a seguir:

A senha deve conter, no mínimo, uma letra maiúscula, uma letra minúscula e um número;
A mesma não pode ter nenhum caractere de pontuação, acentuação ou espaço;
Além disso, a senha pode ter de 6 a 32 caracteres.
Entrada
A entrada contém vários casos de teste e termina com final de arquivo. Cada linha tem uma string S, correspondente a senha que é inserida pelo usuário no momento do cadastro.

Saída
A saída contém uma linha, que pode ser “Senha valida.”, caso a senha tenha cada item dos requisitos solicitados anteriormente, ou “Senha invalida.”, se um ou mais requisitos não forem atendidos.

 
Exemplo de Entrada
Digital Innovation One

AbcdEfgh99

DigitalInnovationOne123

Digital Innovation One 123

Aass9

Aassd9

Exemplo de Saída

Senha invalida.

Senha valida.

Senha valida.

Senha invalida.

Senha invalida.

Senha valida.
*/ 
import java.util.*;

public class ValidadeSenhasRequisitos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        boolean passwordState = false;
        final String SENHA_VALIDA = "Senha valida.";
        final String SENHA_INVALIDA = "Senha invalida.";

        while (scanner.hasNextLine()) {

            password = scanner.nextLine();
            
            passwordState = checkPassword(password);

            if(passwordState){
                System.out.println(SENHA_VALIDA);
            }else{
                System.out.println(SENHA_INVALIDA);
            }
            
        }

        scanner.close();
    }

    static boolean checkPassword(String password) {

        if (password.length() < 6 || password.length() > 32) {
            return false;
        }

        char[] passChars = password.toCharArray();

        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasNumber = false;

        for (char c : passChars) {
            //System.out.println(c);
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isDigit(c)) {
                hasNumber = true;
            } else {
                return false;
            }
        }

        

        if (hasLower && hasUpper && hasNumber) {
            return true;
        }

        return false;
    }

}