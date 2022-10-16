package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagonsList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int capacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("end")){
            if (command.contains("Add")) {
                String[] commandArr = command.split(" ");
                wagonsList.add(Integer.parseInt(commandArr[1]));
            }else{
                int commandInt = Integer.parseInt(command);
                for (int i = 0; i < wagonsList.size(); i++) {
                    if (commandInt + wagonsList.get(i) <= capacity){
                        wagonsList.set(i, commandInt + wagonsList.get(i));
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(wagonsList.toString().replaceAll("[\\[\\],]",""));
    }
}
