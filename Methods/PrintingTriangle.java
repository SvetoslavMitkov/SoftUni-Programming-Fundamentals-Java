package Methods;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        printTriangleDown(n);
        printTriangleUp(n);

    }

    public static void printTriangleDown(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int columns = 1; columns <= rows; columns++) {
                System.out.print(columns + " ");
            }
            System.out.println();
        }

    }

    public static void printTriangleUp(int n) {
        for (int rows = n - 1; rows >= 1; rows--) {
            for (int columns = 1; columns <= rows; columns++) {
                System.out.print(columns + " ");
            }
            System.out.println();
        }
    }
}
