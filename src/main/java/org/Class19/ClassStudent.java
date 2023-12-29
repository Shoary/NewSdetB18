package org.Class19;

public class ClassStudent {

    class Student {
        String name;
        int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void study() {
            System.out.println(name + " is studying.");
        }

        void participateInActivities() {
            System.out.println(name + " is participating in activities.");
        }

        void attendClasses() {
            System.out.println(name + " is attending classes.");
        }
    }

    class SyntaxStudent extends Student {
        String syntaxCourse;

        public SyntaxStudent(String name, int age, String syntaxCourse) {
            super(name, age);
            this.syntaxCourse = syntaxCourse;
        }

        @Override
        void study() {
            System.out.println(name + " is studying " + syntaxCourse + " at Syntax.");
        }

        void practiceCoding() {
            System.out.println(name + " is practicing coding for " + syntaxCourse + ".");
        }
    }

    class CollegeStudent extends Student {
        String collegeName;

        public CollegeStudent(String name, int age, String collegeName) {
            super(name, age);
            this.collegeName = collegeName;
        }

        @Override
        void participateInActivities() {
            System.out.println(name + " is participating in college activities at " + collegeName + ".");
        }

        void attendInternship() {
            System.out.println(name + " is attending an internship during college.");
        }
    }

    class SchoolStudent extends Student {
        String schoolName;

        public SchoolStudent(String name, int age, String schoolName) {
            super(name, age);
            this.schoolName = schoolName;
        }

        void goToSchool() {
            System.out.println(name + " is going to school at " + schoolName + ".");
        }
    }

    public class PolymorphismExample {
        public void main(String[] args) {
            Student syntaxStudent = new SyntaxStudent("John", 20, "Java Programming");
            Student collegeStudent = new CollegeStudent("Alice", 22, "XYZ College");
            Student schoolStudent = new SchoolStudent("Bob", 15, "ABC School");

            // Achieving run-time polymorphism
            performStudentActivities(syntaxStudent);
            performStudentActivities(collegeStudent);
            performStudentActivities(schoolStudent);
        }

        static void performStudentActivities(Student student) {
            student.study();
            student.participateInActivities();
            student.attendClasses();

            // Specific methods for each subclass
            if (student instanceof SyntaxStudent) {
                ((SyntaxStudent) student).practiceCoding();
            } else if (student instanceof CollegeStudent) {
                ((CollegeStudent) student).attendInternship();
            } else if (student instanceof SchoolStudent) {
                ((SchoolStudent) student).goToSchool();
            }

            System.out.println("***************************");
        }
    }

}
