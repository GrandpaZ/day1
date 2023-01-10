package day10_shorthand_operators;
import java.util.Scanner;
public class NextLineBug {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        System.out.println(" Please Enter Your Rent and Month ");
        double rent=scan.nextDouble();
        scan.nextLine();
        String month=scan.nextLine();
        System.out.println("Rent= "+rent);
        System.out.println("Month= "+month);




    }
}
