package BasicSyntax;

import java.util.Scanner;

public class Academy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalMoney = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightsaber = Double.parseDouble(scanner.nextLine());
        double robe = Double.parseDouble(scanner.nextLine());
        double belt = Double.parseDouble(scanner.nextLine());
        int freeBelts = students / 6;
        double totalCost = 0;
        if(students<6){
            totalCost = (lightsaber*(Math.ceil(students*1.1)) + robe*students + belt*students);
        }else{
            totalCost = (lightsaber*(Math.ceil(students*1.1)) + robe*students + belt*students - freeBelts*belt);
        }

        if (totalMoney>totalCost){
            System.out.printf("The money is enough - it would cost %.2flv.",totalCost);
        }else{
            double moneyNeeded = totalCost - totalMoney;
            System.out.printf("George Lucas will need %.2flv more.",moneyNeeded);
        }
    }
}
