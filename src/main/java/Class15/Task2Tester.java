package Class15;

public class Task2Tester {

    public static void main(String[] args) {
        // Test the Students class with two different students
        Task2 student1 = new Task2("Anas ShoAry", 85.5, 92.0, 78.5);
        Task2 student2 = new Task2("Nagham Salih", 90.0, 88.5, 95.5);

        // Display average marks for each student
        System.out.println("Average mark for " + student1.getName() + ": " + student1.calculateAverageGrade());
        System.out.println("Average mark for " + student2.getName() + ": " + student2.calculateAverageGrade());
    }
}

