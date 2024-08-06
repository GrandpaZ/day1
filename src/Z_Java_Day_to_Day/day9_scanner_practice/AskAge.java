package Z_Java_Day_to_Day.day9_scanner_practice;
import java.util.Scanner;
public class AskAge {

    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        System.out.println("\n\tWhat do you do with your money ? where do you invest? ");
        String invest= scan.next();
        System.out.println("\n\t IF you invest in "+invest+"  You are Fucked!!!!!");
        String wdid=scan.next();
        System.out.println("\n\t work hard and stay away from \"stocks and Crypto\" "+"\n\tSB stocks SB Crypto");


    }
}
