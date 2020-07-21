package Sinduri.Intermediate.A6;

public class Main {
    public static void main(String[] args) throws BankAccountNegativeException {

        try {
            BankAccount account1 = new BankAccount("Sin", 240);
            try {
                account1.withdrawMoney(20);
                System.out.println("Balance: " + account1.getAccountBalance());
            } catch (BankAccountNegativeException e) {
                System.out.println(e.getMessage());
            } catch (NullPointerException ne) {
                System.out.println(ne);
            }
        } catch (BankAccountNegativeException e) {
            System.out.println(e.getMessage());
        }

        try {
            BankAccount account1 = new BankAccount("Sin", -100);
            try {
                account1.withdrawMoney(250);
                System.out.println("Balance: " + account1.getAccountBalance());
            } catch (BankAccountNegativeException e) {
                System.out.println(e.getMessage());
            } catch (NullPointerException ne) {
                System.out.println(ne);
            }
        } catch (BankAccountNegativeException e) {
            System.out.println("Account not created.");
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("\nCreating a Debit Card Account: ");
            DebitCardAccount account1 = new DebitCardAccount("Sin", 100);
            try {
                System.out.println("Withdrawing:");
                account1.withdrawMoney(50);
                System.out.println("Balance: " + account1.getAccountBalance());
            } catch (BankAccountNegativeException e) {
                System.out.println(e.getMessage());
            } catch (NullPointerException ne) {
                System.out.println(ne);
            }
        } catch (BankAccountNegativeException e) {
            System.out.println("Account not created.");
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("\nCreating a Credit Card Account: ");
            CreditCardAccount account1 = new CreditCardAccount("Sin", 100);
            try {
                System.out.println("Withdrawing:");
                account1.withdrawMoney(250);
                System.out.println("Balance: " + account1.getAccountBalance());
            } catch (BankAccountNegativeException e) {
                System.out.println(e.getMessage());
            } catch (NullPointerException ne) {
                System.out.println(ne);
            }
        } catch (BankAccountNegativeException e) {
            System.out.println("Account not created.");
            System.out.println(e.getMessage());
        }






    }
}
