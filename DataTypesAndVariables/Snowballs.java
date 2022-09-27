package DataTypesAndVariables;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine()); // count of snowballs
        int maxSnowballSnow = 0;
        int maxSnowballTime = 0;
        int maxSnowballQuality = 0;
        int maxValue = 0;
        for (int i = 0; i < N; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
           int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow((snowballSnow / snowballTime),snowballQuality);

            if (snowballValue>maxValue){
                maxValue = (int)snowballValue;
                maxSnowballSnow = snowballSnow;
                maxSnowballQuality = snowballQuality;
                maxSnowballTime = snowballTime;
            }
        }
        System.out.printf("%d : %d = %d (%d)",maxSnowballSnow,
                maxSnowballTime,maxValue,maxSnowballQuality);
    }
}
