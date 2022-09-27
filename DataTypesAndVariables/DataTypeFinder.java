package DataTypesAndVariables;

import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.contains("END")) {
            Scanner match = new Scanner(input);
            if (match.hasNextInt()) {
                System.out.printf("%s is integer type%n",input);
            }else if(match.hasNextDouble()){
                System.out.printf("%s is floating point type%n",input);
            }else if(match.hasNextBoolean()) {
                System.out.printf("%s is boolean type%n",input);
            }else if(match.hasNextLine()){
                if (input.length()==1){
                    System.out.printf("%s is character type%n",input);
                }else{
                    System.out.printf("%s is string type%n",input);
                }
            }
            input = scanner.nextLine();
            }


        }
        }



