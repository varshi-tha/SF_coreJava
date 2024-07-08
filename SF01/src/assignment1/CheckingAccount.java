package assignment1;

public class CheckingAccount extends Account {
    private static final double OVERDRAFT_LIMIT = 500.00;

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + OVERDRAFT_LIMIT) {
            balance -= amount;
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}


