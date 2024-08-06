package Z_Java_Day_to_Day.day9_scanner_practice;
import java.util.Scanner;
public class money {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        System.out.println("\n\tPlease Enter your Hour pay");
        double hourrate= scan.nextDouble();
        System.out.println("Your can get "+hourrate*8*24+" $ Per Month");
        System.out.println("You can get "+hourrate*8*5+" $ Per Week");



    }
}
