package Z_Java_Day_to_Day.day13_IF_Else_Statement;

import java.util.Scanner;

public class atm_loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("******Welcome to bank atm******");
        System.out.println(" PLease enter your pin");
        int secretPincode = 1111;
        int inputCode = scanner.nextInt();
        if (inputCode==secretPincode) {
            System.out.println(" Welcome to your account ");
            System.out.println(" you can withdraw , check balance , deposit ");
            System.out.println(" Thank you for using TD bank atm");
        }

        else {
            while (inputCode != secretPincode) {
                System.out.println("incorrect pincode ! ");
                System.out.println(" please try again ");
                int inputCode2 = scanner.nextInt();
//                inputCode2 = inputCode;
                inputCode=inputCode2;

                if (inputCode==secretPincode ) {
                    System.out.println(" Welcome to your account ");
                    System.out.println(" you can withdraw , check balance , deposit ");
                    System.out.println(" Thank you for using TD bank atm");
                    break;
                }

            }
        }


//        if (inputCode==secretPincode){System.out.println(" Welcome to your account ");
//            System.out.println(" you can withdraw , check balance , deposit ");}else {
//            System.out.println(" incorrect pincode ! "+inputCode);
//            System.out.println(" please try again ");
//        }


    }
}

