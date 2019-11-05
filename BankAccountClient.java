/*
Properties: Interest Rate, Minimum Balance, Account Number, Routing Number, User Name, Password
		Account Type (Savings, Checking), Bank

Behaviors: deposit, withdrawal, openAccount, remoteDeposit (checks),
		transferMoney/sendMoney
*/
public class BankAccountClient{
  public static void main(String[] args){
    BankAccount fredAcc = new BankAccount("BoFA", "Checking", .09, 0.0, 5.0);
    BankAccount gregAcc = new BankAccount("BoFA", "Checking", .09, 0.0, 5.0);
    fredAcc.deposit(12.12);
    System.out.println("Account balance after deposit: " + fredAcc.getBal());

    fredAcc.withdrawal(5);
    System.out.println("Account balance after withdrawal: " + fredAcc.getBal());

    fredAcc.transfer(gregAcc, 1.2);
    System.out.println("Account balance after deposit: " + fredAcc.getBal());

    fredAcc.interest(240); //time
    System.out.println("Account balance after interest: " + fredAcc.getBal());
  }
}
