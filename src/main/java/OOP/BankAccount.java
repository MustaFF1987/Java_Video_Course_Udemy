package OOP;

public class BankAccount {

    int userId;
    String userName;
    double userBalance;

    double addMoney(double add) {
        double newBalance = userBalance + add;
        return newBalance;
    }

    double withdrawMoney(double withdraw) {
        double newBalance = userBalance - withdraw;
        return newBalance;

    }

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        bankAccount.userId = 1234567;
        bankAccount.userName = "Pavel_Yu";
        bankAccount.userBalance = 5_000;

        System.out.println("New balance on my account: " + bankAccount.addMoney(2_000) + "€");
        bankAccount.userBalance = bankAccount.addMoney(2_000);
        System.out.println("My balance after withdrawal: " + bankAccount.withdrawMoney(6_000)+ "€");

    }

}
