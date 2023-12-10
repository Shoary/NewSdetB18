package Class15;
/*
Write a Teacher Class that have instance variables name and address .Create a constructor
that will initialize those variables .Print name & address of given Teacher using displayInfo method.
 */
public class Teacher {

    private String name;
    private String address;

    // Constructor
    public Teacher(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Method to display information
    public void printInfo() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Teacher Address: " + address);
    }

    public static void main(String[] args) {
        // Creating an instance of the Teacher class
        Teacher teacher1 = new Teacher("Anas", "211 Sparrow Hawk Dr, Mckinney, Texas");

        // Displaying information about the teacher
        teacher1.printInfo();
    }
}


