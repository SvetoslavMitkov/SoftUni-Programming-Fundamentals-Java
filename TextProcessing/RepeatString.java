package TextProcessing;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");

        for (String text: inputArr) {
            int length = text.length();
            for (int i = 0; i < length; i++) {
                System.out.print(String.join("",text));
            }
        }
    }
}
