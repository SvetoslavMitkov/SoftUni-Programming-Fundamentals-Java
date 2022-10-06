package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LIS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int []list = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
                //3 14 5 12 15 7 8 9 11 10 1
        int countLongest = 0;
        int []longestArr = new int[countLongest];
        int bestIndex = 0;
        for (int i = 0; i < list.length ; i++) {
            int current = 1;
        for (int p = i + 1; p <= list.length; p++) {
            if (list[p] > list[p - 1]) {
                current++;
                bestIndex = p - 1;
            }else{
                if(current>countLongest) {
                    countLongest += current;
                    break;
                }
                break;
            }

        }
        }
    }
}
