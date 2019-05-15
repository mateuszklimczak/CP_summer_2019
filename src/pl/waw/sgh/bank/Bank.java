package pl.waw.sgh.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String name;

    private List<Customer> customerList = new ArrayList<>();

    private List<Account> accountList = new ArrayList<>();;

    private Integer lastCustID = 0;

    private Integer lastAccID = 1000;

    public Bank(String name){
        this.name = name;
    }

    public Customer newCustomer(String firstName, String lastName, String email){
        Customer cust = new Customer(lastCustID++, firstName, lastName, email);
        customerList.add(cust);
        return cust;
    }

    private Account newAccount(Customer customer, String currency, boolean isChecinkg){
        Account acc = isChecinkg ?
                new CheckingAccount(lastAccID++, currency, customer)
                : new SavingsAccount(lastAccID++, currency, customer);
        accountList.add(acc);
        return acc;
    }

    public Account newCheckingAccount(Customer customr, String currency){
        return newAccount(customr, currency,true);
    }

    public Account newSavingsAccount(Customer customr, String currency) {
        return newAccount(customr, currency, false);
    }

    public Account findAccountByID(Integer accID) throws NonExistingAccountException {
        for (Account acc: accountList){
            if (acc.getAccountID().equals(accID))
                return(acc);
        }
        throw new NonExistingAccountException ("The account with ID: " + accID + " not exist");
    }

    public void transfer(Integer fromAccID, Integer toAccID, double toTransfer) throws NonExistingAccountException, NotEnoughMoneyException {
        transfer(findAccountByID(fromAccID), findAccountByID(toAccID), toTransfer);

    }

    public void transfer(Account fromAcc, Account toAcc, double toTransfer) throws NotEnoughMoneyException {
        fromAcc.charge(toTransfer);
        toAcc.deposit(toTransfer);
    }

        @Override
    public String toString() {
        return "Bank{" +
                " ' " + name + '\'' +
                "\ncusts=" + customerList +
                "\naccs=" + accountList +
                '}';
    }
}
