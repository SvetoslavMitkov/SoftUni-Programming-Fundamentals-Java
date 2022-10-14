package Lists;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> inputList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());


        for (int i = 0; i < inputList.size()-1; i++) {
            if (Objects.equals(inputList.get(i), inputList.get(i + 1))){
                inputList.set(i, inputList.get(i)*2 );
                inputList.remove(i + 1);
                i = -1;
            }
        }
        for (double item : inputList) {
            DecimalFormat df = new DecimalFormat("0.#");
            System.out.print(df.format(item) + " ");
        }
    }
}
