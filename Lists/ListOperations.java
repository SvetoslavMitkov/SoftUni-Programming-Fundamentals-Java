package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("End")){
            String[] commandArr = command.split("\\s+");
            switch (commandArr[0]){
                case "Add":
                    inputList.add(Integer.parseInt(commandArr[1]));
                    break;
                case "Insert":
                   boolean indexCheck = indexCheck(inputList,Integer.parseInt(commandArr[2]));
                    if (indexCheck){
                        System.out.println("Invalid index");
                        break;
                    }
                    int index = Integer.parseInt(commandArr[2]);
                    int num = Integer.parseInt((commandArr[1]));
                    inputList.add(index,num);
                    break;
                case "Remove":
                    boolean indexCheck1 = indexCheck(inputList,Integer.parseInt(commandArr[1]));
                    if (indexCheck1){
                        System.out.println("Invalid index");
                        break;
                    }
                    int index1 = Integer.parseInt(commandArr[1]);
                    inputList.remove(index1);
                    break;
                case "Shift":
                    if (commandArr[1].equals("left")){
                        for (int i = 0; i < Integer.parseInt(commandArr[2]); i++) {
                            int firstNum = inputList.get(0);
                            inputList.remove(inputList.remove(0));
                            inputList.add(firstNum);
                        }
                    }else if(commandArr[1].equals("right")){
                        for (int i = 0; i < Integer.parseInt(commandArr[2]); i++){
                            int lastNum = inputList.get(inputList.size()-1);
                            inputList.remove(inputList.size()-1);
                            inputList.add(0,lastNum);
                        }
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println(inputList.toString().replaceAll("[\\[\\],]", ""));
    }
    public static boolean indexCheck(List<Integer> inputList,int index) {
        return index < 0 || index > inputList.size() - 1;
    }
}
