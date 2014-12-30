package fudgebanking;

/**
 * A class to model an actual checking account
 * @author mafudge
 */
public class BankAccount {
    
    private final String pinNumber;
    private double balance;
    
    /**
     *  Constructor for the class makes a new checking account
     * @param pin the pin number
     * @param balance the opening balance
     */
    public BankAccount(String pin, double balance) {
        this.pinNumber = pin;
        this.balance = balance;       
    }
    
    /**
     * Adds money to the checking account
     * @param amount the amount to add to the balance
     */
    public void Deposit(double amount) {
        this.balance = this.balance + amount;
    }
    
    /**
     * Removes money from the checking account
     * @param amount the amount to remove from the balance
     */
    public void Withdrawl(double amount) {
        this.balance = this.balance - amount;
    }
    
    /**
     * Get the current balance
     * @return returns the current balance
     */
    public double Balance() {
        return this.balance;
    }
    
    /**
     * Get the pin number
     * @return gets the current balance
     */
    public String Pin() {
        return this.pinNumber;
    }
    
    /**
     * Used for printing the class
     * @return a string representation of the account
     */
    @Override 
    public String toString() {
        return String.format("PIN#: %s\nBALANCE: $%.2f"
                ,this.pinNumber, this.balance);        
    }
}
