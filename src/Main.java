public class Main {
    public static void main(String[] args) {
        var myAccount = new BankAccount();
        myAccount.deposit(1000);
        myAccount.addInterest();
        var didSucceed = myAccount.withdraw(200);
        if (didSucceed)
            System.out.println("Successfully made withdrawal");
        else
            System.out.println("Could not withdraw, current balance is " + myAccount.checkBalance());
    }
}



