package TextProcessing;

import java.util.Scanner;

public class common {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int i = Integer.parseInt(scanner.nextLine());

        int count = 0;

        for (int j = n; j > 0 ; j /= 2) {
            int remain = j % 2;
            if (remain == i){
                count++;
            }
        }
        System.out.println(count);

    }
}
