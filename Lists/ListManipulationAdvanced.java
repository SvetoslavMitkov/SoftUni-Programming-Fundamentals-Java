package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.contains("end")){
            String[] commandArr = command.split(" ");
            switch (commandArr[0]){
                case "Contains":
                  boolean check = inputList.contains(Integer.parseInt(commandArr[1]));
                    if (check){
                        System.out.println("Yes");
                        break;
                    }else{
                        System.out.println("No such number");
                        break;
                    }
                case "Print":
                    if (commandArr[1].contains("even")){
                        for (int item: inputList) {
                            if (item % 2 == 0){
                                System.out.print(item + " ");
                            }
                        }
                        System.out.println();
                        break;
                    }else if (commandArr[1].contains("odd")){
                        for (int item: inputList) {
                            if (item % 2 != 0){
                                System.out.print(item + " ");
                            }
                        }
                        System.out.println();
                        break;
                    }
                case "Get":
                    int sum = 0;
                    for (int item: inputList) {
                        sum += item;
                    }
                    System.out.println(sum);
                    break;

                case "Filter":
                    switch (commandArr[1]){
                        case "<":
                            for (int item: inputList) {
                                if (item < Integer.parseInt(commandArr[2])){
                                    System.out.print(item + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">":
                            for (int item: inputList) {
                                if (item > Integer.parseInt(commandArr[2])){
                                    System.out.print(item + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">=":
                            for (int item: inputList) {
                                if (item >= Integer.parseInt(commandArr[2])){
                                    System.out.print(item + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "<=":
                            for (int item: inputList) {
                                if (item <= Integer.parseInt(commandArr[2])){
                                    System.out.print(item + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }
            }
            command = scanner.nextLine();
        }

    }
}
