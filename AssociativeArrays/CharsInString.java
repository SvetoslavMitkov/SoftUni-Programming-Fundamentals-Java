package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        LinkedHashMap<Character,Integer> textMap = new LinkedHashMap<>();

        for (String text: input) {
            for (int i = 0; i < text.length(); i++) {
                char currentChar = text.charAt(i);
                textMap.putIfAbsent(currentChar, 0);
                textMap.put(currentChar, textMap.get(currentChar)+1);
            }
        }
        for (Map.Entry<Character, Integer> entry : textMap.entrySet()) {
            System.out.printf("%c -> %d%n",entry.getKey(), entry.getValue());
        }

    }
}
