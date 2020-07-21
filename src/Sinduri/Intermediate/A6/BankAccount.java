package Sinduri.Intermediate.A6;

public class BankAccount {
    public static int staticId = 0;
    private int customerID;
    private String customerName;
    double accountBalance;

    public BankAccount(String customerName, double accountBalance) throws BankAccountNegativeException {
        if (accountBalance < 0) {
            throw new BankAccountNegativeException("Account Balance cannot be less than zero");
        } else {
            staticId++;
            setCustomerID(staticId);
            setCustomerName(customerName);
            setAccountBalance(accountBalance);
            System.out.println("Account Created!");
        }

    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void addMoney(double amount) {
        this.accountBalance += amount;
    }

    public void withdrawMoney(double amount) throws BankAccountNegativeException {
        accountBalance -= amount;
        if (accountBalance < 0) {
            accountBalance += amount;
            throw new BankAccountNegativeException("Cannot Withdraw desired money. Account Balance cannot be less than zero");
        }

    }

}
