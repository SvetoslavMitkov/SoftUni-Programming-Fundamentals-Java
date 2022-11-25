package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {
    static class Song {
        private String typeList;
        private String name;
        private String duration;

        public Song(String typeList, String name, String duration) {
            this.typeList = typeList;
            this.name = name;
            this.duration = duration;
        }

        public String getTypeList() {
            return this.typeList;
        }

        public String getName() {
            return this.name;
        }

        public String getDuration() {
            return this.duration;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Song> songs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("_");
            Song currentSong = new Song(input[0],input[1],input[2]);
            songs.add(currentSong);
        }
        String command = scanner.nextLine();
        if (command.equals("all")){
            for (Song item: songs) {
                System.out.println(item.getName());
            }
            }else{
            for (Song item: songs) {
                if(item.getTypeList().equals(command)){
                    System.out.println(item.getName());
                }
            }
        }

    }

}
