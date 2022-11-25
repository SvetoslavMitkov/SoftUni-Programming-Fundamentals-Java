package ObjectsAndClasses;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();

        List<String> inputText = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        for (int i = 0; i < inputText.size() ; i++) {
            int indexToGet = rnd.nextInt(inputText.size());
            int indexToSet = rnd.nextInt(inputText.size());

            String oldWord = inputText.get(indexToGet);
            inputText.set(indexToGet,inputText.get(indexToSet));
            inputText.set(indexToSet,oldWord);
        }
        for (String word: inputText) {
            System.out.println(word);
        }
    }
}
