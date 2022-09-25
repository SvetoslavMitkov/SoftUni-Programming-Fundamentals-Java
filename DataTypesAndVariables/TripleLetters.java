package DataTypesAndVariables;

import java.util.Scanner;

public class TripleLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            int first = ('a' + i);
           char firstChar = (char)first;
            for (int j = 0; j < n ; j++) {
                int second = ('a' + j);
                char secondChar = (char)second;
                for (int k = 0; k < n; k++) {
                    int third = ('a' + k);
                    char thirdChar = (char)third;
                    System.out.printf("%c%c%c%n",firstChar,secondChar,thirdChar);
                }
            }


            
        }

    }
}
