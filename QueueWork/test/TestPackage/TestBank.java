package TestPackage;

import ClassPackage.Bank;
import ClassPackage.IllegalAccountNumberException;
import ClassPackage.InvalidDepositException;
import ClassPackage.InvalidWithdrawException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestBank {
    Bank palmPay;
    @BeforeEach
    public void setUp()
    {
        palmPay = new Bank();
    }
    @Test
    public void bankCanCreateAccountForTest(){
        palmPay.createAccount("wande", "helen", "1234", "8088406240","0.0");
        assertEquals("wande helen", palmPay.findAccount("wande helen", "1234"));
    }

    @Test
    public void bankCanSearchForAccountTest(){
        palmPay.createAccount("wande", "helen", "1234", "8088406240","0.0");
        palmPay.createAccount("olamide", "ola", "correctPin", "9068325284", "");
        palmPay.searchAccount("wande helen");
        assertEquals("wande helen", palmPay.searchAccount("wande helen"));
    }
    @Test
    public void bankCanGetBalanceTest(){
        palmPay.createAccount("wande", "helen", "1234", "8088406240", "0.0");
        palmPay.createAccount("olamide", "ola", "correctPin", "8088406240", "0.0");
        assertEquals("0.0", palmPay.getBalance("wande helen","1234" ));
    }

    @Test
    public void bankCanDepositTest(){
        palmPay.createAccount("wande", "helen", "1234", "8088406240","0.0");
        palmPay.deposit("wande helen", "8088406240", "2000.0");
        assertEquals("2000.0", palmPay.getBalance("wande helen","1234" ));
    }

    @Test
    public void bankCannotDepositWithWrongAccountNumberTest() {
        palmPay.createAccount("wande", "helen", "1234", "8088406240", "0.0");
        assertThrows(IllegalAccountNumberException.class, () -> palmPay.deposit("wande helen", "9068325284", "2000"));
    }

    @Test
    public void bankCannotDepositNegativeAmountTest(){
        palmPay.createAccount("wande", "helen", "1234", "8088406240", "0.0");
        assertThrows(InvalidDepositException.class, () -> palmPay.deposit("wande helen", "8088406240", "-2000.0"));
    }

    @Test
    public void bankCannotDepositZeroAmountTest(){
        palmPay.createAccount("wande", "helen", "1234", "8088406240", "0.0");
        assertThrows(InvalidDepositException.class, () -> palmPay.deposit("wande helen", "8088406240", "0.0"));
    }

    @Test
    public void bankCanWithdraw(){
        palmPay.createAccount("wande", "helen", "1234", "8088406240", "0.0");
        palmPay.deposit("wande helen", "8088406240", "20000.0");
        palmPay.deposit("wande helen", "8088406240", "20000.0");
        assertEquals("40000.0", palmPay.getBalance("wande helen","1234" ));

        palmPay.withdraw("wande helen", "8088406240", "10000.0", "1234");
        assertEquals("30000.0", palmPay.getBalance("wande helen","1234" ));
    }

    @Test
    public void bankCannotWithdrawNegativeAmountTest(){
        palmPay.createAccount("wande", "helen", "1234", "8088406240", "0.0");
        assertThrows(InvalidWithdrawException.class, () -> palmPay.withdraw("wande helen", "8088406240", "20000.0", "1234"));
    }

    @Test
    public void bankCannotWithdrawZeroAmountTest(){
        palmPay.createAccount("wande", "helen", "1234", "8088406240", "0");
        assertThrows(InvalidWithdrawException.class, () -> palmPay.withdraw("wande helen", "8088406240", "0.0", "1234"));
    }

    @Test
    public void bankCanTransferTest() {
        palmPay.createAccount("wande", "helen", "1234", "8088406240", "0.0");
        palmPay.createAccount("olamide", "ola", "correctPin", "9068325284", "0.0");
        palmPay.deposit("wande helen", "8088406240", "200000.0");
        palmPay.transfer("8088406240", "9068325284", "100000.0");
        assertEquals("100000.0", palmPay.getBalance("wande helen","1234" ));
    }
}
