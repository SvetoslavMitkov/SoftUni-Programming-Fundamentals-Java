package BasicSyntax;

import java.util.Scanner;

public class TrianglesOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int rows = 1; rows <= num; rows++) {
            for (int columns = 1; columns <= rows ; columns++) {
                System.out.print(rows+" ");
            }
            System.out.println();
        }

    }
}
