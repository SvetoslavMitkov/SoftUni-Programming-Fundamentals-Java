package Methods;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        switch (product){
            case "coffee":
                printPrice(1.5, quantity);
                break;
            case "water":
                printPrice(1, quantity);
                break;
            case "coke":
                printPrice(1.4, quantity);
                break;
            case "snacks":
                printPrice(2, quantity);
                break;
        }


    }
    public static void printPrice(double price, int quantity){
        System.out.printf("%.2f" ,price * quantity);
    }

}
