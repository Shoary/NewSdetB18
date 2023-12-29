package review8_1;
import Review8.Doctor;

public class Orthodontist extends Doctor {

    public Orthodontist(String firstName, String lastName, String speciality, int yearsOfExperience) {
        super(firstName, lastName, speciality, yearsOfExperience);
    }

    public void printSpeciality() {
        System.out.println("I am " + speciality);
    }

    public void prescribeMedication(String medication) {
        // Assuming 'speciality' is an instance variable of the superclass
        System.out.println(speciality + " prescribes special medication " + medication);
    }
}

