package ClassPackage;

public class InvalidWithdrawException extends RuntimeException{
    public InvalidWithdrawException(String insufficientBalance) {
        super(insufficientBalance);
    }

}
