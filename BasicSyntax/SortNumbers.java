package BasicSyntax;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int [] nums = {num1,num2,num3};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));




    }
}
