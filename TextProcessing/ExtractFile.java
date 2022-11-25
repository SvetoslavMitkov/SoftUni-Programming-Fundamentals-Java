package TextProcessing;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String filePath = scanner.nextLine();
        String[] fileArr = filePath.split("\\\\");
        String file = fileArr[fileArr.length-1];
        String fileName = file.split("[.]")[0];
        String fileExtension = file.split("[.]")[1];
        System.out.println();

        System.out.printf("File name: %s%n", fileName);
        System.out.printf("File extension: %s%n", fileExtension);
    }
}
