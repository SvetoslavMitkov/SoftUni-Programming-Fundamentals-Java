package DataTypesAndVariables;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int flow = 0;

        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            flow += input;
            while (flow > 255){
                System.out.println("Insufficient capacity!");
                flow -= input;
                break;
            }
        }
        System.out.println(flow);
    }
}
