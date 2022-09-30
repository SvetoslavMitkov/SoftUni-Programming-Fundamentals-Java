package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOddSubstraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numsArr[] = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int sumEven = 0;
        int sumOdd = 0;
        for (int i : numsArr) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        int difference = sumEven - sumOdd;
        System.out.println(difference);
    }
}