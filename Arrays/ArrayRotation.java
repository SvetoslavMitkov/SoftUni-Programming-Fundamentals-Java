package Arrays;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputArr[] = scanner.nextLine().split(" ");
        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rotations; i++) {
            String firstElement = inputArr[0];
            for (int j = 0; j < inputArr.length-1; j++) {
                inputArr[j] = inputArr[j+1];
            }
            inputArr[inputArr.length-1] = firstElement;
        }
        System.out.println(String.join(" ",inputArr));
    }
}
