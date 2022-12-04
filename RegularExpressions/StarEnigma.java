package RegularExpressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            int countLetters = 0;
            Pattern pattern = Pattern.compile("[SsTtAaRr]");
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()){
                countLetters++;
            }
            StringBuilder decryptedStringSB = new StringBuilder();
            for (char symbol: input.toCharArray()) {
                symbol = (char) (symbol - countLetters);
                decryptedStringSB.append(symbol);
            }
            String decryptedString = decryptedStringSB.toString();
            String regex = "@(?<name>[A-z]+)[^@\\-!:>]*:(?<population>\\d+)[^@\\-!:>]*!(?<attackType>[AD])!->(?<soldiers>\\d+)";
            Pattern pattern1 = Pattern.compile(regex);
            Matcher matcher1 = pattern1.matcher(decryptedString);
            while (matcher1.find()) {
                String attackType = matcher1.group(3);
                if (attackType.equals("A")) {
                    attackedPlanets.add(matcher1.group(1));
                } else {
                    destroyedPlanets.add(matcher1.group(1));
                }
            }
        }
        Collections.sort(attackedPlanets);
        Collections.sort(destroyedPlanets);


        System.out.printf("Attacked planets: %d%n", attackedPlanets.size());
        for (int i = 0; i < attackedPlanets.size(); i++) {
            System.out.printf("-> %s%n", attackedPlanets.get(i) );
        }
        System.out.printf("Destroyed planets: %d%n", destroyedPlanets.size());
        for (int i = 0; i < destroyedPlanets.size(); i++) {
            System.out.printf("-> %s%n", destroyedPlanets.get(i));
        }
    }
}
