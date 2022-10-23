package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("Finish")){
            if (command.contains("Add")){
                int value = Integer.parseInt(command.split("\\s+")[1]);
                inputList.add(value);
            }else if (command.contains("Remove")){
                int value = Integer.parseInt(command.split("\\s+")[1]);
                for (int i = 0; i < inputList.size() ; i++) {
                    if (inputList.get(i) == value) {
                        inputList.remove(i);
                        break;
                    }
                }
            }else if (command.contains("Replace")){
                int value = Integer.parseInt(command.split("\\s+")[1]);
                int replacement = Integer.parseInt(command.split("\\s+")[2]);
                int index = 0;
                if (inputList.contains(value)){
                for (int i = 0; i < inputList.size(); i++) {
                    if (inputList.get(i) == value) {
                        index = i;
                        break;
                    }
                    }
                    inputList.set(index,replacement);
                }
            }else if (command.contains("Collapse")){
                int value = Integer.parseInt(command.split("\\s+")[1]);
                for (int i = 0; i < inputList.size(); i++) {
                    int numToRemove = inputList.get(i);
                    if (numToRemove < value){
                        inputList.remove(Integer.valueOf(numToRemove));
                        i = -1;
                    }
                }
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < inputList.size(); i++) {
            System.out.print(inputList.get(i) + " ");
        }
    }
}
