package Methods;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        if (!lengthCheck(input)){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!symbolsCheck(input)){
            System.out.println("Password must consist only of letters and digits");
        }
        if (!digitsCheck(input)){
            System.out.println("Password must have at least 2 digits");
        }
        if (lengthCheck(input) && symbolsCheck(input) && digitsCheck(input)){
            System.out.println("Password is valid");
        }

    }

    public static boolean lengthCheck(String input) {
        return input.length() >= 6 && input.length() <= 10;
    }

    public static boolean symbolsCheck(String input) {
        for (char symbol : input.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;
    }

    public static boolean digitsCheck(String input) {
        int digitsCount = 0;
        for (char symbol : input.toCharArray()) {
            if (Character.isDigit(symbol)){
                digitsCount++;
            }
        }
        return digitsCount >= 2;
    }
}
