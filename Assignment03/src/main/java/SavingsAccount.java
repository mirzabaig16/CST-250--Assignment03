public class SavingsAccount extends BankAccount{
    private double annualInterestRate;
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    
   // public SavingsAccount(double annualInterestRate){
     //   this.annualInterestRate = annualInterestRate;
    //}
    
    public SavingsAccount(String owner ,double balance, double annualInterestRate){
       super(owner,balance);
        this.annualInterestRate = annualInterestRate;
    }
    
    
    public void depositMonthlyInterest(){
        double rate = annualInterestRate/12 ;
        setBalance(getBalance()+((rate*getBalance())/100));
    }
    public void withdraw(double amount){
        if(getBalance()-amount < 0){
            System.out.println("Not enough amount...");
        }
        else{
          setBalance(getBalance()- amount);
        }
    }
}