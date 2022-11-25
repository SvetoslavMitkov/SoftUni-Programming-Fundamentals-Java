package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, String> usersMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] inputArr = scanner.nextLine().split(" ");
            if (inputArr[0].equals("register")){
                if(usersMap.containsKey(inputArr[1])){
                    System.out.printf("ERROR: already registered with plate number %s%n", inputArr[2]);
                }else{
                    usersMap.put(inputArr[1], inputArr[2] );
                    System.out.printf("%s registered %s successfully%n", inputArr[1], inputArr[2]);
                }
            }else if (inputArr[0].equals("unregister")){
                if (!usersMap.containsKey(inputArr[1])){
                    System.out.printf("ERROR: user %s not found%n", inputArr[1]);
                }else{
                    usersMap.remove(inputArr[1]);
                    System.out.printf("%s unregistered successfully%n", inputArr[1]);
                }
            }
        }
        for (Map.Entry<String, String> entry : usersMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
