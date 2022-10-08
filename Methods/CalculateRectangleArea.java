package Methods;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        System.out.printf("%.0f",getRectangularArea(width,length));


    }
    public static double getRectangularArea(double width, double length){
        double result = width * length;
        return  result;
    }

}
