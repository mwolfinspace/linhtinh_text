package bankaccount;

public class InSufficientFundException extends Exception {
    private String message;

    // Constructor
    public InSufficientFundException (String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
}
