package Arrays;

import java.util.Scanner;

public class ReversedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");

        for (int i = 0; i < inputArr.length / 2; i++) {
            String firstIndex = inputArr[i];
            inputArr[i] = inputArr[inputArr.length - 1 - i];
            inputArr[inputArr.length - 1 - i] = firstIndex;
        }
        System.out.println(String.join(" ",inputArr));
    }
}
