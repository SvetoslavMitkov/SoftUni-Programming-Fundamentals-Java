package ExamPreparations;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("Craft!")){
            if (command.contains("Collect")){
            String item = command.split(" - ")[1];
            boolean containsItem = inputList.contains(item);
            if (!containsItem){
                inputList.add(item);
            }
            }else if (command.contains("Drop")){
                String item = command.split(" - ")[1];
                boolean containsItem = inputList.contains(item);
                if (containsItem){
                    inputList.remove(item);
                }
            }else if (command.contains("Combine Items")){
                String split = command.split(" - ")[1];
                String[] itemsArr = split.split(":");
                String oldItem = itemsArr[0];
                boolean containsItem = inputList.contains(oldItem);
                if (containsItem){
                    int indexOldItem = 0;
                    for (int i = 0; i < inputList.size(); i++) {
                        if (inputList.get(i).equals(oldItem)){
                            indexOldItem = i;
                        }
                    }
                    inputList.add(indexOldItem + 1, itemsArr[1]);
                }
            }else if (command.contains("Renew")){
                String item = command.split(" - ")[1];
                boolean containsItem = inputList.contains(item);
                if (containsItem){
                    inputList.remove(item);
                    inputList.add(item);
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(inputList.toString().replaceAll("[\\[\\]]", ""));
    }
}
