package TextProcessing;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usernamesArr = scanner.nextLine().split(", ");

        for (String username : usernamesArr) {
            boolean lengthCheck = false;
            boolean symbolCheck = true;
            if (username.length() >= 3 && username.length() <= 16) {
                lengthCheck = true;
            }
            char[] usernameChars = username.toCharArray();
            for (char symbol : usernameChars) {
                if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                    symbolCheck = false;
                }
            }
            if (symbolCheck && lengthCheck){
                System.out.println(username);
            }
        }
    }
}