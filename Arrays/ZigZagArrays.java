package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int array1[] = new int[n];
        int array2[] = new int[n];

        for (int i = 1; i <= n; i++) {
            int input[] = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
                if (i % 2 != 0) {
                    array1[i - 1] = input[0];
                    array2[i - 1] = input[1];
                } else {
                    array1[i - 1] = input[1];
                    array2[i - 1] = input[0];
            }
        }
        for (int item:array1) {
            System.out.printf("%d ",item);
        }
        System.out.println();
        for (int item:array2) {
            System.out.printf("%d ",item);
        }
    }
}
