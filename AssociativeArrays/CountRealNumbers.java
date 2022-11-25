package AssociativeArrays;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numsArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble).toArray();
        TreeMap<Double, Integer> numsMap = new TreeMap<>();

        for (double num: numsArr) {
            if (!numsMap.containsKey(num)){
                numsMap.put(num, 1);
            }else{
                numsMap.put(num, numsMap.get(num) + 1);
            }
        }
        for (Map.Entry<Double, Integer> entry : numsMap.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
