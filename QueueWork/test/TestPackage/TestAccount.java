package TestPackage;

import ClassPackage.Account;
import ClassPackage.InvalidDepositException;
import ClassPackage.InvalidWithdrawException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestAccount {
    Account myAccount;
    @BeforeEach
    public void setUp() {
        myAccount = new Account("firstName", "lastName", "2233",  "8088406240");
    }

    @Test
    public void accountReturnsCorrectName(){
        assertEquals("firstName lastName", myAccount.getMyName());
    }
    @Test
    public void accountReturnsCorrectAccountNumber(){
        assertEquals("8088406240", myAccount.getAccountNumber());
    }
    @Test
    public void accountCanDeposit2kTest(){
        myAccount.deposit(2000);
        assertEquals("2000.0", myAccount.getBalance());
    }

    @Test
    public void accountCanDeposit2kTwiceTest(){
        myAccount.deposit(2000);

        myAccount.deposit(2000);
        assertEquals("4000.0", myAccount.getBalance());
    }

    @Test
    public void accountOf5kCanWithdraw3kRemaining2kTest(){
        myAccount.deposit(3000);
        myAccount.deposit(2000);

        assertEquals("5000.0", myAccount.getBalance());

        myAccount.withdraw(3000);
        assertEquals("2000.0", myAccount.getBalance());
    }

    @Test
    public void accountCanCheckBalanceWithNameAndPinTest(){
        myAccount.deposit(2000);
        assertEquals("2000.0", myAccount.getBalance());
    }

    @Test
    public void accountCanThrowExceptionForNegativeWithdrawTest(){
       assertThrows(InvalidWithdrawException.class, () -> myAccount.withdraw(2000));
    }

    @Test
    public void accountCanThrowExceptionWithWrongPinWithdrawTest(){
        assertThrows(InvalidWithdrawException.class, () -> myAccount.withdraw(2000));
    }

    @Test
    public void accountCanThrowExceptionForNegativeDepositTest(){
        assertThrows(InvalidDepositException.class, () -> myAccount.deposit(-2000));
    }


}
