package DataTypesAndVariables;

import java.util.Scanner;

public class Pokemon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine()); // poke power
        int M = Integer.parseInt(scanner.nextLine()); // distance between pokes
        byte Y = Byte.parseByte(scanner.nextLine()); // exhaustion factor
        double exhaustPercent = N / 2;
        int subtraction = 0;
        int pokedTargets = 0;

        while (N >= M){
            subtraction = N - M;
            if (subtraction == exhaustPercent){
                if (Y != 0){
                    subtraction = subtraction / Y;
                    while (subtraction>=M){
                        subtraction -= M;
                        if(subtraction<0){
                            subtraction +=M;
                            pokedTargets++;
                            System.out.println(subtraction);
                            System.out.println(pokedTargets);
                            break;
                        }else{
                            pokedTargets++;
                        }
                    }
                    pokedTargets++;
                    break;
                }
            }
            pokedTargets++;
            N-=M;
        }
        System.out.println(subtraction);
        System.out.println(pokedTargets);
    }
}
