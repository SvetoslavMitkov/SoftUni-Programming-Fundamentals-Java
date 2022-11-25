package TextProcessing;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder encryptedText = new StringBuilder();

        for (char letter: input.toCharArray()) {
            encryptedText.append((char)(letter + 3));
        }
        System.out.println(encryptedText);
    }
}
