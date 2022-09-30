package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numsArr[] = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int condensedNumber = 0;


        for (int i = 0; i < numsArr.length; i++) {
            if (i == numsArr.length -1){

                break;
            }else{
                condensedNumber += numsArr[i] + numsArr[i + 1];
            }

        }
        System.out.println(condensedNumber);
    }
}
