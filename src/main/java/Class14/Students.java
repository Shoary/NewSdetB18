package Class14;
/* Create a class called Students
.Create three variables Name,ID and numberOfStudents
.Create three objects of the Students class
.Set the value for studentName ,studentID and increment the numberOfStudents for each object
.Print out total number pf students
 */
public class Students {
    // Class variables
    private String studentName;
    private int studentID;
    private static int numberOfStudents = 0;

    // Constructor
    public Students(String studentName, int studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
        numberOfStudents++;
    }

    // Getter methods
    public String getStudentName() {
        return studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public static int getNumberOfStudents() {
        return numberOfStudents;
    }

    public static void main(String[] args) {
        // Create three objects of the class Students
        Students student1 = new Students("Alice", 101);
        Students student2 = new Students("Bob", 102);
        Students student3 = new Students("Charlie", 103);

        // Print out total number of students
        System.out.println("Total number of students: " + Students.getNumberOfStudents());
    }
}
