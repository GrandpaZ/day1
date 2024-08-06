package Z_Java_Day_to_Day.day12_conditional_statements;
import java.util.Scanner;
public class If_Eles_Statement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How much money do you have ?");
        double money= scan.nextDouble();
        double milk=9.99;
        if(money>=9.99){
            System.out.println("you can afford the milk");
            System.out.println("your account balance  = "+(money-milk)+" $ ,After you buy the milk");
            System.out.println("Would like you to apply for a store credit card for your future purchase");

        }else{
            System.out.println("You can not afford the milk please bring some more money ");
            System.out.println("your account balance  = "+(money)+" $ ");
            System.out.println("Would like you to apply for a store credit card , you can use the credit to buy");
        }







    }
}
