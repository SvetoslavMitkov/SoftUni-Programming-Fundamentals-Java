package RegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = ">>(?<name>[A-Z]+[a-z]*)<<(?<price>\\d+[.]?\\d*)!(?<quantity>\\d+)";
        Pattern pattern = Pattern.compile(regex);
        List<String> furnitureList = new ArrayList<>();
        double moneySpent = 0;
        while(!input.equals("Purchase")){

            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                furnitureList.add(matcher.group("name"));
                moneySpent += Double.parseDouble(matcher.group("price"))
                        * Double.parseDouble(matcher.group("quantity"));
            }
            input = scanner.nextLine();
        }
            System.out.println("Bought furniture:");
            for (String item: furnitureList) {
                System.out.println(item);
            }
            System.out.printf("Total money spend: %.2f%n",moneySpent);

    }
}
