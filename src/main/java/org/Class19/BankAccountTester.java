package org.Class19;

public class BankAccountTester {

        public static void main(String[] args) {
            // Create objects of each type
            SavingsAccount savingsAccount = new SavingsAccount("AS001", 1000, "Anas Sho", 5);
            CheckingAccount checkingAccount = new CheckingAccount("CA001", 1500, "Anas Sho", 500);
            FixedDepositAccount fixedDepositAccount = new FixedDepositAccount("NSA001", 2000, "Nagham", 8, 3);

            // Store them in a list
            BankAccount[] accountsArray = {savingsAccount, checkingAccount, fixedDepositAccount};

            // Perform operations
            for (BankAccount account : accountsArray) {
                System.out.println("\nAccount Information:");
                account.displayInfo();
                account.deposit(500);
                account.withdraw(200);
                if (account instanceof SavingsAccount) {
                    ((SavingsAccount) account).applyInterest();
                }
                System.out.println("\n");
            }
        }
    }


