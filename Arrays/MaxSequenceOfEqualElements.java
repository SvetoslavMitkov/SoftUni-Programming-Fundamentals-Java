package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputArr[] = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int length = 1;
        int maxLength = 0;
        int index = 0;
        int bestIndex = 0;

        for (int i = 1; i < inputArr.length; i++) {
            if (inputArr[i] == inputArr[i-1]){
                length++;
                index = i;
            }else{
                length = 1;
            }
            if (length>maxLength){
                maxLength = length;
                bestIndex = index - maxLength + 1;
            }
        }
        for (int i = bestIndex; i <bestIndex + maxLength ; i++) {
            System.out.printf("%d ",inputArr[i]);

        }

    }
}
