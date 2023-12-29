package org.Class17;

public class User {

        protected String name;
        protected String mobileNumber;

        public User(String name, String mobileNumber) {
            this.name = name;
            this.mobileNumber = mobileNumber;
        }

        public void userDetails() {
            System.out.println("User Details:");
            System.out.println("Name: " + name);
            System.out.println("Mobile Number: " + mobileNumber);
        }
    }

    class UserInfo extends User {
        private String address;

        public UserInfo(String name, String mobileNumber, String address) {
            super(name, mobileNumber);
            this.address = address;
        }

        @Override
        public void userDetails() {
            super.userDetails();
            System.out.println("Address: " + address);
        }
    }

    class Main {
        public static void main(String[] args) {
            // Create an instance of the UserInfo class
            UserInfo userWithAddress = new UserInfo("John Doe", "123-456-7890", "123 Main St, Cityville");

            // Call userDetails to print user information
            userWithAddress.userDetails();
        }
    }

