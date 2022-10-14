package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputList1 = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        List<String> inputList2 = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());


        if (inputList1.size()>inputList2.size()){
            int n = 0;
            for (int i = 0; i < inputList2.size(); i++) {
             inputList1.add(1 + n,inputList2.get(i));
             n += 2;
            }
            System.out.println(inputList1.toString().replaceAll("[\\[\\],]",""));
        }else{
            int n = 0;
            for (int i = 0; i < inputList1.size(); i++) {
                inputList2.add(n,inputList1.get(i));
                n += 2;
            }
            System.out.println(inputList2.toString().replaceAll("[\\[\\],]",""));
        }

    }
}
