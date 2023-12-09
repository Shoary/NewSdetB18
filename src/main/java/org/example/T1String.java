package org.example;

public class T1String {

    public static void main(String[] args) {
        String userName = "user1234";
        String password = "password";
        String confirmPassword = "pass1234";

        String resultMessage = createAccount(userName, password, confirmPassword);
        System.out.println(resultMessage);
    }

    public static String createAccount(String userName, String password, String confirmPassword) {
        if (userName.isEmpty() || password.isEmpty()) {
            return "Username or Password cannot be empty";
        } else {
            // Requirement 2: Password should be minimum 8 characters
            if (password.length() < 8) {
                return "Password is too short";
            } else {
                // Requirement 3: Password cannot contain username
                if (password.contains(userName)) {
                    return "Password cannot contain username";
                } else {
                    // Requirement 4: Password should match confirmed password
                    if (!password.equals(confirmPassword)) {
                        return "Passwords do not match";
                    } else {
                        // All requirements met
                        return "Your username and password have been created";
                    }
                }
            }
        }
    }
}