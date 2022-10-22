package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int removedSum = 0;

        while (inputList.size() > 0){
            int index = Integer.parseInt(scanner.nextLine());

            if (index >= 0 && index < inputList.size()){
                int currentNum = inputList.get(index);
                removedSum += currentNum;
                inputList.remove(index);
                modifyList(inputList, currentNum);
            }else if(index < 0){
                int firstNum = inputList.get(0);
                removedSum += firstNum;
                inputList.set(0,inputList.get(inputList.size() - 1));
                modifyList(inputList,firstNum);
            }else if (index > inputList.size() - 1){
                int lastNum = inputList.get(inputList.size()-1);
                removedSum += lastNum;
                inputList.set(inputList.size()-1,inputList.get(0));
                modifyList(inputList,lastNum);
            }
        }
        System.out.println(removedSum);

    }

    private static void modifyList(List<Integer> inputList, int currentNum) {
        for (int i = 0; i < inputList.size(); i++) {
            if (inputList.get(i) <= currentNum){
                int modifiedNum = inputList.get(i) + currentNum;
                inputList.set(i,modifiedNum);
            }else{
                int modifiedNum = inputList.get(i) - currentNum;
                inputList.set(i,modifiedNum);
            }
        }
    }
}
