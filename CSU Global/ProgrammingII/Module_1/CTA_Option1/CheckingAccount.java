// January 19, 2025
// Dylan Nelson
// CheckingAccount.java

public class CheckingAccount extends BankAccount {

    double interestRate;
    
    public CheckingAccount (String firstName, String lastName, int accountID, double balance, double interestRate) {
        super(firstName, lastName, accountID, balance);
        this.interestRate = interestRate;
    }

    // Overrride the original withdrawal method with a new one that implements an overdraft fee.
    @Override
    public void withdrawal(double amountToWithdraw) {
        this.balance -= amountToWithdraw;

        if (this.balance < 0){
            this.balance -= 30;
            System.out.println("Warning, your account has been charged an overdraft fee of $30.");
        }
    }

    // Displays all relevant information to the user about their account including the interest rate.
    public void displayAccount() {
        System.out.printf("The name on the account is %s %s. ", this.firstName, this.lastName);
        System.out.printf("The account ID is: %d. ", this.accountID);
        System.out.printf("The balance on the account is: %.2f ", this.balance);
        System.out.printf("The interest rate on the account is: %.3f%%. \n", this.interestRate);
    }
}
