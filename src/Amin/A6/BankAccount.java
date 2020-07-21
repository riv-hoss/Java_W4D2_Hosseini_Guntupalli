package Amin.A6;

public class BankAccount {
    private String name;
    private double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void addMoney(double amount) {
        this.balance += amount;
    }

    public void withdrawMoney (double amount) throws BankAcccountNegativeException{
        if (this.balance - amount < 0.00) {
            throw new BankAcccountNegativeException("Cannot withdraw more than your balance!");
        } else {
            this.balance -= amount;
        }

    }
}
