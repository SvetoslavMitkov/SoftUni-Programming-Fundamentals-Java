package DataTypesAndVariables;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while(num>0){
            int numDigit = num % 10;
            sum += numDigit;
            num = num /10;
        }
        System.out.println(sum);
    }
}
