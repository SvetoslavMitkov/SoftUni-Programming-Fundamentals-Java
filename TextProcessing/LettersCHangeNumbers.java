package TextProcessing;

import java.util.Scanner;

public class LettersCHangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArr = input.split("\\s+");
        double sum = 0;

        for (int i = 0; i < inputArr.length; i++) {
            String currentString = inputArr[i];
            double number = Integer.parseInt(currentString.substring(1,currentString.length()-1));
            char before = currentString.charAt(0);
            char after = currentString.charAt(currentString.length()-1);

            if (Character.isUpperCase(before)){
                double currentResult = number / (before - 64);
                sum += currentResult;
            }else{
                double currentResult = number * (before - 96);
                sum += currentResult;
            }

            if (Character.isUpperCase(after)){
                sum -= (after - 64);
            }else{
                sum += (after - 96);
            }
        }
        System.out.printf("%.2f", sum);
    }
}
