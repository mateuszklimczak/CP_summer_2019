package pl.waw.sgh.bank;

import java.math.BigDecimal;

public class PlayWithBank {

    public static void main(String[] args) {
        Bank bank = new Bank("MyBank");
        Customer c1 = bank.newCustomer("John", "Smith", "john@smith.com");
        Customer c2 = bank.newCustomer("Anne", "Brown", "anne@brown.com");
        Customer c3 = bank.newCustomer("Marek", "Wrucha", "marek@wrucha.pl");

        Account a1 = bank.newCheckingAccount(c1, "EUR");
        Account a2 = bank.newSavingsAccount(c1, "EUR");

        Account a3 = bank.newCheckingAccount(c2, "EUR");
        Account a4 = bank.newSavingsAccount(c2,"EUR");

        Account a5 = bank.newCheckingAccount(c3, "PLN");
        Account a6 = bank.newSavingsAccount(c3,"PLN");

        a2.charge(100.4);
        a3.deposit(222.5);

        a5.deposit(1000.0);
        a6.deposit(10000000.0);

        bank.transfer(1002, 1003, 1000);

        System.out.println(bank);

        BigDecimal b = new BigDecimal(1330);
        BigDecimal c = BigDecimal.valueOf(456.5);
        b = b.add(c);
        System.out.println(b);
    }
}



/*
package pl.waw.sgh.bank;

public class PlayWithBank {
    public static void main(String[] args) {
        Bank bank = new Bank("MyBank");
        Customer c1 = bank.newCustomer("John", "Smith", "jogn@smith.com");
        Customer c2 = bank.newCustomer("Anne", "Brown", "anne@brown.com");

        Account a1 = bank.newCheckingAccount(c1, "EUR");
        Account a2 = bank.newSavingsAccount(c1, "EUR");

        Account a3 = bank.newCheckingAccount(c2, "EUR");
        Account a4 = bank.newSavingsAccount(c2, "EUR");

    }
}
*/



