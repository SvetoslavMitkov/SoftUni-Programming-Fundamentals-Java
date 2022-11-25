package AssociativeArrays;

import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = new ArrayList<>();
        int j = 0;
        while (scanner.hasNextLine()) {
            Scanner lineScanner = new Scanner(scanner.nextLine());
            while (lineScanner.hasNext()) {
                input.add(lineScanner.next());
            }
            j++;
            if (j >= 10) {
                break;
            }
        }
        for (int i = 0; i < input.size(); i++) {
            input.set(i, input.get(i).toLowerCase());
        }
            LinkedHashMap<String, Integer> itemsMap = new LinkedHashMap<>();
            itemsMap.put("shards", 0);
            itemsMap.put("fragments", 0);
            itemsMap.put("motes", 0);
            boolean legendaryItemCheck = false;
            for (int i = 1; i <= input.size(); i += 2) {
                if (legendaryItemCheck) {
                    break;
                }
                String item = input.get(i);
                int quantity = Integer.parseInt(input.get(i - 1));
                if (!itemsMap.containsKey(item)) {
                    itemsMap.put(item, quantity);
                } else {
                    itemsMap.put(item, itemsMap.get(item) + quantity);
                }
                for (Map.Entry<String, Integer> entry : itemsMap.entrySet()) {
                    if (entry.getKey().equals("fragments")
                            || entry.getKey().equals("shards")
                            || entry.getKey().equals("motes")) {
                        int currentQuantity = entry.getValue();
                        if (currentQuantity >= 250) {
                            switch (entry.getKey()) {
                                case "fragments":
                                    System.out.printf("Valanyr obtained!%n", entry.getKey());
                                    legendaryItemCheck = true;
                                    itemsMap.put(entry.getKey(), entry.getValue() - 250);
                                    break;
                                case "shards":
                                    System.out.printf("Shadowmourne obtained!%n", entry.getKey());
                                    legendaryItemCheck = true;
                                    itemsMap.put(entry.getKey(), entry.getValue() - 250);
                                    break;
                                case "motes":
                                    System.out.printf("Dragonwrath obtained!%n", entry.getKey());
                                    legendaryItemCheck = true;
                                    itemsMap.put(entry.getKey(), entry.getValue() - 250);
                                    break;
                            }
                        }
                    }
                }
            }
            for (Map.Entry<String, Integer> entry : itemsMap.entrySet()) {
                System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
            }

    }
}