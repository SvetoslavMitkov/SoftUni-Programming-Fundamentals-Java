package Methods;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        printMiddleCharacter(input);

    }
    public static void printMiddleCharacter(String input){
        if (input.length() % 2 == 0){
            System.out.printf("%c%c",input.charAt(input.length()/2 - 1), input.charAt(input.length()/2));
        }else{
            System.out.print(input.charAt(input.length()/2));
        }


    }

}
