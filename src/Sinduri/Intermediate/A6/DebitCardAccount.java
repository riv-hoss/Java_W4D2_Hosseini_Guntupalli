package Sinduri.Intermediate.A6;

public class DebitCardAccount extends BankAccount {

    public DebitCardAccount(String customerName, double accountBalance) throws BankAccountNegativeException {
        super(customerName, accountBalance);
    }
}
