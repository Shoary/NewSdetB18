package org.Class16;
 /*
 Write a java program called Teacher Identify features and 4 behaviour of that class. Create 3 subclasses
 MathTeacher , Chemistry Teacher and Pino Teacher. Test all 4 classes
  */
// Teacher class
 // Base class (superclass)
 class Teacher {
     // Features
     String name;
     String subject;

     // Behaviors
     void teach() {
         System.out.println(name + " is teaching " + subject);
     }

     void conductExam() {
         System.out.println(name + " is conducting an exam in " + subject);
     }

     void takeAttendance() {
         System.out.println(name + " is taking attendance for " + subject);
     }

     void evaluate() {
         System.out.println(name + " is evaluating assignments in " + subject);
     }
 }

class MathTeacher extends Teacher {
    MathTeacher(String name) {
        this.name = name;
        this.subject = "Mathematics";
    }
}

class ChemistryTeacher extends Teacher {
    ChemistryTeacher(String name) {
        this.name = name;
        this.subject = "Chemistry";
    }
}

class PianoTeacher extends Teacher {
    PianoTeacher(String name) {
        this.name = name;
        this.subject = "Piano";
    }
}




