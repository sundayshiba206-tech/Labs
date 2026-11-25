//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 6.4

/*
 * A simple class to represent a bank account.
 */

public class BankAccount {
    private String accountNumber;
    private String owner;
    private double balance;

    public BankAccount(String accountNumber, String owner, double openingBalance) {
        this.accountNumber = accountNumber;
        this.owner         = owner;
        this.balance       = openingBalance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getOwner()         { return owner; }
    public double getBalance()       { return balance; }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit rejected: amount must be positive (" + amount + ")");
            return;
        }
        balance += amount;
        System.out.println("Deposited " + amount + " -> balance " + balance);
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal rejected: amount must be positive (" + amount + ")");
            return false;
        }
        if (amount > balance) {
            System.out.println("Withdrawal rejected: insufficient funds (balance "
                    + balance + ", requested " + amount + ")");
            return false;
        }
        balance -= amount;
        System.out.println("Withdrew " + amount + " -> balance " + balance);
        return true;
    }

    @Override
    public String toString() {
        return String.format("BankAccount{%s, owner='%s', balance=%.2f}",
                accountNumber, owner, balance);
    }

    public static void main(String[] args) {
        BankAccount acct = new BankAccount("ACC-001", "Alice", 1000.00);
        System.out.println("Opened: " + acct);

        acct.deposit(500.00);
        System.out.println("After deposit:   " + acct);

        acct.withdraw(300.00);
        System.out.println("After withdraw:  " + acct);

        // Attempt an overdraft
        acct.withdraw(5000.00);
        System.out.println("After overdraft attempt: " + acct);
    }
}
