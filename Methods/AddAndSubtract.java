package Methods;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int sum = Sum(num1,num2);
        int subtract = Subtract(sum, num3);
        System.out.println(subtract);

    }
    public static int Sum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    public static int Subtract(int sum, int num3){
        int subtract = sum - num3;
        return subtract;
    }
}
