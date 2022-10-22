package Lists;

import java.util.*;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        int num = Integer.parseInt(input.split(" ")[0]);
        int power = Integer.parseInt(input.split(" ")[1]);

        for (int i = 0; i < inputList.size(); i++) {
            int currentNum = inputList.get(i);
            if (currentNum == num ){
                boolean firstOrLast = i == 0 || i == inputList.size()-1;
                //проверка дали индекса е първо или последно число
                if(!firstOrLast) {
                    //проверки за списък от дясно
                    boolean checkRight = i + power <= inputList.size() - 1;
                    boolean checkLeft = i - power >= 0;
                    if (checkRight) {
                        int removedIndex = i + 1;
                        for (int startIndex = 0; startIndex < power; startIndex++) {
                            inputList.remove(removedIndex);
                        }
                    }
                    if (!checkRight) {
                        int removedIndex = i + 1;
                        for (int startIndex = 0; startIndex < inputList.size() - i; startIndex++) {
                            inputList.remove(removedIndex);
                        }
                    }
                    if(checkLeft){   //проверки за списък от ляво
                        int removeIndex = i - power;
                        for (int startIndex = i - power; startIndex < i ; startIndex++) {
                               inputList.remove(removeIndex);
                        }
                    }
                    if (!checkLeft){
                        int removedIndex = 0;
                        for (int startIndex = 0; startIndex < power - i; startIndex++) {
                                inputList.remove(removedIndex);
                        }
                        }
                    }else{
                    if (i == 0){
                        int removedIndex = 1;
                        for (int startIndex = 0; startIndex < power ; startIndex++) {
                            inputList.remove(removedIndex);
                        }
                    }else if (i == inputList.size()-1){
                        int removedIndex = inputList.size() - 2;
                        for (int startIndex = 0; startIndex < power ; startIndex++) {
                            inputList.remove(removedIndex);
                        }
                    }
                }
        }

        }
        inputList.removeAll(Arrays.asList(num));
        int sum = 0;
        for (int n : inputList) {
            sum += n;
        }
        System.out.println(sum);
    }
}
