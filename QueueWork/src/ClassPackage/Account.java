package ClassPackage;

public class Account {
    private Name myName;
    private double balance;
    private String correctPin;
    private String accountNumber;

    public Account(String firstName, String lastName, String correctPin, String accountNumber) {
        this.myName = new Name(firstName, lastName);
        this.balance = balance;
        this.correctPin = correctPin;
        this.accountNumber = accountNumber;
    }

    public String getMyName() {
        return myName.toString();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void withdraw(double amount) {
        validateWithdraw(amount);
        balance = balance - amount;
    }

    public void deposit(double amount) {
        validateAmount(amount);
        balance = balance + amount;
    }

    public String getCorrectPin() {
        return correctPin;
    }

    public String getBalance() {
        return String.valueOf(balance);
    }

    private void validateAmount(double amount) {
        if (amount <= 0) {
            throw new InvalidDepositException("Invalid amount");
        }
    }

    private void validateWithdraw(double amount) {
        if(balance < amount){
            throw new InvalidWithdrawException("Insufficient Balance");
        }
        else if (amount <= 0){
            throw new InvalidWithdrawException("Invalid amount");
        }
    }
    private void validateName(String name) {
        if (!myName.toString().equals(name)) {
            throw new InvalidNameException("Invalid name");
        }
    }

    private void validatePin(String pin) {
        if (!correctPin.equals(pin)) {
            throw new InvalidPinException("Incorrect Pin");
        }
        else if(correctPin.length() > 4) {
            throw new InvalidPinException("Invalid Pin");
        }
    }



}
