package TextProcessing;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] banList = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String banWord: banList) {
           int banWordLength = banWord.length();
           String replacement = replacementString(banWordLength);
           text = text.replaceAll(banWord, replacement);
        }
        System.out.println(text);

    }
    public static String replacementString (int banWordLength){
        String replacement = "";
        for (int i = 0; i < banWordLength; i++) {
            replacement += "*";
        }
        return replacement;
    }
}
