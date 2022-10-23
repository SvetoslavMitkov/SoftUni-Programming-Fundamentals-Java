package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DeckOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> deck = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
           String[] commandArr = command.split(", ");
           switch (commandArr[0]){
               case "Add":
                   if (!deck.contains(commandArr[1])){
                       deck.add(commandArr[1]);
                       System.out.println("Card successfully added");
                   }else{
                       System.out.println("Card is already in the deck");
                   }
                   break;
               case "Remove":
                   if (deck.contains(commandArr[1])){
                       deck.remove(commandArr[1]);
                       System.out.println("Card successfully removed");
                   }else{
                       System.out.println("Card not found");
                   }
                   break;
               case "Remove At":
                   int index = Integer.parseInt(commandArr[1]);
                   if (index >= 0 && index <= deck.size()-1){
                       deck.remove(index);
                       System.out.println("Card successfully removed");
                   }else{
                       System.out.println("Index out of range");
                   }
                   break;
               case "Insert":
                   int index1 = Integer.parseInt(commandArr[1]);
                   if (index1 >= 0 && index1 <= deck.size()-1){
                       if (!deck.contains(commandArr[2])){
                           deck.add(index1,commandArr[2]);
                           System.out.println("Card successfully added");
                       }else{
                           System.out.println("Card is already added");
                       }
                   }else{
                       System.out.println("Index out of range");
                   }

           }

        }
        System.out.println(deck.toString().replaceAll("[\\[\\]]",""));
    }
}
