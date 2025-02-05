import java.util.HashMap;
import java.util.Map;

public class ATMOps_Implementaion implements ATMOperations{
    ATM atm = new ATM();
    Map<Double, String> statement = new HashMap<>();
    @Override
    public void withDraw(double withDrawAmount) {
        if(withDrawAmount<=atm.getBalance()){
            statement.put(withDrawAmount, "AMOUNT WITHDRAWN");
            System.out.println("PLEASE COLLECT YOUR CASH "+withDrawAmount);
            atm.setBalance(atm.getBalance()-withDrawAmount);
            checkBalance();
        }
    
        else{
            System.out.println("Insufficient Funds");
        }
       
    }

    @Override
    public void deposit(double depositAmount) {
        statement.put(depositAmount, "AMOUNT DEPOSITED ");
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
        for(Map.Entry<Double,String> m: statement.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
