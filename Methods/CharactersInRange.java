package Methods;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char char1 = scanner.nextLine().charAt(0);
        char char2 = scanner.nextLine().charAt(0);
        printCharactersInRange(char1,char2);

    }
    public static void printCharactersInRange(char char1, char char2){
        int char1index = char1;
        int char2index = char2;
        if (char1index>char2index) {
            for (int i = char2index + 1; i < char1index; i++) {
                char currentChar = (char) i;
                System.out.print(currentChar + " ");
            }
            }else{
            for (int i = char1index + 1; i < char2index; i++) {
                char currentChar = (char) i;
                System.out.print(currentChar + " ");
            }
        }
    }

}
