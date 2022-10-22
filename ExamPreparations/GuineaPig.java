package ExamPreparations;

import java.util.Scanner;

public class GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double quantityFoodGrams = Double.parseDouble(scanner.nextLine())*1000;
        double quantityHayGrams = Double.parseDouble(scanner.nextLine())*1000;
        double quantityCoverGrams = Double.parseDouble(scanner.nextLine())*1000;
        double pigWeightGrams = Double.parseDouble(scanner.nextLine())*1000;

        for (int i = 1; i <= 30; i++) {
            quantityFoodGrams -= 300;
            if (i % 2 == 0){
                quantityHayGrams -= 0.05 * quantityFoodGrams;
            }
            if (i % 3 == 0){
                quantityCoverGrams -= pigWeightGrams / 3;
            }
            if (quantityFoodGrams <= 0 || quantityHayGrams <= 0 || quantityCoverGrams <= 0){
                System.out.println("Merry must go to the pet store!");
                break;
            }
        }
        if (quantityFoodGrams > 0 && quantityHayGrams > 0 && quantityCoverGrams > 0) {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",
                    quantityFoodGrams / 1000, quantityHayGrams / 1000, quantityCoverGrams / 1000);
        }
    }
}
