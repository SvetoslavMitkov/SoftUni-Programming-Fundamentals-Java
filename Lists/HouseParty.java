package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> guestList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] guestInfo = scanner.nextLine().split(" is ");
            if (guestInfo[1].equals("going!")){
                if (guestList.contains(guestInfo[0])){
                    System.out.printf("%s is already in the list!%n",guestInfo[0]);
                }else{
                    guestList.add(guestInfo[0]);
                }
            }else if (guestInfo[1].equals("not going!")){
                if (!guestList.contains(guestInfo[0])){
                    System.out.printf("%s is not in the list!%n",guestInfo[0]);
                }else{
                    guestList.remove(guestInfo[0]);
                }
            }
        }
        for (String name : guestList) {
            System.out.println(name);
        }
    }
}
