package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputs = Integer.parseInt(scanner.nextLine());
        int results[] = new int[inputs];
        for (int i = 0; i < inputs; i++) {
            String name = scanner.next();
            int sum = 0;
            int stringLength = name.length();
            for (int j = 0; j < stringLength; j++) {
                char currentChar = name.charAt(j);
                if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u'){
                    int charInt = currentChar * stringLength;
                    sum += charInt;
                }else{
                    int charInt = currentChar / stringLength;
                    sum += charInt;
                }
            }
            results[i] = sum;
        }
        Arrays.sort(results);
        for (int n: results) {
            System.out.println(n);
        }
        }

    }

