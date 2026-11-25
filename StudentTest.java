//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 6.2

/*
 * A simple class to represent a student.
 */

public class StudentTest {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Alice", 78),
            new Student("Brian", 65),
            new Student("Chloe", 91),
            new Student("David", 52),
            new Student("Eve",   83)
        };

        for (Student s : students) {
            System.out.println(s);   // calls toString() implicitly
        }
    }
}
