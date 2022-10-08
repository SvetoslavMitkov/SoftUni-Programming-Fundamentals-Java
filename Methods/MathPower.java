package Methods;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());
        System.out.println(new DecimalFormat("0.####").format(powerOfNumber(n, power)));

    }
    public static double powerOfNumber(double n, int power){
        double result = 1;
        for (int i = 0; i < power; i++) {
            result = result * n;
        }
        return result;
    }

}
