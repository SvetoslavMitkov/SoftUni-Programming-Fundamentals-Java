package DataTypesAndVariables;

import java.util.Scanner;

public class FromLeftToRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < rows; i++) {
            String num = scanner.nextLine();
            String leftNumber = "";
            String rightNumber = "";
            for (int j = 0; j < num.length(); j++) {    //за ляво число
                if (num.charAt(j) != ' ') {
                    leftNumber += num.charAt(j);
                } else {
                    j++;
                    for (int k = j; k < num.length() ; k++) {  //за дясно число
                        rightNumber += num.charAt(k);
                    }
                    break;
                }

                }
            long intLeftNumber = Long.parseLong(leftNumber);
            long intRightNumber = Long.parseLong(rightNumber);
            int sumLeftNumber = 0;
            int sumRightNumber = 0;
            // сума за цифрите на лявото число
            if(intLeftNumber>=0){
            while (intLeftNumber > 0) {
                long digitLeft = intLeftNumber % 10;
                sumLeftNumber += digitLeft;
                intLeftNumber = intLeftNumber / 10;
                }
            }else{
                while (intLeftNumber < 0) {
                    long digitLeft = intLeftNumber % 10;
                    sumLeftNumber += digitLeft;
                    intLeftNumber = intLeftNumber / 10;
                }
                // сума за цифрите на дясното число
            }
            if(intRightNumber>=0){
            while (intRightNumber > 0) { // сума за цифрите на дясното число
                long digitRight = intRightNumber % 10;
                sumRightNumber += digitRight;
                intRightNumber = intRightNumber / 10;
            }
                }else{
                while (intRightNumber < 0) {
                    long digitRight = intRightNumber % 10;
                    sumRightNumber += digitRight;
                    intRightNumber = intRightNumber / 10;
                }
                }
                if (Math.abs(sumLeftNumber) >= Math.abs(sumRightNumber)) {
                    System.out.println(Math.abs(sumLeftNumber));
                } else {
                    System.out.println(Math.abs(sumRightNumber));
                }
            }
        }
    }
