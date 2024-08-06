package Z_Java_Day_to_Day.day9_scanner_practice;
import java.util.Scanner;
public class MilesToKmConverter {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        System.out.println("\n\tWelcome to MilesToKmConverter ");
        System.out.println("\tPLease Enter the Miles that you want to convert");
        double miles=scan.nextDouble();
        double km=miles*1.609d;
        System.out.println("It will be "+km+" KM");





    }

}
