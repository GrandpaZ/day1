package Z_Java_Day_to_Day.day12_conditional_statements;
import java.util.Scanner;
public class enter_price {
    public static void main(String []args){
    Scanner scanner = new Scanner(System.in);
        System.out.println(" Could you enter the total price ? ");
        double totalPrice =scanner.nextDouble();
        if (totalPrice>=25){
            System.out.println(" free shipping eligible , your order total will be : $ "+totalPrice);
        }else {
            System.out.println(" Not eligible for free shipping  , your order total is $ "+totalPrice+" is less than minimum of 25$ ");
        }
        System.out.println(" Thank you for using Amazon");
}}
