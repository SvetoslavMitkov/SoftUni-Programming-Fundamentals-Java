package AssociativeArrays;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap<String, List<String>> map = new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")){
            if (input.contains(" | ")){
                String side = input.split(" \\| ")[0];
                String user = input.split(" \\| ")[1];
                if (!map.containsKey(side)){
                    map.put(side, new ArrayList<>());
                    map.get(side).add(user);
                }else if(map.containsKey(side) && !map.get(side).contains(user)){
                    map.get(side).add(user);
                }
            }else if (input.contains(" -> ")){
                String side = input.split(" -> ")[1];
                String user = input.split(" -> ")[0];
                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                if (entry.getValue().contains(user) && map.containsKey(side)) {
                    map.get(side).add(user);
                    entry.getValue().remove(user);
                    System.out.printf("%s joins the %s side!%n", user, side);
                }else if (entry.getValue().contains(user) && !map.containsKey(side)){
                    map.put(side,new ArrayList<>());
                    map.get(side).add(user);
                    System.out.printf("%s joins the %s side!%n", user, side);
                }
                }if (map.containsKey(side) && !map.get(side).contains(user)){
                    map.get(side).add(user);
                    System.out.printf("%s joins the %s side!%n", user, side);
                }else if (!map.containsKey(side) && !map.containsValue(user)){
                    map.put(side, new ArrayList<>());
                    map.get(side).add(user);
                    System.out.printf("%s joins the %s side!%n", user, side);
                }
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getValue().size()>0){
            System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.printf("! %s%n", entry.getValue().get(i));
            }
            }
        }
    }
}
