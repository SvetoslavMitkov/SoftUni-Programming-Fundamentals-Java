package AssociativeArrays;

import java.util.Arrays;
import java.util.Scanner;

public class WordsFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String[] wordsFiltered = Arrays.stream(input)
                .filter(e -> e.length() % 2 ==0).toArray(String[]::new);

        for (String word: wordsFiltered) {
            System.out.println(word);
        }

    }
}
