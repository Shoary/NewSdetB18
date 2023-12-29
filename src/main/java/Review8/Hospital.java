package Review8;

public class Hospital {

        public static void main(String[] args) {
            Doctor.hospital = "General Hospital";

            Doctor doctor = new Doctor("Ezzel", "Shoary", "General Medicine", 5);
            Surgeon surgeon = new Surgeon("Nagham", "Salih", "General Surgery", 15, "Operating Room 1");

            System.out.println("Working at " + Doctor.hospital);
            doctor.work();
            surgeon.work();

            System.out.println("\nDoctor Information:");
            doctor.displayInfo();
            doctor.checkVitals();
            doctor.checkVitals("Patient A");
            doctor.prescribeMedication("Painkillers");

            System.out.println("\nSurgeon Information:");
            surgeon.displayInfo();
            surgeon.checkVitals();
            surgeon.checkVitals("Patient B");
            surgeon.prescribeMedication("Antibiotics");
        }
    }

