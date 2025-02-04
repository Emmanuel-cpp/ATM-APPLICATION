
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
        System.out.print("Enter PIN (please ensure password is 5 digits): ");
        String password = data.next();
        System.out.print("Confirm PIN: ");
        String password2 = data.next();
        int account_number = 7200123;
        //String[] userDetails = {account_number,reg_name,phone,password,password2};
        int pass1 = Integer.parseInt(password);
        int pass2 = Integer.parseInt(password2);
        if(password.length()==5){
            if(pass1==pass2){
                viewDetails(reg_name,phone,account_number);
            }
            else if(!(password==password2)){
                System.out.println("THE PASSWORDS YOU ENTERED DO NOT MATCH ");
                System.exit(pass2);
            }
         }
        else{
            System.out.println("PLEASE ENSURE PASSWORD CONTAINS 5 DIGITS ");
        }
       
        //LOGIN PART
        System.out.println("YOU CAN NOW LOGIN");
        System.out.print("Enter Account Number: ");
        String loginAccountNumber = data.next();
        System.out.print("Enter Password: ");
        int login_password = data.nextInt();
        int loginAccount = Integer.parseInt(loginAccountNumber);
     
        if(loginAccount==account_number){
            if(login_password==pass1){
                System.out.println("=======================================================================");
                System.out.println("WELCOME "+reg_name.toUpperCase());
                menu();
                System.out.print("Please select an option above: ");
                int option = data.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("YOU HAVE SELECTED TO WITHDRAW");
                        break;
                    case 2:
                        System.out.println("YOU HAVE SELECTED TO DEPOSIT");
                        break;
                    case 3:
                        System.out.println("YOU HAVE SELECTED CHECK BALANCE");
                        break;
                    case 4:
                        System.out.println("YOU HAVE SELECTED TO VIEW STATEMENT");
                        break;
                    case 5:
                        System.out.println("YOU HAVE SELECTED TO EXIT");
                        break;    
                    default:
                        break;
                }
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
    public static void viewDetails(String name,String phone,int account_number){
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
        System.out.println("2. DEPOSIT");
        System.out.println("3. CHECK BALANCE");
        System.out.println("4. VIEW STATEMENT");
        System.out.println("5. EXIT");
    }
}
