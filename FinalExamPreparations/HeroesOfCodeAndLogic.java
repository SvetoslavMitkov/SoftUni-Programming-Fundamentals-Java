package FinalExamPreparations;

import java.util.*;

public class HeroesOfCodeAndLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> heroesMapHP = new LinkedHashMap<>();
        Map<String, Integer> heroesMapMP = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] inputArr = input.split(" ");
            if(Integer.parseInt(inputArr[1]) <= 100) {
                heroesMapHP.put(inputArr[0], Integer.parseInt(inputArr[1]));
            }
            if (Integer.parseInt(inputArr[2]) <= 200) {
                heroesMapMP.put(inputArr[0], Integer.parseInt(inputArr[2]));
            }
        }
        String command = scanner.nextLine();
        while (!command.equals("End")){
            String[] commandArr = command.split(" - ");
            String hero = commandArr[1];
            switch (commandArr[0]){
                case "CastSpell":
                    int spellCost = Integer.parseInt(commandArr[2]);
                    String spellName = commandArr[3];
                    if (heroesMapMP.get(hero) >= spellCost){
                        int manaLeft = heroesMapMP.get(hero) - spellCost;
                        heroesMapMP.put(hero, manaLeft);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", hero, spellName, manaLeft);
                    }else{
                        System.out.printf("%s does not have enough MP to cast %s!%n", hero, spellName);
                    }
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(commandArr[2]);
                    String attacker = commandArr[3];
                    if (heroesMapHP.get(hero) > damage){
                        int healthLeft = heroesMapHP.get(hero) - damage;
                        heroesMapHP.put(hero, healthLeft);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",
                                hero, damage, attacker, healthLeft);
                    }else{
                        System.out.printf("%s has been killed by %s!%n", hero, attacker);
                        heroesMapHP.remove(hero);
                    }
                    break;
                case "Recharge":
                    int amountMP = Integer.parseInt(commandArr[2]);
                    if (heroesMapMP.get(hero) + amountMP < 200){
                        int rechargedMP = heroesMapMP.get(hero) + amountMP;
                        heroesMapMP.put(hero, rechargedMP);
                        System.out.printf("%s recharged for %d MP!%n", hero, amountMP);
                    }else{
                        System.out.printf("%s recharged for %d MP!%n", hero, 200 - heroesMapMP.get(hero));
                        heroesMapMP.put(hero, 200);
                    }
                    break;
                case "Heal":
                    int amountHP = Integer.parseInt(commandArr[2]);
                    if (heroesMapHP.get(hero) + amountHP < 100){
                        int rechargedHP = heroesMapHP.get(hero) + amountHP;
                        heroesMapHP.put(hero, rechargedHP);
                        System.out.printf("%s healed for %d HP!%n", hero, amountHP);
                    }else{
                        System.out.printf("%s healed for %d HP!%n",hero ,100 - heroesMapHP.get(hero));
                        heroesMapHP.put(hero, 100);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : heroesMapHP.entrySet()) {
            if (entry.getValue() > 0){
                System.out.println(entry.getKey());
                System.out.printf(" HP: %d%n", entry.getValue());
                System.out.printf(" MP: %d%n", heroesMapMP.get(entry.getKey()));
            }
        }
    }
}
