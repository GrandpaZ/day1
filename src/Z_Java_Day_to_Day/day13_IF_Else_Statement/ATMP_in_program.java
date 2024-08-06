package Z_Java_Day_to_Day.day13_IF_Else_Statement;
import java.util.Scanner;
public class ATMP_in_program {
    public static void main(String[] args) {
        System.out.println("****Welcome to the Bank of America ATM****");
        System.out.println("\tPLease Enter your Pincode on the pinpad");
        Scanner scan=new Scanner(System.in);
        int pin=scan.nextInt();
        if(pin==1234){
            System.out.println("****Welcome to your Account****");
            System.out.println("You can withdraw,check balance,deposit");

        }else{
            System.out.println("****Incorrect Passcode ! ****");
            System.out.println("****"+pin+"****");
            System.out.println("****Please Try again****");
        }
    }
}
