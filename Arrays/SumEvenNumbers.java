package Arrays;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numsArr = scanner.nextLine().split(" ");
        int [] ints = new int[numsArr.length];
        for (int i = 0; i < numsArr.length; i++) {
            ints[i] = Integer.parseInt(numsArr[i]);

        }
        int sumEven = 0;
        for (int item : ints ) {
            if(item % 2 == 0){
                sumEven += item;
            }
        }

        System.out.println(sumEven);

    }
}
