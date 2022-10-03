package Arrays;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int rows = 0; rows < n; rows++) {
            int array[] = new int[rows];
            for (int columns = 0; columns < rows ; columns++) {
                int num = 1 + rows;
                System.out.println(num);
            }

        }

    }
}
