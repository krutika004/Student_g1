import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private Date dob;

    public Student(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }

    public void displayName() {
        System.out.println("Name: " + name);
    }

    public void displayAge() {
        Date currentDate = new Date();
        long diff = currentDate.getTime() - dob.getTime();
        long ageInMilliseconds = diff;
        // Convert milliseconds to years
        long ageInMillisPerYear = 1000L * 60 * 60 * 24 * 365;
        long age = ageInMilliseconds / ageInMillisPerYear;
        System.out.println("Age: " + age + " years");
    }

    public static void main(String[] args) throws ParseException {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date dob = dateFormat.parse("15-05-2000");
            Student student = new Student("Alice", dob);
            student.displayName();
            student.displayAge();
    }
}
