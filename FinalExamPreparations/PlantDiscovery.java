package FinalExamPreparations;

import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, Integer> plantsRarityMap = new LinkedHashMap<>();
        LinkedHashMap<String, List<Double>> plantsRatingsMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String name = input.split("<->")[0];
            int rarity = Integer.parseInt(input.split("<->")[1]);
            plantsRarityMap.put(name, rarity);
        }
        String input = scanner.nextLine();
        while (!input.equals("Exhibition")){
            String command = input.split(":")[0];
            if (command.equals("Rate")){
                String name = input.split(": | - ")[1];
                double rating = Double.parseDouble(input.split(" - ")[1]);
                if (plantsRarityMap.containsKey(name)) {
                        plantsRatingsMap.putIfAbsent(name, new ArrayList<>());
                        plantsRatingsMap.get(name).add(rating);
                }else{
                    System.out.println("error");
                }
            }else if (command.equals("Update")){
                String name = input.split(": | - ")[1];
                int rarity = Integer.parseInt(input.split(" - ")[1]);
                if (plantsRarityMap.containsKey(name)) {
                    plantsRarityMap.put(name, rarity);
                }else{
                    System.out.println("error");
                }
            }else if (command.equals("Reset")){
                String name = input.split(": ")[1];
                if (plantsRarityMap.containsKey(name)) {
                    plantsRatingsMap.get(name).replaceAll(e -> e = 0.0);
                }else{
                    System.out.println("error");
                }
            }
            input = scanner.nextLine();
        }
        LinkedHashMap<String, Double> averageRatingsMap = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry : plantsRatingsMap.entrySet()) {
            double sum = 0;
            for (double rating: entry.getValue()) {
                sum += rating;
            }
            double averageRating = sum / entry.getValue().size();
            averageRatingsMap.put(entry.getKey(), averageRating);
        }

        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, Integer> entry : plantsRarityMap.entrySet()) {
            String name = entry.getKey();
            System.out.printf(" - %s; Rarity: %d; Rating: %.2f%n", entry.getKey(), entry.getValue(),
                    averageRatingsMap.get(entry.getKey()) );
        }
    }
}
