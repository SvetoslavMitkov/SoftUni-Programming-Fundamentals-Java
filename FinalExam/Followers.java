package FinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Followers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        LinkedHashMap<String, Integer> likesMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> commentsMap = new LinkedHashMap<>();

        while (!command.equals("Log out")){
            String[] commandArr = command.split(": ");
            switch (commandArr[0]){
                case "New follower":
                    if (!likesMap.containsKey(commandArr[1]) && !commentsMap.containsKey(commandArr[1])){
                        likesMap.put(commandArr[1], 0);
                        commentsMap.put(commandArr[1], 0);
                    }
                    break;
                case "Like":
                    if (!likesMap.containsKey(commandArr[1])){
                        likesMap.put(commandArr[1], Integer.parseInt(commandArr[2]));
                        commentsMap.put(commandArr[1], 0);
                    }else{
                        int currentLikes = likesMap.get(commandArr[1]);
                        likesMap.put(commandArr[1], currentLikes + Integer.parseInt(commandArr[2]));
                    }
                    break;
                case "Comment":
                    if (!commentsMap.containsKey(commandArr[1])){
                        commentsMap.put(commandArr[1], 1);
                        likesMap.put(commandArr[1], 0);
                    }else{
                        int currentComments = commentsMap.get(commandArr[1]);
                        commentsMap.put(commandArr[1], currentComments + 1);
                    }
                    break;
                case "Blocked":
                    if (likesMap.containsKey(commandArr[1]) && commentsMap.containsKey(commandArr[1])){
                     likesMap.remove(commandArr[1]);
                     commentsMap.remove(commandArr[1]);
                    }else{
                        System.out.printf("%s doesn't exist.%n", commandArr[1]);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("%d followers%n", likesMap.size());
        for (Map.Entry<String, Integer> entry : likesMap.entrySet()) {
            String name = entry.getKey();
            int comments = commentsMap.get(name);
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue() + comments);
        }
    }
}
