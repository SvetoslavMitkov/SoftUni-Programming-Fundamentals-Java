package DataTypesAndVariables;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kegs = Integer.parseInt(scanner.nextLine());
        double biggestVolume = 0;
        String modelName = "";

        for (int i = 0; i < kegs; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI*(radius*radius)*height;
            if (volume>biggestVolume){
                biggestVolume += volume;
                modelName = model;
            }
        }
        System.out.println(modelName);


    }
}
