package FinalExam;

import java.util.Scanner;

public class Hogwarts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String command = scanner.nextLine();
        String spell = input;

        while (!command.equals("Abracadabra")){
           String[] commandArr = command.split(" ");
            switch (commandArr[0]){
                case "Abjuration":
                    StringBuilder spellSB = new StringBuilder();
                    for (char symbol: spell.toCharArray()) {
                        if (Character.isLetter(symbol)){
                           char newSymbol = Character.toUpperCase(symbol);
                           spellSB.append(newSymbol);
                        }else{
                            spellSB.append(symbol);
                        }
                    }
                    spell = spellSB.toString();
                    System.out.println(spell);
                    break;
                case "Necromancy":
                    spellSB = new StringBuilder();
                    for (char symbol: spell.toCharArray()) {
                        if (Character.isLetter(symbol)){
                        char newSymbol = Character.toLowerCase(symbol);
                        spellSB.append(newSymbol);
                        }else{
                         spellSB.append(symbol);
                        }
                    }
                    spell = spellSB.toString();
                    System.out.println(spell);
                    break;
                case "Illusion":
                    int index = Integer.parseInt(commandArr[1]);
                    char newLetter = commandArr[2].charAt(0);
                    spellSB = new StringBuilder();
                    if (index >= 0 && index < spell.length()){
                       // char letterToReplace = input.charAt(index);
                       char[] spellCharArr = spell.toCharArray();
                       spellCharArr[index] = newLetter;
                        for (char symbol: spellCharArr) {
                            spellSB.append(symbol);
                        }
                        spell = spellSB.toString();
                        System.out.println("Done!");
                    }else{
                        System.out.println("The spell was too weak.");
                    }
                    break;
                case "Divination":
                    String stringToRemove = commandArr[1];
                    String stringToInsert = commandArr[2];
                    if (spell.contains(stringToRemove)){
                        spell = spell.replaceAll(stringToRemove, stringToInsert);
                        System.out.println(spell);
                    }
                    break;
                case "Alteration":
                    String  substringToRemove = commandArr[1];
                    if (spell.contains(substringToRemove)){
                       spell = spell.replaceFirst(substringToRemove, "");
                        System.out.println(spell);
                    }
                    break;
                default:
                    System.out.println("The spell did not work!");
                    break;
            }
           command = scanner.nextLine();
        }

    }
}
