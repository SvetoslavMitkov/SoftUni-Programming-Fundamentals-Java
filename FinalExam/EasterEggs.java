package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("[@#]+(?<color>[a-z]{3,})[@#]+\\W*\\/+(?<amount>\\d+)\\/+");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            String color = matcher.group("color");
            String amount = matcher.group("amount");
            System.out.printf("You found %s %s eggs!%n", amount, color);

        }
    }
}
