package FinalExamPreparations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String key = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Generate")){
            String[] commandArr = command.split(">>>");
            switch (commandArr[0]){
                case "Contains":
                    String substring = commandArr[1];
                    if (key.contains(substring)){
                        System.out.printf("%s contains %s%n", key, substring);
                    }else{
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    int startIndex = Integer.parseInt(commandArr[2]);
                    int endIndex = Integer.parseInt(commandArr[3]);
                    char[] keyArr = key.toCharArray();
                    if (commandArr[1].equals("Upper")){
                        for (int i = startIndex; i < endIndex ; i++) {
                            keyArr[i] = Character.toUpperCase(keyArr[i]);
                        }
                        key = charArrayToString(keyArr);
                        System.out.println(key);
                    }else if (commandArr[1].equals("Lower")){
                        for (int i = startIndex; i < endIndex ; i++) {
                           keyArr[i] = Character.toLowerCase(keyArr[i]);
                        }
                        key = charArrayToString(keyArr);
                        System.out.println(key);
                    }
                    break;
                case "Slice":
                    int startIndex1 = Integer.parseInt(commandArr[1]);
                    int endIndex1 = Integer.parseInt(commandArr[2]);
                    String substringToRemove = key.substring(startIndex1, endIndex1);
                    key = key.replace(substringToRemove,"");
                    System.out.println(key);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s" ,key);

    }

    private static String charArrayToString(char[] keyArr) {
        StringBuilder modifiedKeySB = new StringBuilder();
        for (char currentChar: keyArr) {
            modifiedKeySB.append(currentChar);
        }
        return modifiedKeySB.toString();
    }
}
