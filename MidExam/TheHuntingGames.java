package MidExam;

import java.util.Scanner;

public class TheHuntingGames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int players = Integer.parseInt(scanner.nextLine());
        double startEnergy = Double.parseDouble(scanner.nextLine());
        double waterPerPerson = Double.parseDouble(scanner.nextLine());
        double foodPerPerson = Double.parseDouble(scanner.nextLine());

        double totalWater = players * waterPerPerson * days;
        double totalFood = players * foodPerPerson * days;

        double currentEnergy = startEnergy;

        for (int i = 1; i <= days ; i++) {
                double energyLoss = Double.parseDouble(scanner.nextLine());
                currentEnergy -= energyLoss;
            if (currentEnergy <= 0) {
                System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.", totalFood, totalWater);
                break;
            }
                if (i % 2 == 0) {
                    currentEnergy = currentEnergy + currentEnergy * 0.05;
                    totalWater = totalWater * 0.7;
                }
                if (i % 3 == 0) {
                    currentEnergy = currentEnergy + currentEnergy * 0.1;
                    totalFood = totalFood - totalFood / players;
                }
        }
        if (currentEnergy > 0) {
            System.out.printf("You are ready for the quest. You will be left with - %.2f energy!", currentEnergy);
        }

    }
}
