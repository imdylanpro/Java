// Dylan Nelson
// January 19, 2025
// BankAccount.java

public class BankAccount {
    String firstName;
    String lastName;
    int accountID;
    double balance;

    public BankAccount(String firstName, String lastName, int accountID, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountID = accountID;
        this.balance = balance;
    }

    // Initializes balance to 0.
    public void constructor() {
        this.balance = 0;
    }

    // Allows user to enter an amount to deposit into balance.
    public void deposit(double amountToDeposit) {
        this.balance += amountToDeposit;
    }

    // Allows the user to withdrawal funds that they determine.
    public void withdrawal(double amountToWithdraw) {
        this.balance -= amountToWithdraw;
    }

    // Sets the first name.
    public void setFirstName(String firstNameToSet) {
        this.firstName = firstNameToSet;
    }

    // Retrieves the first name.
    public String getFirstName() {
        return this.firstName;
    }

    // Sets the last name.
    public void setLastName(String lastNameToSet) {
        this.lastName = lastNameToSet;
    }

    // Retrieves the last name.
    public String getLastName() {
        return this.lastName;
    }

    // Sets the accountID.
    public void setAccountID(int accountIDToSet) {
        this.accountID = accountIDToSet;
    }

    // Retrieves the accountID.
    public int getAccountID() {
        return this.accountID;
    }

    // Retrieves the balance.
    public double getBalance() {
        return this.balance;
    }

    // Prints out all relevant information for the user.
    public void accountSummary() {
        System.out.printf("The name on the account is %s %s. ", this.firstName, this.lastName);
        System.out.printf("The account ID is: %d. ", this.accountID);
        System.out.printf("The balance on the account is: %.2f. \n", this.balance);
    }
}
