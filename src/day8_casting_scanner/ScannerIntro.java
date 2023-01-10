package day8_casting_scanner;
import java.util.Scanner;
public class ScannerIntro {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("\n\tPlease Type Your Name ");

        String firstName=scan.next();
        System.out.println("\n\t Nice to met you " +firstName);


    }
}
