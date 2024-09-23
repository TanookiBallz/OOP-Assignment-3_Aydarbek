import java.util.ArrayList;
import java.util.List;

public class PersonalAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private List<Amount> transactions;

    public PersonalAccount(int accountNumber, String accountHolder){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();

    }
    public void deposit(double amount) {
        if (amount > 0) {
            transactions.add(new Amount(amount, TransactionType.DEPOSIT));
            balance += amount;
        }

    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            transactions.add(new Amount(amount, TransactionType.WITHDRAWAL));
            balance -= amount;
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    public void printTransactionHistory() {
        for (Amount transaction : transactions) {
            System.out.println("Transaction Type: " + transaction.getTransactionType() +
                    ", Amount: " + transaction.getAmount());
        }
    }
    public double getBalance() {
        return balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}
