package assignment1;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Bank bank2 = new Bank();
        System.out.println("Total accounts: " + Bank.getTotalAccounts());

        SavingsAccount savings = new SavingsAccount(1000);
        CheckingAccount checking = new CheckingAccount(500);

        Transaction transaction = new Transaction();

        transaction.performTransaction(savings, 200, true); // Deposit to savings
        transaction.performTransaction(checking, 150, false); // Withdraw from checking
    }
}

