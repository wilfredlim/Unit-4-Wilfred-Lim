public class BankAccount{
  String bank;
  String accountType;
  double balance;
  double interestRate;
  double minimumBal;
  int accountNum ; //usually 10-12 digits long
  int routingNum ; //9 digits


  public BankAccount(String userBank, String userAccountType, double userIntRate, double userMinBal, double startBal){
    bank = userBank;
    accountType = userAccountType;
    interestRate = userIntRate;
    minimumBal = userMinBal;
    balance = startBal;
  }

  public double getBal(){
    return balance;
  }

  public void setBal(double newBal){
    balance = newBal;
  }

  public void withdrawal(double userWithdrawal){
    if((balance - userWithdrawal) > minimumBal){
      balance = Math.round((balance - userWithdrawal)*100)/100;
    }
  }

  public void deposit(double userDeposit){
    balance = Math.round((balance + userDeposit));
  }

  public void transfer(BankAccount otherAccount, double userTransfer){
    if((balance - userTransfer) > minimumBal){
      balance = (Math.round((balance - userTransfer)*100))/100;
    }
    otherAccount.deposit(userTransfer);
  }

  public void interest(double months){
    balance = Math.round((balance * Math.pow((1+(interestRate/100)/12), months))*100)/100;
  }
}
