package TextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DigitLettersOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder digitSb = new StringBuilder();
        StringBuilder letterSb = new StringBuilder();
        StringBuilder otherSb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char charAtIndex = input.charAt(i);
          if (Character.isDigit(charAtIndex)){
              digitSb.append(charAtIndex);
          }else if (Character.isLetter(charAtIndex)){
              letterSb.append(charAtIndex);
          }else{
              otherSb.append(charAtIndex);
          }
        }
        System.out.println(digitSb);
        System.out.println(letterSb);
        System.out.println(otherSb);
    }
}
