//THIS IS THE ATM INTERFACE
public interface ATMOperations {
    public void withDraw(double withdrawnAmount);
    public void deposit(double depositAmount);
    public void checkBalance();
    public void viewStatement();
}
