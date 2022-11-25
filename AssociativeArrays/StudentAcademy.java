package AssociativeArrays;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, List<Double>> studentsMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            if (!studentsMap.containsKey(name)) {
                studentsMap.put(name, new ArrayList<>());
                studentsMap.get(name).add(grade);
            }else{
                studentsMap.get(name).add(grade);
            }
        }
        LinkedHashMap<String, Double> averageGradeMap = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry : studentsMap.entrySet()) {
            double gradeSum = 0;
            for (Double grade: entry.getValue()) {
                gradeSum += grade;
            }
           double averageGrade = gradeSum / entry.getValue().size();
            averageGradeMap.put(entry.getKey(), averageGrade);
        }
        for (Map.Entry<String, Double> entry: averageGradeMap.entrySet()){
            if (entry.getValue() >= 4.5){
                System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
            }
        }
    }
}
