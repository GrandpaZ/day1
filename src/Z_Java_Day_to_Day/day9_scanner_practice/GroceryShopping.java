package Z_Java_Day_to_Day.day9_scanner_practice;
import java.util.Scanner;
public class GroceryShopping  {

    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        System.out.println("\n\t PLease Enter the price for Milk");
        double milk=scan.nextDouble();
        System.out.println("\n\t PLease Enter the price for bread");
        double bread=scan.nextDouble();
        System.out.println("\n\t Please Enter the price fot Cucumber");
        double cucumber= scan.nextDouble();
        double total=milk+bread+cucumber;
        System.out.println("\n\t So your Total spend for Grocery Shopping Today is "+total+" $$$$");

    }
}
