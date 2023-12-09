package Class14;

public class AccountTester {

    String accountNumber = "123456789";
    double balance = -350;
    String userName = "user123";
    private String password = "Pass123";

    private void printInfo() {

        System.out.print(accountNumber);

    }

    public static void main(String[] args) {
        Account a = new Account();
        System.out.println(a.password);
        a.printInfo();

    }

}