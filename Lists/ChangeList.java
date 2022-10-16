package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while(!command.equals("end")){
            String[] commandArr = command.split(" ");
            switch (commandArr[0]){
                case "Delete":
                        inputList.removeAll(Arrays.asList(commandArr[1]));
                    break;
                case "Insert":
                    int index = Integer.parseInt(commandArr[2]);
                    inputList.add(index,commandArr[1]);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println(inputList.toString().replaceAll("[\\[\\],]",""));
    }
}
