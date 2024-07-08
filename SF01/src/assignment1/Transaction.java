package assignment1;

public class Transaction {
    private final double transactionFee = 2.50;

    public final void performTransaction(Account account, double amount, boolean isDeposit) {
        if (isDeposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount);
        }
        account.withdraw(transactionFee); // Apply transaction fee
        System.out.println("Transaction complete. Current balance: " + account.getBalance());
    }

    public double getTransactionFee() {
        return transactionFee;
    }
}
