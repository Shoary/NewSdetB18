package org.Class16;

public class TeacherTester {


        public static void main(String[] args) {
            MathTeacher mathTeacher = new MathTeacher("Ms. Smith");
            ChemistryTeacher chemistryTeacher = new ChemistryTeacher("Mr. Johnson");
            PianoTeacher pianoTeacher = new PianoTeacher("Mrs. Davis");

            // Testing behaviors
            mathTeacher.teach();
            mathTeacher.conductExam();

            chemistryTeacher.teach();
            chemistryTeacher.takeAttendance();

            pianoTeacher.teach();
            pianoTeacher.evaluate();
        }
    }
