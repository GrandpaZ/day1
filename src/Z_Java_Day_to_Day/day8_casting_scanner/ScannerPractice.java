package Z_Java_Day_to_Day.day8_casting_scanner;

import java.util.Scanner;

public class ScannerPractice {


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to use Scanner Class");
        System.out.println("Please enter your firstName");
        String firstName=input.next();
        String blackList="Mustafa";
        while(firstName.equalsIgnoreCase(blackList)){
            System.out.println("Sorry, your Name is on blackList, Please re-enter valid Name");
            firstName=input.next();
        }

        System.out.println("firstName = " + firstName);

        System.out.println("Please enter your age");
        int age=input.nextInt();
        System.out.println("age = " + age);


        String myName="Zach";
//       boolean ifExist= myName.contains("Z");
//        System.out.println("ifExist = " + ifExist);

        System.out.println( myName.contains("Z"));
    }

}
