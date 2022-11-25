package TextProcessing;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.next();

        while (!command.equals("end")){
            String stringToReverse = command;
            int n = stringToReverse.length();
            String reversedString = "";
            for (int i = n; i > 0; i--) {
                char charAt = stringToReverse.charAt(i-1);
                reversedString += charAt;
            }
            System.out.printf("%s = %s%n", stringToReverse, reversedString);
            command = scanner.next();
        }
    }
}
