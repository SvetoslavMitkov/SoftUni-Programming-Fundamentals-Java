package DataTypesAndVariables;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int days = 0;
        int totalSpice = 0;

        while (startingYield >= 100){
            totalSpice += startingYield - 26;
            days++;
            startingYield -= 10;
        }
        totalSpice -= 26;
        System.out.println(days);
        System.out.println(totalSpice);

    }
}
