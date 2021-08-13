package desafios;

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class suaClasseAqui {
  public final static int MAX = 200;

	public static void main(String[] args) {
		String8  = new String8(MAX);

    //insira sua resolução aqui


				if( ||  ||  ||  == 0) { //complete o if de acordo com suas variaveis
					System.out.println("Senha invalida.");
				} else {
					System.out.println("Senha valida.");
				}
			} else {
				System.out.println("Senha invalida.");
			}
		}
	}
}

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

import java.io.IOException;
import java.util.*;
import java.util.function.IntPredicate;
import java.util.regex.Pattern;

public class ValidacaoSenha {

    public final static int MAX = 200;

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext() == true ) {

            var linha = sc.nextLine();

            if( linha != null || linha != "" ) {
                if( !isValid(linha) || linha.length() < 6 || linha.length() > 32) {
                    System.out.println("Senha invalida.");
                } else {
                    System.out.println("Senha valida.");
                }
            } else {
                System.out.println("Senha invalida.");
            }
        }
        sc.close();

	}

    public static boolean isValid(String value) {
        return containsLowerCase(value) &&
                containsUpperCase(value) &&
                containsNumber(value) &&
                NOTcontainsWhitespace(value) &&
                NOTcontainsSpecialCharacters(value) ;
    }

    private static boolean containsLowerCase(String value) {
        return contains(value, i -> Character.isLetter(i) && Character.isLowerCase(i));
    }

    private static boolean containsUpperCase(String value) {
        return contains(value, i -> Character.isLetter(i) && Character.isUpperCase(i));
    }

    private static boolean containsNumber(String value) {
        return contains(value, Character::isDigit);
    }

    private static boolean NOTcontainsWhitespace(String value) {
        return !contains(value, Character::isWhitespace);
    }

    private static boolean NOTcontainsSpecialCharacters(String value) {
        // Declare pattern of special characters
        var checkPattern = Pattern.compile("[^a-zA-Z0-9]");
        // Declare matcher to match with String
        var match = checkPattern.matcher(value);
        // Use find( ) function to check
        return !(match.find());
    }

    private static boolean contains(String value, IntPredicate predicate) {
        return value.chars().anyMatch(predicate);
    }
}
