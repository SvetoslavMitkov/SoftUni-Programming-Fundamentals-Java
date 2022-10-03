package Arrays;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] array = new int[n];
        if(n>1) {
            array[0] = 1;
            array[1] = 1;
        }else{
            array[0] = 1;
        }
        for (int i = 0; i < n - 2; i++) {
            array[i + 2] = array[i] + array[i + 1];
        }
        System.out.println(array[array.length-1]);

    }
}
