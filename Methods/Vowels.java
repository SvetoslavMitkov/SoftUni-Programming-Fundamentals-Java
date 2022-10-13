package Methods;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        printVowelChar(input.toLowerCase());
    }

    public static void printVowelChar(String input) {
        int vowelsCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i'
                    || currentChar == 'o' || currentChar == 'u') {
                vowelsCount++;
            }
        }
        System.out.println(vowelsCount);
    }
}