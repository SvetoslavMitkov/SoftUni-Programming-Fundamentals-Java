package TextProcessing;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split("\\s+");
        int sum = sumOfStrings(inputArr[0],inputArr[1]);
        System.out.println(sum);

    }
    private static Integer sumOfStrings (String text1, String text2){
        String longText = "";
        String shortText = "";

        if (text1.length() >= text2.length()){
            longText = text1;
            shortText = text2;
        }else{
            longText = text2;
            shortText = text1;
        }
        char[] charArrLong = longText.toCharArray();
        char[] charArrShort = shortText.toCharArray();
        int sum = 0;

        for (int i = 0; i < shortText.length(); i++) {
            sum += charArrLong[i] * charArrShort[i];
        }
        for (int i = shortText.length(); i < longText.length() ; i++) {
            sum += charArrLong[i];
        }
        return sum;
    }
}
