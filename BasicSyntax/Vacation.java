package BasicSyntax;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());
        String type = sc.nextLine();
        String day = sc.nextLine();
        double totalPrice = 0;
        double totalPriceDiscount = 0;
        double price = 0;

        switch (type) {
            case "Students":
                if (day.contains("Friday")) {
                    totalPrice = num * 8.45;
                } else if (day.contains("Saturday")) {
                    totalPrice = num * 9.80;
                } else if (day.contains("Sunday")) {
                    totalPrice = num * 10.46;
                }
                if (num >= 30) {
                    totalPriceDiscount = totalPrice * 0.85;
                    System.out.printf("Total price: %.2f", totalPriceDiscount);
                } else {
                    System.out.printf("Total price: %.2f", totalPrice);
                }
                break;
            case "Business":
                if (day.contains("Friday")) {
                    price = 10.90;
                    totalPrice = num * price;
                } else if (day.contains("Saturday")) {
                    price = 15.60;
                    totalPrice = num * price;
                } else if (day.contains("Sunday")) {
                    price = 16;
                    totalPrice = num * price;
                }
                if (num >= 100) {
                    totalPriceDiscount = (num - 10) * price;
                    System.out.printf("Total price: %.2f", totalPriceDiscount);
                } else {
                    System.out.printf("Total price: %.2f", totalPrice);
                }
                break;
            case "Regular":
                if (day.contains("Friday")) {
                    totalPrice = num * 15;
                } else if (day.contains("Saturday")) {
                    totalPrice = num * 20;
                } else if (day.contains("Sunday")) {
                    totalPrice = num * 22.50;
                }
                if (num >= 10&&num<=20) {
                    totalPriceDiscount = totalPrice*0.95;
                    System.out.printf("Total price: %.2f", totalPriceDiscount);
                } else {
                    System.out.printf("Total price: %.2f", totalPrice);
                }
                break;
        }
    }
}