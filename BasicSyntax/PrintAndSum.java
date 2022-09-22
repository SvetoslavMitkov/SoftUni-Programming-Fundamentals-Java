package BasicSyntax;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = Integer.parseInt(sc.nextLine());
        int end = Integer.parseInt(sc.nextLine());
        int sum = 0;

        for (int i = start; i <= end ; i++) {
            if (i == end) {
                System.out.println(i);
                sum = sum + i;
            } else {
                System.out.print(i + " ");
                sum = sum + i;
            }
        }
        System.out.printf("Sum: %d",sum);
    }
}
