import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

class Semester{
    private int semesterNumber;
    private String[] courses;
    private int[] marks;

    public Semester(int semesterNumber, String[] courses, int[] marks) {
        this.semesterNumber = semesterNumber;
        this.courses = courses;
        this.marks = marks;
    }

    public void displayCoursesAndMarks() {
        System.out.println("Semester " + semesterNumber + " Courses:");
        for (int i = 0; i < courses.length; i++) {
            System.out.println("Course: " + courses[i] + ", Marks: " + marks[i]);
        }
    }
public static void main(String[] args) throws ParseException {
            // Creating a Student object
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date dob = dateFormat.parse("2000-05-15");
            Student student = new Student("Alice", dob);
            student.displayName();
            student.displayAge();

            // Creating a Semester object
            String[] coursesSem1 = {"Mathematics", "Physics", "Chemistry"};
            int[] marksSem1 = {85, 78, 90};
            Semester sem1 = new Semester(1, coursesSem1, marksSem1);
            sem1.displayCoursesAndMarks();
    }
}