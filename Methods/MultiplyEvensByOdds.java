package Methods;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int n = Math.abs(input);
        System.out.println(getMultipleOfEvenAndOdds(n));

    }
    public static int sumEvens(int n){
        int sumEvens = 0;
        while(n > 0) {
            int numDigit = n % 10;
            if (n % 2 == 0) {
                sumEvens += numDigit;
            }
            n = n /10;
        }
        return sumEvens;
    }

    public static int sumOdds (int n){
        int sumOdds = 0;
        while(n > 0) {
           int numDigit = n % 10;
            if (n % 2 != 0) {
                sumOdds += numDigit;
            }
            n = n /10;
        }
        return sumOdds;
    }

    public static int getMultipleOfEvenAndOdds(int n){
        int sumOdds = sumOdds(n);
        int sumEvens = sumEvens(n);
        int multiplication = sumOdds * sumEvens;
        return multiplication;
    }
}