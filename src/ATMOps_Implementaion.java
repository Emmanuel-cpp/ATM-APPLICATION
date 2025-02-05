public class ATMOps_Implementaion implements ATMOperations{
    ATM atm = new ATM();
    @Override
    public void withDraw(double withDrawAmount) {
        if(withDrawAmount<=atm.getBalance()){
            System.out.println("PLEASE COLLECT YOUR CASH "+withDrawAmount);
            atm.setBalance(atm.getBalance()-withDrawAmount);
            checkBalance();
        }
        else if(withDrawAmount<0){
            System.out.println("PLEASE ENTER A VALID AMOUNT");
        }
        else{
            System.out.println("Insufficient Funds");
        }
       
    }

    @Override
    public void deposit(double depositAmount) {
        System.out.println(depositAmount+" Deposited Successfully");
        atm.setBalance(atm.getBalance()+depositAmount);
        System.out.println("CURRENT BALANCE: ");
        checkBalance();
    } 

    @Override
    public void checkBalance() {
        System.out.print("THE AVAILABLE BALANCE IS: "+atm.getBalance());
    }

    @Override
    public void viewStatement() {

    }

    
}
