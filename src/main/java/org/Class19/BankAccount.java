package org.Class19;

class BankAccount {
    protected String accountNumber;
    protected double balance;
    protected String accountHolderName;

    public BankAccount(String accountNumber, double balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ". Current balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". Current balance: " + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, String accountHolderName, double interestRate) {
        super(accountNumber, balance, accountHolderName);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interestAmount = balance * (interestRate / 100);
        deposit(interestAmount);
        System.out.println("Interest applied. Current balance: " + balance);
    }
}

class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, String accountHolderName, double overdraftLimit) {
        super(accountNumber, balance, accountHolderName);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". Current balance: " + balance);
        } else {
            System.out.println("Withdrawal exceeds overdraft limit!");
        }
    }
}

class FixedDepositAccount extends BankAccount {
    private double interestRate;
    private int maturityPeriod;

    public FixedDepositAccount(String accountNumber, double balance, String accountHolderName, double interestRate, int maturityPeriod) {
        super(accountNumber, balance, accountHolderName);
        this.interestRate = interestRate;
        this.maturityPeriod = maturityPeriod;
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Cannot withdraw from a Fixed Deposit Account before maturity period!");
    }

    public void applyInterest() {
        if (maturityPeriod > 0) {
            double interestAmount = balance * (interestRate / 100);
            deposit(interestAmount);
            System.out.println("Interest applied. Current balance: " + balance);
            maturityPeriod--;
        } else {
            System.out.println("Fixed Deposit matured. Interest can no longer be applied.");
        }
    }
}


