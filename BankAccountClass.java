public class BankAccountClass{
  double balance;
  double interestRate;
  double minimumBal;
  String PIN;
  String userName;

  public BankAccountClass(String newPin, String newName){
    interestRate = .021;
    minimumBal = 0.0;
    balance = 1.0;
    PIN = newPin;
    userName = newName;
  }

  public double getBal(){
    return balance;
  }

  public void setBal(double newBal){
    balance = newBal;
  }

  public void setName(String newName){
    userName = newName;
  }

  public void setPIN(String newPIN){
    PIN = newPIN;
  }

  public String getName(){
    return userName;
  }

  public String getPIN(){
    return PIN;
  }

  public void withdraw(double userWithdrawal){
    if((balance - userWithdrawal) > minimumBal){
      balance = (Math.round((balance - userWithdrawal)*100.0))/100.0;
    }
  }

  public void deposit(double userDeposit){
    balance = (Math.round((balance + userDeposit)*100.0))/100.0;
  }

  public void interest(double months){
    balance = (Math.round((balance * Math.pow((1.0+(interestRate/100.0)/12.0), months))*100.0))/100.0;
  }
}
