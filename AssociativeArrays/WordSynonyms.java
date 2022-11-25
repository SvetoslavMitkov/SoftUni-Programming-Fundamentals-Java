package AssociativeArrays;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, List<String>> synonymMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            synonymMap.putIfAbsent(word,new ArrayList<>());
            synonymMap.get(word).add(synonym);
        }
        for (Map.Entry<String, List<String>> stringListEntry : synonymMap.entrySet()) {
            System.out.printf("%s - %s", stringListEntry.getKey(), String.join(", ", stringListEntry.getValue()));
        }

    }
}
