package BasicSyntax;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headsetTrashed = lostGames / 2;
        int mouseTrashed = lostGames / 3;
        int keyboardTrashed = lostGames / 6;
        int displayTrashed = lostGames / 12;

        double total = headsetTrashed*headsetPrice+mouseTrashed*mousePrice+keyboardTrashed*keyboardPrice+displayTrashed*displayPrice;

        System.out.printf("Rage expenses: %.2f lv.",total);

    }
}
