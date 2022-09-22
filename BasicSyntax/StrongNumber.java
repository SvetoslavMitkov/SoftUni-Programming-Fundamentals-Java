package BasicSyntax;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());
        int lenght = String.valueOf(num).length();
        int digit = 0;
        int sumFact = 0;
        int numInitial = num;
        for (int i = lenght-1; i>=0 ; i--) { //vzimam vsqka otdelna cifra
            digit = num % 10;
            int fact = 1;
            int countFact =0;
            for (int j = 0; j < digit ; j++) { //smqtame faktoriel za chisloto
              fact = fact + fact*countFact;
              countFact++;
            }
        sumFact+=fact; //pribavqme kum sumata ot faktorieli
            num = num/10;
        }
        if(sumFact==numInitial){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
