package ExamPreparations;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while(!command.equals("end")){
            String[] commandArr = command.split(" ");
            switch (commandArr[0]){
                case "swap":
                    int index1 = Integer.parseInt(commandArr[1]);
                    int index2 = Integer.parseInt(commandArr[2]);
                    int numIndex1 = inputList.get(index1);
                    int numIndex2 = inputList.get(index2);

                    inputList.set(index1,numIndex2);
                    inputList.set(index2,numIndex1);
                    break;
                case "multiply":
                    int resultMultiply = inputList.get(Integer.parseInt(commandArr[1])) *
                            inputList.get(Integer.parseInt(commandArr[2]));

                    inputList.set(Integer.parseInt(commandArr[1]),resultMultiply);
                    break;
                case "decrease":
                    for (int i = 0; i < inputList.size(); i++) {
                        int decreasedNum = inputList.get(i) - 1;
                        inputList.set(i, decreasedNum );
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println(inputList.toString().replaceAll("[\\[\\]]",""));

    }
}
