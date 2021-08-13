import java.util.Scanner;

public class AtalhosWebloggerBrasil {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNextLine()) {
        String tagHTML = sc.nextLine().replace("_", "<i>").replace("*", "<b>");
        
        String[] tagHTMLItalico = tagHTML.split("<i");
        StringBuilder stringBuilderItalico = new StringBuilder(tagHTMLItalico[0]);

        for(int i = 1; i < tagHTMLItalico.length; i++) {
            if(i %2 == 1) stringBuilderItalico.append("<i");
            else stringBuilderItalico.append("</i");
            stringBuilderItalico.append(tagHTMLItalico[i]);
        }
        
        tagHTML = stringBuilderItalico.toString();
        
        String[] tagHTMLNegrito = tagHTML.split("<b");
        StringBuilder stringBuilder = new StringBuilder(tagHTMLNegrito[0]);

        for(int i = 1; i < tagHTMLNegrito.length; i++) {
            if(i %2 == 1) stringBuilder.append("<b");
            else stringBuilder.append("</b");
            stringBuilder.append(tagHTMLNegrito[i]);
        }
        
        System.out.println(stringBuilder.toString());
    }
}
}

/*
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNextLine()) {
        String[] tagHTML = sc.nextLine().replace("_", "<i>").replace("*", "<b>").split("<");
        StringBuilder stringBuilder = new StringBuilder(tagHTML[0]);

        for(int i = 1; i < tagHTML.length; i++) {
            if(i %2 == 1) stringBuilder.append("<");
            else stringBuilder.append("</");
            stringBuilder.append(tagHTML[i]);
        }

        System.out.println(stringBuilder.toString());
    }
}*/