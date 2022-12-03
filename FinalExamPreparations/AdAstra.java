package FinalExamPreparations;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "([#\\|])(?<food>[A-z\\s*]+)\\1(?<date>\\d{2}\\/\\d{2}\\/\\d{2})\\1(?<calories>\\d+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        int caloriesSum = 0;
        while (matcher.find()){
            int calories = Integer.parseInt(matcher.group("calories"));
            caloriesSum += calories;
        }
        int daysToSustain = caloriesSum / 2000;
        System.out.printf("You have food to last you for: %d days!%n", daysToSustain);

        matcher = pattern.matcher(input);
        while (matcher.find()){
            String foodName = matcher.group("food");
            String expirationDate = matcher.group("date");
            int calories = Integer.parseInt(matcher.group("calories"));

            System.out.printf("Item: %s, Best before: %s, Nutrition: %d%n", foodName, expirationDate, calories);
        }
    }
}
