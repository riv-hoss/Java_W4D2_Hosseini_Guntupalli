package Sinduri.Intermediate.A6;

public class CreditCardAccount extends BankAccount {
    public CreditCardAccount(String customerName, double creditAccountBalance) throws BankAccountNegativeException {
        super(customerName, creditAccountBalance);
    }



    public void withdrawMoney(double amount) throws BankAccountNegativeException {
        accountBalance -= amount;
        if (accountBalance < -3500) {
            accountBalance += amount;
            throw new BankAccountNegativeException("Cannot Withdraw desired money. Account Balance cannot be less than -3500");
        }

    }
}
