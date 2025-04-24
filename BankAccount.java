class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited ₹" + amount);
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn ₹" + amount);
        } else {
            System.out.println("Sorry, not enough funds.");
        }
    }
}

class SavingsAccount extends BankAccount {
    private double withdrawalLimit = 50000;
    private double withdrawalFee = 50;

    public SavingsAccount(double balance) {
        super(balance);
    }

    public void withdraw(double amount) {
        if (amount <= withdrawalLimit && amount <= getBalance()) {
            super.withdraw(amount + withdrawalFee);
            System.out.println("Savings account fee: ₹" + withdrawalFee);
        } else {
            System.out.println("Sorry, withdrawal limit exceeded or insufficient funds.");
        }
    }
}

class CheckingAccount extends BankAccount {
    private double withdrawalLimit = 100000;
    private double withdrawalFee = 100;

    public CheckingAccount(double balance) {
        super(balance);
    }

    public void withdraw(double amount) {
        if (amount <= withdrawalLimit && amount <= getBalance()) {
            super.withdraw(amount + withdrawalFee);
            System.out.println("Checking account fee: ₹" + withdrawalFee);
        } else {
            System.out.println("Sorry, withdrawal limit exceeded or insufficient funds.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(100000);
        BankAccount checking = new CheckingAccount(200000);

        savings.deposit(5000);
        savings.withdraw(20000);

        checking.deposit(20000);
        checking.withdraw(150000);
    }
}
