package OOP;

public class BankAccount {

    int userId = 12345;
    String userName = "Pavel_Yu";
    double userBalance = 100;

    void addMoney(double add) {
        System.out.println("User " + userName + " User's Id " + userId);
        System.out.println("User's Current Balance " + userBalance);
        userBalance += add;
        System.out.println("User's New Balance " + userBalance);
        System.out.println("------------------------------");
    }

   void withdrawMoney(double withdraw) {
       System.out.println("User " + userName + " User's Id " + userId);
       System.out.println("User's Current Balance " + userBalance);
        userBalance -= withdraw;
       System.out.println("User's New Balance " + userBalance);
       System.out.println("------------------------------");
    }

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        bankAccount.addMoney(750);
        bankAccount.withdrawMoney(250);

    }

}
