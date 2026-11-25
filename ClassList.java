//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 6.6

/*
 * A simple class to represent a list of students.
 */

public class ClassList {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Alice",   78),
            new Student("Brian",   65),
            new Student("Chloe",   91),
            new Student("David",   52),
            new Student("Eve",     83),
            new Student("Frank",   74),
            new Student("Grace",   88),
            new Student("Henry",   60),
            new Student("Ivy",     95),
            new Student("Jack",    71)
        };

        if (students.length == 0) {
            System.out.println("No students.");
            return;
        }

        // Highest — single pass, no Math.max needed
        Student top = students[0];
        int sum = 0;
        for (Student s : students) {
            sum += s.getScore();
            if (s.getScore() > top.getScore()) {
                top = s;
            }
        }

        double average = (double) sum / students.length;

        System.out.println("Top student: " + top);
        System.out.println("Average:     " + String.format("%.2f", average));
    }
}
