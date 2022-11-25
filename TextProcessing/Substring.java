package TextProcessing;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String toRemove = scanner.nextLine();
        String word = scanner.nextLine();

        int index = word.indexOf(toRemove);
        while (index != -1){
            word = word.replace(toRemove, "");
            index = word.indexOf(toRemove);
        }
        System.out.println(word);
    }
}
