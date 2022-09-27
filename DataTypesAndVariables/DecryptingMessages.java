package DataTypesAndVariables;

import java.util.Scanner;

public class DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        String output = "";

        for (int i = 0; i < n; i++) {
            char input = scanner.nextLine().charAt(0);
            int ASCIIid = (int) input;
            int decryptID = ASCIIid + key;
            output += (char) decryptID;
        }
        System.out.println(output);
    }
}
