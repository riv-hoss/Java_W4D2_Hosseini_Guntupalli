package Amin.A6;

public class CreditCardAccount extends BankAccount{

    public CreditCardAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void withdrawMoney(double amount) throws BankAcccountNegativeException {
        if (getBalance() - amount < -3500.00) {
            throw new BankAcccountNegativeException("Cannot expend more than your credit!");
        } else {
            setBalance(getBalance() + amount);
        }
    }
}
