package DataTypesAndVariables;

import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        for (int i = start; i <= end ; i++) {
            char currentSymbol = (char) i;
            System.out.printf("%s ",currentSymbol);
        }

    }
}
