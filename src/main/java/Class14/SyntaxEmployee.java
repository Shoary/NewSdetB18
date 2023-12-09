package Class14;

/*
Create a class called Syntax Employee:
.create two objects of the class SyntaxEmployee
.Set the value of eID,salary for each of the objects
.Print out the eID,salary and CEO for each of the objects
 */
public class SyntaxEmployee {

        // Class variables
        private int eID;
        private double salary;
        private static String CEO = "Anas ShoAry"; // Assuming the CEO is the same for all employees

        // Constructor
        public SyntaxEmployee(int eID, double salary) {
                this.eID = eID;
                this.salary = salary;
        }

        // Getter methods
        public int getEID() {
                return eID;
        }

        public double getSalary() {
                return salary;
        }

        public static String getCEO() {
                return CEO;
        }

        // Static method to print details for an employee
        public static void printEmployeeDetails(SyntaxEmployee employee) {
                System.out.println("eID: " + employee.getEID());
                System.out.println("Salary: $" + employee.getSalary());
                System.out.println("CEO: " + SyntaxEmployee.getCEO());
                System.out.println();
        }

        public static void main(String[] args) {
                // Create two objects of the class SyntaxEmployee
                SyntaxEmployee employee1 = new SyntaxEmployee(101, 50000.0);
                SyntaxEmployee employee2 = new SyntaxEmployee(102, 60000.0);

                // Print out details for each employee using the static method
                System.out.println("Employee 1:");
                SyntaxEmployee.printEmployeeDetails(employee1);

                System.out.println("Employee 2:");
                SyntaxEmployee.printEmployeeDetails(employee2);
        }
}








