package BasicSyntax;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalMoney = 0;

        for (int i = 0; i < 10000; i++) {
            String input = scanner.nextLine();


            if (input.contains("Start")) {
                break;
            } else {
                double coins = Double.parseDouble(input);
                if ((coins == 0.1) || (coins == 0.2) || (coins == 0.5) || (coins == 1) || (coins == 2)) {
                    totalMoney += coins;
                } else {
                    System.out.printf("Cannot accept %.2f%n", coins);
                }
            }
        }
            for (int j = 0; j < 10000; j++) {
                String input2 = scanner.nextLine();
                if (!input2.contains("End")) {
                    String product = input2;
                    switch (product) {
                        case "Nuts":
                            if (totalMoney>=2){
                                System.out.println("Purchased Nuts");
                                totalMoney -= 2;
                                break;
                            }else{
                                System.out.println("Sorry, not enough money");
                                break;
                            }
                        case "Water":
                            if (totalMoney>=0.7){
                                System.out.println("Purchased Water");
                                totalMoney -= 0.7;
                                break;
                            }else{
                                System.out.println("Sorry, not enough money");
                                break;
                            }
                        case "Crisps":
                            if (totalMoney>=1.5){
                                System.out.println("Purchased Crisps");
                                totalMoney -= 1.5;
                                break;
                            }else {
                                System.out.println("Sorry, not enough money");
                                break;
                            }
                        case "Soda":
                            if (totalMoney>=0.8){
                                System.out.println("Purchased Soda");
                                totalMoney -= 0.8;
                                break;
                            }else {
                                System.out.println("Sorry, not enough money");
                                break;
                            }
                        case "Coke":
                            if (totalMoney>=1){
                                System.out.println("Purchased Coke");
                                totalMoney -= 1;
                                break;
                            }else {
                                System.out.println("Sorry, not enough money");
                                break;
                            }
                        default:
                            System.out.println("Invalid product");
                            break;
                    }
                    }else{
                        System.out.printf("Change: %.2f",totalMoney);
                        return;

                    }

                }
            }
        }







