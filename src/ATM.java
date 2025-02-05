public class ATM {
    private double balance;
    private double withDrawAmount;
    private double depositAmount;

    //GETTERS AND SETTERS FOR BALANCE
    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getBalance(){
        return balance;
    }
    //GETTER AND SETTERS FOR WITHDRAWAMOUNT
    public void setWithdraw(double withDrawAmount){
        this.withDrawAmount=withDrawAmount;
    }
    public double getWithDrawAmount(){
        return withDrawAmount;
    }
    //GETTER AND SETTER FOR DEPOSIT AMOUNT
    public void setDeposit(double depositAmount){
        this.depositAmount=depositAmount;
    }
    public double getDeposit(){
        return depositAmount;
    }
}
