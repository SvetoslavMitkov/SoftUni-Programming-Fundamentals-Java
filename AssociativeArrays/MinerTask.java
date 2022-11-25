package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int count = 0;
        LinkedHashMap<String, Integer> resourceMap = new LinkedHashMap<>();
        String key = "";
        int value = 0;
        while (!input.equals("stop")){
            count++;
            if (count % 2 != 0){
                key = input;
               resourceMap.putIfAbsent(key, 0);
            }else{
                value = Integer.parseInt(input);
                if (resourceMap.containsKey(key)) {
                    resourceMap.put(key,resourceMap.get(key) + value);
                }
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : resourceMap.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
