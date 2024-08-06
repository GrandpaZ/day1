package Z_Java_Day_to_Day.day13_IF_Else_Statement;

import java.util.Scanner;

public class mtt_atmV4 {
    public static void main(String []args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("******Welcome To MTT Bank******");
            System.out.println(" PLease enter your pin");
            int secretPincode = 1111;
            int inputCode = scanner.nextInt();
           while (inputCode!=secretPincode) {
               System.out.println("incorrect pincode ! ");
               System.out.println(" please try again ");
               int inputCode2 = scanner.nextInt();
                   inputCode=inputCode2;
                   for (int i = 3 ; i>=0 ;i--){
                       if (inputCode==secretPincode){
                           System.out.println(" Welcome to your account ");
                           System.out.println(" you can withdraw , check balance , deposit ");
                           System.out.println(" Thank you for using MTT Bank ATM");
                           break;
                       }
                       if (i==0){
                           System.out.println("\n\t" + "If you entered an incorrect Pin  for Maximum of 5 times, " +
                                   "your ATM/Debit card will be blocked for the day. ");
                           System.out.println("\tThank you for using MTT Bank ATM");
                           break;}

                       if (i<=3){
                           System.out.println("\tyou have "+i+" times left to try");
                       }
                       System.out.println("incorrect pincode ! ");
                       System.out.println(" please try again ");
                       int inputCode3 = scanner.nextInt();
                       inputCode=inputCode3;
                   }
           }
        System.out.println(" Welcome to your account ");
        System.out.println(" you can withdraw , check balance , deposit ");
        System.out.println(" Thank you for using MTT Bank ATM");

    }}
