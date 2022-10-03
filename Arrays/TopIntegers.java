package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputArr[] = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < inputArr.length ; i++) {
            if (i == inputArr.length-1){
                System.out.printf("%d ",inputArr[i]);
            }
            int currentNum = inputArr[i];
            boolean isTop = false;
            for (int index = i+1; index < inputArr.length; index++) {
                int nextNum = inputArr[index];
                if (currentNum>nextNum){
                    isTop = true;
                }else{
                    isTop = false;
                    break;
                }
            }
            if (isTop){
                System.out.printf("%d ",inputArr[i]);
            }
        }
    }
}
