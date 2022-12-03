package FinalExamPreparations;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("@#+(?<product>[A-Z][^\\W_]{4,}[A-Z])@#+");

        for (int i = 0; i < n; i++) {
            String barcode = scanner.nextLine();
            Matcher matcher = pattern.matcher(barcode);
            if (!matcher.find()){
                System.out.println("Invalid barcode");
            }else{
                String product = matcher.group("product");
                Pattern pattern2 = Pattern.compile("\\d");
                Matcher matcher2 = pattern2.matcher(product);
                if (!matcher2.find()){
                    System.out.println("Product group: 00");
                }else{
                    StringBuilder productGroupSB = new StringBuilder();
                    matcher2 = pattern2.matcher(product);
                    while(matcher2.find()){
                        productGroupSB.append(matcher2.group());
                    }
                    System.out.printf("Product group: %s%n", productGroupSB.toString());
                }
            }
        }
    }
}
