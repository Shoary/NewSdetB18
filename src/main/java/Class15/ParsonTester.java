package Class15;


class PersonTester {
    public static void main(String[] args) {

        // Using the constructor with all parameters
        Person p = new Person("zion", 22, 70, 9000, "Java");

        // Using the constructor without favorite programming language
        Person p2 = new Person("zion", "22", 70, 9000);

        // Using the constructor with generic parameter names
        Person p3 = new Person("zion", 22, 70);
    }
}
