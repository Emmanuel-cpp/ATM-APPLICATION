
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
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
        if(password.length()==5){
            int pass1 = Integer.parseInt(password);
            int pass2 = Integer.parseInt(password2);
            if(pass1==pass2){
                String account_number = "720012345115";
                
                viewDetails(reg_name,phone,account_number);
            }
            else if(!(password==password2)){
                System.out.println("THE PASSWORDS YOU ENTERED DO NOT MATCH ");
            }
         }
        else{
            System.out.println("PLEASE ENSURE PASSWORD CONTAINS 5 DIGITS ");
        }
        data.close();
    }

    //FUNCTION TO CONFIRM DETAILS
    public static void viewDetails(String name,String phone,String account_number){
        System.out.println("===================================================================");
        System.out.println("=\t\tPLEASE CONFIRM DETAILS BELOW");
        System.out.println("=\t\tNAME: "+name.toUpperCase());
        System.out.println("=\t\tPHONE: "+phone);
        System.out.println("=\t\tACCOUNT NUMBER: "+account_number);
    }
}
