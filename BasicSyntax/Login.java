package BasicSyntax;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = sc.nextLine();
        String password = new StringBuilder(username).reverse().toString();;



        int attempts = 1;
        String passInput = sc.nextLine();

        while (!passInput.equals(password)) {
            System.out.println("Incorrect password. Try again.");
            passInput = sc.nextLine();
            attempts++;
            if (attempts>3){
                System.out.printf("User %s blocked!", username);
                break;
            }

        }if(passInput.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
