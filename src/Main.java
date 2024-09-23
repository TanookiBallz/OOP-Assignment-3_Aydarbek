
public class Main {
    public static void main(String[] args) {
        PersonalAccount testAccount = new PersonalAccount(67890, "Alice Smith");

        // Test deposit
        testAccount.deposit(1000.0);
        assert testAccount.getBalance() == 1000.0 : "Deposit failed";

        // Test withdrawal with sufficient funds
        testAccount.withdraw(500.0);
        assert testAccount.getBalance() == 500.0 : "Withdrawal failed";

        // Test withdrawal with insufficient funds
        testAccount.withdraw(600.0);
        assert testAccount.getBalance() == 500.0 : "Insufficient balance check failed";

        // Print the transaction history
        testAccount.printTransactionHistory();
    }
}