package Z_Java_Day_to_Day.day13_IF_Else_Statement;

import java.util.Scanner;

public class Mtt_ATM_V3 {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("******Welcome to bank atm******");
        System.out.println(" PLease enter your pin");
        int secretPincode = 1111;
        int inputCode = scanner.nextInt();
        if (inputCode==secretPincode) {
            System.out.println(" Welcome to your account ");
            System.out.println(" you can withdraw , check balance , deposit ");
            System.out.println(" Thank you for using TD bank atm");
        } else {
                for (int i =0 ; i<=4 ; i++) {
                    if (i>=1){
                        System.out.println("\tyou have "+(4-i)+" times left to try");}
                    if (i==4){
                        System.out.println("\n\t" + "If you entered an incorrect Pin  for Maximum of 5 times, " +
                                "your ATM/Debit card will be blocked for the day. ");
                        System.out.println("\tThank you for using TD bank atm");

                        break;
                    }
                    System.out.println("\tincorrect pincode ! ");
                    System.out.println("\tplease try again ");
                    int inputCode2 = scanner.nextInt();
                    if (inputCode2==secretPincode){
                        System.out.println(" Welcome to your account ");
                        System.out.println(" you can withdraw , check balance , deposit ");
                        System.out.println(" Thank you for using TD bank atm");
                        break;
                    }
                }

        }
    }}
