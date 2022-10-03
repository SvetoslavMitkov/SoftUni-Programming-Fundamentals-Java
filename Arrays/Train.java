package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wagons = Integer.parseInt(scanner.nextLine());
        int[] trainArr = new int[wagons];

        for (int i = 0; i < wagons; i++) {
            int peopleInWagon = Integer.parseInt(scanner.nextLine());
            trainArr[i] = peopleInWagon;
        }
        int sum = 0;
        for (int item: trainArr) {
            sum += item;
        }
        for (int i = 0; i < wagons; i++) {
            System.out.printf("%d ",trainArr[i]);
        }
        System.out.println();
        System.out.println(sum);
    }
}
