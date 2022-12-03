package FinalExamPreparations;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        String command = scanner.nextLine();


        while (!command.equals("Done")){
            String[] commandArr = command.split(" ");
            switch (commandArr[0]){
                case "TakeOdd":
                char[] inputArr = password.toCharArray();
                StringBuilder newPasswordSb = new StringBuilder();
                    for (int i = 0; i < inputArr.length; i++) {
                        if (i % 2 == 1){
                            newPasswordSb.append(inputArr[i]);
                        }
                    }
                password = newPasswordSb.toString();
                    System.out.println(password);
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(commandArr[1]);
                    int endIndex = startIndex + Integer.parseInt(commandArr[2]);
                String toRemove = password.substring(startIndex, endIndex);
                password = password.replaceFirst(toRemove, "");
                    System.out.println(password);
                    break;
                case "Substitute":
                    String substring = commandArr[1];
                    String substitute = commandArr[2];
                    if (password.contains(substring)){
                        password = password.replaceAll(substring, substitute);
                        System.out.println(password);
                    }else{
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Your password is: %s%n", password);
    }
}
