package AssociativeArrays;

import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap<String, List<Double>> productMap = new LinkedHashMap<>();

        while(!input.equals("buy")){
            String[] inputArr = input.split(" ");
            if (!productMap.containsKey(inputArr[0])) {
                productMap.put(inputArr[0],new ArrayList<>());
                productMap.get(inputArr[0]).add(Double.parseDouble(inputArr[1]));
                productMap.get(inputArr[0]).add(Double.parseDouble(inputArr[2]));
            }else{
                double oldQuantity = productMap.get(inputArr[0]).get(1);
                productMap.get(inputArr[0]).set(0, Double.parseDouble(inputArr[1]));
                productMap.get(inputArr[0]).set(1,oldQuantity + Double.parseDouble((inputArr[2])));
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<Double>> entry : productMap.entrySet()) {
            double totalPrice = entry.getValue().get(0) * entry.getValue().get(1);
            System.out.printf("%s -> %.2f%n", entry.getKey(), totalPrice);
        }
    }
}
