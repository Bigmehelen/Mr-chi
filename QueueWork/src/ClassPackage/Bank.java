package ClassPackage;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts = new ArrayList<>() ;


    public void createAccount(String firstName, String lastName, String pin,  String accountNumber,String balance) {
        accounts.add(new Account(firstName, lastName, pin, accountNumber));
    }

    public String searchAccount(String name) {
        for (Account account : accounts) {
            if (account.getMyName().equals(name)) {
                return account.getMyName();
            }
        }
        return null;
    }

    public Account findByAccountNumber(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
    public String findAccount(String name, String pin) {
        for(int count = 0; count < accounts.size(); count++) {
            if(name.equals(accounts.get(count).getMyName()) && pin.equals(accounts.get(count).getCorrectPin())) {
                return accounts.get(count).getMyName();
            }
        }
        return null;
    }

    private Account findAccountByName(String name) {
        for (Account account : accounts) {
            if (account.getMyName().equalsIgnoreCase(name)) {
                return account;
            }
        }
        return null;
    }

    private Account validateNameAndPin(String name, String pin) {
        if(findAccountByName(name).getCorrectPin().equals(pin)) {
            return findAccountByName(name);
        }
        //findAccountByName(name);
        return null;
    }

    public void deposit(String name, String accountNumber, String amount) {
        if(!findAccountByName(name).getAccountNumber().equals(accountNumber)){
            throw new IllegalAccountNumberException(accountNumber);
        }
        findAccountByName(name).deposit(Double.parseDouble(amount));
    }

    public String getBalance(String name, String pin) {
        return validateNameAndPin(name, pin).getBalance();
    }

    public void withdraw(String name, String accountNumber, String amount, String pin) {
        if(validateNameAndPin(name, pin).getAccountNumber().equals(accountNumber)) {
            findAccountByName(name).withdraw(Double.parseDouble(amount));
        }
    }

    public void transfer(String senderAccountNumber, String receiversAccountNumber, String amount) {
        Account sender = findByAccountNumber(senderAccountNumber);
        Account receiver = findByAccountNumber(receiversAccountNumber);
        sender.withdraw(Double.parseDouble(amount));
        receiver.deposit(Double.parseDouble(amount));
    }
}
