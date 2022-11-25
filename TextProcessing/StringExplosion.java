package TextProcessing;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder textBuilder = new StringBuilder(input);
        int totalStrength = 0;

        for (int i = 0; i < textBuilder.length(); i++) {
            char symbol = textBuilder.charAt(i);
            if (symbol == '>'){
                int strengthOfExplosion = Integer.parseInt(String.valueOf(textBuilder.charAt(i + 1)));
                totalStrength += strengthOfExplosion;
            }else if (symbol != '>' && totalStrength > 0){
                textBuilder.deleteCharAt(i);
                totalStrength--;
                i--;
            }
        }
        System.out.println(textBuilder);
    }
}
