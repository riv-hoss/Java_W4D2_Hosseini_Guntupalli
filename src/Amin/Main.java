package Amin;

import Amin.A6.BankAcccountNegativeException;
import Amin.A6.BankAccount;
import Amin.A6.CreditCardAccount;

public class Main {

    public static void main(String[] args) {
        BankAccount account01 = new BankAccount("R. H.", 1250);
        try {
            account01.withdrawMoney(1260);
        } catch (BankAcccountNegativeException e) {
            System.out.println(e);
        }

        // creditCard of account01
        CreditCardAccount account01Credit = new CreditCardAccount
                (account01.getName(), account01.getBalance());

        try {
            account01Credit.withdrawMoney(80000.20);
        } catch (BankAcccountNegativeException e) {
            System.out.println(e);
        }


        System.out.println("\n\n================== This will be printed in any case" +
                " because of exception handling =====================");


    }

}
