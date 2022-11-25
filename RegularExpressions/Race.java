package RegularExpressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputNames = scanner.nextLine();
        String[] inputArr = inputNames.split(", ");
        TreeMap<String, Integer> racersMap = new TreeMap<>();
        for (String name: inputArr) {
            racersMap.put(name, 0);
        }
        String inputRacer = scanner.nextLine();
        Pattern patternName = Pattern.compile("[A-Z]|[a-z]");
        Pattern patternDigits = Pattern.compile("\\d");
        while (!inputRacer.equals("end of race")){
            String name = "";
            int distance = 0;
            Matcher matcherName = patternName.matcher(inputRacer);
            Matcher matcherDistance = patternDigits.matcher(inputRacer);
            while (matcherName.find()){
                name += matcherName.group();
            }
            while (matcherDistance.find()){
                distance += Integer.parseInt(matcherDistance.group());
            }
            if (racersMap.containsKey(name)){
                racersMap.put(name,racersMap.get(name) + distance);
            }
            inputRacer = scanner.nextLine();
        }

        List<String> sortedRacers = racersMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3).map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.printf("1st place: %s%n", sortedRacers.get(0));
        System.out.printf("2nd place: %s%n", sortedRacers.get(1));
        System.out.printf("3rd place: %s%n", sortedRacers.get(2));
    }
}
