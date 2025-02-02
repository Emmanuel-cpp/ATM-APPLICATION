
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        System.out.println("==============  WELCOME TO EMMANUEL'S ATM INTERFACE SYSTEM =============");
        Scanner data = new Scanner(System.in);
        System.out.println("PLEASE REGISTER BELOW");
        System.out.print("Enter Full Name: ");
        String reg_name = data.nextLine();
        System.out.print("Enter Phone: ");
        String phone = data.next();
        System.out.print("Enter Password (please ensure password is 5 digits): ");
        String password = data.next();
        System.out.print("Confirm Password: ");
        String password2 = data.next();
        String account_number = "720012345115";
        String[] userDetails = {account_number,reg_name,phone,password,password2};
        int pass1 = Integer.parseInt(password);
        int pass2 = Integer.parseInt(password2);
        if(password.length()==5){
            if(pass1==pass2){
                viewDetails(reg_name,phone,account_number);
            }
            else if(!(password==password2)){
                System.out.println("THE PASSWORDS YOU ENTERED DO NOT MATCH ");
            }
         }
        else{
            System.out.println("PLEASE ENSURE PASSWORD CONTAINS 5 DIGITS ");
        }
       
        //LOGIN PART
        System.out.println("YOU CAN NOW LOGIN");
        System.out.print("Enter Account Number: ");
        int loginAccountNumber = data.nextInt();
        System.out.print("Enter Password: ");
        int login_password = data.nextInt();
        int loginAccount = Integer.parseInt(account_number);
     
        if(loginAccount==loginAccountNumber){
            if(login_password==pass1){
                System.out.println("WELCOME "+reg_name);
                menu();
            }
            else{
                System.out.println("PLEASE ENSURE YOU ENTER THE CORRECT PASSWORD");
            }
        }
        else{
            System.out.println("INVALID ACCOUNT NUMBER ");
        }
        data.close();
    }

    //FUNCTION TO CONFIRM DETAILS
    public static void viewDetails(String name,String phone,String account_number){
        System.out.println("===================================================================");
        System.out.println("PLEASE CONFIRM DETAILS BELOW");
        System.out.println("===================================================================");
        System.out.println("NAME: "+name.toUpperCase());
        System.out.println("PHONE: "+phone);
        System.out.println("ACCOUNT NUMBER: "+account_number);
        System.out.println("=====================================================================");
    }
       
    //MAIN MENU METHOD
    public static void menu(){
        System.out.println("1. WITHDRAW");
        System.out.println("2 DEPOSIT");
        System.out.println("3. CHECK BALANCE");
        System.out.println("4. EXIT");
    }
}
