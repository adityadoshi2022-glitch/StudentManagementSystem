import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(int id, String name, int age) {
        students.add(new Student(id, name, age));
        System.out.println("Student added successfully!\n");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.\n");
            return;
        }
        System.out.println("\n--- Student List ---");
        for (Student s : students) {
            s.display();
        }
        System.out.println();
    }

    public void searchStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("Student Found: ");
                s.display();
                return;
            }
        }
        System.out.println("Student not found.\n");
    }

    public void deleteStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                students.remove(s);
                System.out.println("Student deleted successfully.\n");
                return;
            }
        }
        System.out.println("Student not found.\n");
    }
}
