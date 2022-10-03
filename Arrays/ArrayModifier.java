package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputArr[] = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();
        while(!command.equals("end")){
            if (command.contains("swap")){
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);
                int numOnIndex1 = inputArr[index1];
                inputArr[index1] = inputArr[index2];
                inputArr[index2] = numOnIndex1;

            }else if(command.contains("multiply")){
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);
                inputArr[index1] = inputArr[index1]*inputArr[index2];

            }else if(command.equals("decrease")){
                for (int i = 0; i < inputArr.length ; i++) {
                 inputArr[i] = inputArr[i] - 1;
                }
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < inputArr.length; i++) {
            if (i != inputArr.length-1){
                System.out.printf("%d, ",inputArr[i]);
            }else{
                System.out.println(inputArr[i]);
            }
        }
        }
    }

