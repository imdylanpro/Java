// Dylan Nelson
// January 19, 2025
// MainProgram.java

public class MainProgram {

    public static void main(String[] args) {
        
        // BankAccount Class //

        // Create an instance of a BankAccount class.
        BankAccount myNewBankAccount = new BankAccount("Dylan", "Nelson", 123, 10);
        
        // Testing methods built for the superclass, here we print out all the information for account summary.
        myNewBankAccount.accountSummary();

        // Depositing and Withdrawing money for the superclass.
        myNewBankAccount.deposit(2.5);
        System.out.printf("The new balance on the account is: %.2f. \n", myNewBankAccount.getBalance());
        myNewBankAccount.withdrawal(1.75);
        System.out.printf("The new balance on the account is: %.2f. \n", myNewBankAccount.getBalance());

        // Change the name on the bank account
        myNewBankAccount.setFirstName("Dillon");
        myNewBankAccount.setLastName("Nellyson");
        System.out.printf("The new name on the account is %s %s. \n", myNewBankAccount.getFirstName(), myNewBankAccount.getLastName());
        
        // Change the account ID. 
        myNewBankAccount.setAccountID(321);
        System.out.printf("The new account ID is: %d \n", myNewBankAccount.getAccountID());

        // Call the account summary again to show that all the values were changed.
        myNewBankAccount.accountSummary();

        // CheckingAccount Class //

        // Create an instance of the superclass CheckingAccount, which inherits from BankAccount.
        CheckingAccount myNewCheckingAccount = new CheckingAccount("John", "Smith", 456, 20, 0.05);
        
        // We need to test all of the methods again for the subclass to make sure they work.
        myNewCheckingAccount.displayAccount();

        // Depositing and Withdrawing money for the subclass.
        myNewCheckingAccount.deposit(50.80);
        System.out.printf("The new balance on the account is: %.2f. \n", myNewCheckingAccount.getBalance());
        myNewCheckingAccount.withdrawal(100);
        System.out.printf("The new balance on the account is: %.2f. \n", myNewCheckingAccount.getBalance());

        // Change the name on the bank account
        myNewCheckingAccount.setFirstName("Mark");
        myNewCheckingAccount.setLastName("Twain");
        System.out.printf("The new name on the account is %s %s. \n", myNewCheckingAccount.getFirstName(), myNewCheckingAccount.getLastName());
        
        // Change the account ID. 
        myNewCheckingAccount.setAccountID(654);
        System.out.printf("The new account ID is: %d \n", myNewCheckingAccount.getAccountID());

        // Call the account summary again to show that all the values were changed.
        myNewCheckingAccount.displayAccount();
    }
}
