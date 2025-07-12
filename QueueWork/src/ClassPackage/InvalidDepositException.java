package ClassPackage;

public class InvalidDepositException extends RuntimeException {
    public InvalidDepositException(String invalidAmount) {
        super(invalidAmount);
    }
}
