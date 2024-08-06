package Replit;
import javax.swing.text.SimpleAttributeSet;
import java.util.Scanner;
public class _024_Patient_Information2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\tWelcome To Patient Portal ");
        System.out.println("\tPlease Enter Your Personal Information ");
        System.out.println("\tPlease Enter Your First Name ");
        String firstName=scanner.next();
        System.out.println("\tPlease Enter Your Last Name ");
        String lastName=scanner.next();
        String name=firstName+" "+lastName;
        System.out.println("\tPlease Enter Your Email ");
        String email=scanner.nextLine();
        scanner.next();
        System.out.println("\tPlease Enter Your Street ");
        String street=scanner.nextLine();
        scanner.next();
        System.out.println("\tPlease Enter Your City ");
        String city=scanner.next();
        System.out.println("\tPlease Enter Your State ");
        String state=scanner.next();
        System.out.println("\tPlease Enter Your Zipcode ");
        int zipCode=scanner.nextInt();
        String address=street+","+city+","+state+","+zipCode;
        System.out.println("\tPlease Enter Your Work Phone Number  ");
        String workPhone=scanner.next();
        System.out.println("\tPlease Enter Your Personal Phone Number ");
        String personalPhone=scanner.next();
        String phone="\n\tWork Phone :"+workPhone+"\n\tPersonal :"+personalPhone;
        System.out.println(" Please Enter Age ");
        int age = scanner.nextInt();
        System.out.println(" Please Enter Your height in CM ");
        int height = scanner.nextInt();
        System.out.println(" Please Enter Your Weight in pounds ");
        double weight= scanner.nextDouble();
        System.out.println(" Are You Married ( Please enter true or false )");
        boolean married=scanner.nextBoolean();
        System.out.println(" Patient Personal Information ");
        System.out.println(" Name: "+name);
        System.out.println(" Address : "+address);
        System.out.println(phone);
        System.out.println(" Email Address : "+email);
        System.out.println(" Age : "+age);
        System.out.println(" Height : "+height);
        System.out.println(" Weight : "+weight+" Pounds");
        System.out.println(" Married ?: "+married);












    }
}
