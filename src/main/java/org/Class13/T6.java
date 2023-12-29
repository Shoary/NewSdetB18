package org.Class13;
/*
Create a method createEmail(). Based on values of users firstName, lastName and email type,
your method should return complete email Address.
Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
 */public class T6 {
    public static void main(String[] args) {
        // Test the createEmail method with different values
        String email1 = createEmail("Zack", "Al", "gmail");
        String email2 = createEmail("Anas", "ShoAry", "yahoo");
        String email3 = createEmail("Nagham", "Salih", "outlook");

        System.out.println("Email 1: " + email1);
        System.out.println("Email 2: " + email2);
        System.out.println("Email 3: " + email3);
    }

    // Method to create an email address based on firstName, lastName, and email type
    private static String createEmail(String firstName, String lastName, String emailType) {
        // Convert names to lowercase for consistency
        String lowercaseFirstName = firstName.toLowerCase();
        String lowercaseLastName = lastName.toLowerCase();

        // Generate the email address based on the specified email type
        switch (emailType.toLowerCase()) {
            case "gmail":
                return lowercaseFirstName + lowercaseLastName + "@gmail.com";
            case "yahoo":
                return lowercaseFirstName + lowercaseLastName + "@yahoo.com";
            case "outlook":
                return lowercaseFirstName + lowercaseLastName + "@outlook.com";
            default:
                return " ";
        }
    }
}

