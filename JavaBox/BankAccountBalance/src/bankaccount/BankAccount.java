package bankaccount;

public class BankAccount {
    private double balance;

    // Contructor
    public BankAccount (){
        balance = 0.0;
    }

    // Deposit method
    public void deposit (double amount){
        balance = balance + amount;
    }

    // Withdraw method
    public void withdraw (double amount) throws InSufficientFundException{
        if (amount > balance){
            throw new InSufficientFundException("Insufficient Balance. Withdraw process could't be completed.");
        }
        balance = balance - amount;
    }

    // Get method of balance
    public double getBalance() {
        return balance;
    }
    
}
