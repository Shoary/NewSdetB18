package Class15;

public class Person {
    String name;
    String age;
    double weight;
    double salary;
    String favPLanguage;

    // Constructor with all parameters
    public Person(String pName, int pAge, double pWeight, double pSalary, String pFavPLan) {
        name = pName;
        age = String.valueOf(pAge);  // Convert int to String
        weight = pWeight;
        salary = pSalary;
        favPLanguage = pFavPLan;
    }

    // Constructor without favorite programming language
    public Person(String pName, String pAge, double pWeight, double pSalary) {
        name = pName;
        age = pAge;
        weight = pWeight;
        salary = pSalary;

        // No need to print anything in the constructor
    }

    // Constructor with generic parameter names
    public Person(String pName, int pAge, double pWeight) {
        name = pName;
        age = String.valueOf(pAge);  // Convert int to String
        weight = pWeight;

        // No need to print anything in the constructor

        System.out.println("Person 1: " );
        System.out.println("Person 2: " );
        System.out.println("Person 3: " );
    }
}
