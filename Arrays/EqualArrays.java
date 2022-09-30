package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numArr1[] = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int numArr2[] = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        boolean equals = true;
        int sum = 0;
        int indexDifference = 0;

        for (int i = 0; i < numArr1.length; i++) {
            if (numArr1[i]==numArr2[i]){
                sum += numArr1[i];
            }else{
                equals = false;
                indexDifference = i;
                break;
            }
        }
        if (equals==true){
            System.out.printf("Arrays are identical. Sum: %d%n",sum);
        }else{
            System.out.printf("Arrays are not identical. Found difference at %d index.%n",indexDifference);
        }

    }
}
