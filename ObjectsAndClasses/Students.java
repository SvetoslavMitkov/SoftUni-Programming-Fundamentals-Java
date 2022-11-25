package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    static class Student{
        private String firstName;
        private String lastName;
        private int age;
        private String homeTown;

        public Student(String firstName, String lastName, int age, String homeTown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public String getHomeTown() {
            return homeTown;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] inputArr = input.split(" ");
            Student student = new Student(inputArr[0], inputArr[1], Integer.parseInt(inputArr[2]), inputArr[3]);
            students.add(student);

            input = scanner.nextLine();
        }
        String homeTownCompare = scanner.nextLine();
        for (Student item: students) {
            if(item.getHomeTown().equals(homeTownCompare)){
                System.out.printf("%s %s is %d years old%n",item.getFirstName(),item.getLastName(),
               item.getAge() );
            }
        }
    }
}
