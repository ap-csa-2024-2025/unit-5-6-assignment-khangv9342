import java.util.Scanner;

public class Student {
    private int ID;
    private int grade;
    private String name;

    // Constructor
    public Student(int input_id, int input_grade, String input_name) {
        this.ID = input_id;
        this.grade = input_grade;
        this.name = input_name;
    }

    // toString method
    public String toString() {
        return "ID: " + ID + "\nName: " + name + "\nGrade: " + grade;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter student grade: ");
        int grade = scanner.nextInt();
        scanner.nextLine(); // Consume the newline left after nextInt()

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        // Create a new Student object
        Student student = new Student(id, grade, name);

        // Print student details
        System.out.println("\nStudent Details:");
        System.out.println(student);

        scanner.close();
    }
}
