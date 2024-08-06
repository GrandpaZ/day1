package Z_Java_Day_to_Day.day9_scanner_practice;
import java.util.Scanner;
public class TempConverter {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        System.out.println("*****Welcome to TempConverter*****");
        System.out.println("PLease Enter the Fahrenheit that you want to convert");
        double f=scan.nextDouble();
        double c=(f-32)*5/9;
        System.out.println(f+" Fahrenheit in "+"\tCelsius Value will be "+c);







    }
}
