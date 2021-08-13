/*
 Desafio
Você está ajudando a desenvolver um sistema de gerenciamento de weblog chamado Weblogger Brasil. Embora Weblogger Brasil coloque todo o conteúdo direto no website em HTML, nem todos autores apreciam usar tags HTML em seus textos. Para tornar a vida deles mais fáceis, Weblogger Brasil oferece uma sintaxe simples chamada atalhos para obter alguns efeitos textuais em HTML. Sua tarefa é, dado um documento escrito com atalhos, traduzi-lo para o HTML apropriado.


Um atalho é usado para colocar texto em itálico. HTML faz isto com as tags <i> e </i>, mas no Weblogger Brasil um autor pode simplesmente colocar um pedaço de texto entre dois caracteres de sublinhado, '_'. Portanto, onde um autor escreve

  Você _deveria_ ver a foca no zoologico!
                
Weblogger Brasil vai publicar o seguinte:

  Você <i>deveria</i> ver a foca no zoologico!
                
Outro atalho serve para colocar texto em negrito, o que, em HTML, é feito com as tags <b> e </b>. Weblogger Brasil permite aos autores fazer o mesmo com pares do caractere asterisco, '*'. Quando um autor escreve o texto

  Marque a conta *a receber* para *paga*.
                
ele vai sair no website assim:

  Marque a conta <b>a receber</b> para <b>paga</b>.
                
Entrada
A entrada contem vários casos de teste. Cada caso de teste é composto por uma linha que contem uma string texto, com zero ou mais usos dos atalhos itálico e negrito. Cada texto tem de 1 a 50 caracteres, inclusive. Os únicos caracteres permitidos no texto são os caracteres alfabéticos (de 'a' a 'z' e de 'A' a 'Z'), o sublinhado ('_'), o asterisco ('*'), o caractere de espaço e os símbolos de pontuação ',', ';', '.', '!', '?', '-', '(' e ')'. O caractere sublinhado '_' ocorre no texto um número par de vezes. O asterisco '*' também aparece um número par de vezes no texto. Nenhuma substring do texto entre um par de sublinhados ou entre um par de asteriscos pode conter outros sublinhados ou asteriscos, respectivamente.

Saída
Para cada linha de entrada seu programa deve gerar uma linha de saída com o texto traduzido para HTML como demonstrado nos exemplos abaixo. Para tornar itálico um pedaço de texto no HTML, você deve iniciar este pedaço com a tag <i> e terminá-lo com a tag </i>. Para texto em negrito, inicie com <b> e termine com </b>.

 
Exemplo de Entrada	Exemplo de Saída
Você _deveria_ ver a foca no zoologico!
Marque a conta *a receber* para *paga*.

Você <i>deveria</i> ver a foca no zoologico!
Marque a conta <b>a receber</b> para <b>paga</b>.
*/

import java.util.*;

public class Weblogger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        StringBuilder HTMLLine = new StringBuilder();
        int countAsterisk = 0;
        int countUnderline = 0;
        ArrayList<String> outputs = new ArrayList<>();

        while (true) {

            String replaceStr = null;
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == '*') {
                    replaceStr = "<b>" + countAsterisk++;
                } else if (line.charAt(i) == '_') {
                    replaceStr = "<i>" + countUnderline++;
                } else {
                    replaceStr = String.valueOf(line.charAt(i));
                }

                HTMLLine.append(replaceStr);
            }

            line = HTMLLine.toString();
            line = line.replaceAll("<i>[0-9]*[02468]", "<i>").replaceAll("<i>[0-9]*[13579]", "</i>")
                    .replaceAll("<b>[0-9]*[02468]", "<b>").replaceAll("<b>[0-9]*[13579]", "</b>");

            outputs.add(line);

            if (scanner.hasNext()) {
                line = scanner.nextLine();
            } else {
                break;
            }
            countAsterisk = 0;
            countUnderline = 0;
            HTMLLine = new StringBuilder();
        }

        outputs.forEach(System.out::println);
        System.out.println();
        scanner.close();
    }
}