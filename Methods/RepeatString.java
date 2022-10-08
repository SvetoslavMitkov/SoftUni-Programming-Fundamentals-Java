package Methods;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int repeats = Integer.parseInt(scanner.nextLine());
        System.out.print(repeatedString(input,repeats));

    }

    public static String repeatedString(String text, int repeats){
        StringBuilder repeatedString = new StringBuilder();
        for (int i = 0; i < repeats; i++) {
            repeatedString.append(text);
        }
        return repeatedString.toString();
    }

}
