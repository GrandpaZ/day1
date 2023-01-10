package day12_conditional_statements;
import java.util.Scanner;
public class AmzoneFreeShipping {
    public static void main(String[] args) {
        System.out.println("Please Enter the total price for your Online Order");
        Scanner scan=new Scanner(System.in);
        double price= scan.nextDouble();
        if (price>=30){
            System.out.println("Your are Eligible for free shipping today");
            System.out.println("Enjoy you free shipping with Amzone");
        }else{
            System.out.println("You are not Eligible for free shipping today");
            System.out.println("You need "+(30-price)+" $ to get the free shipping");
            System.out.println("or you will be paying 13.99$ for shipping ");
        }
        System.out.println("Thank you for shopping Amzone");
    }
}
