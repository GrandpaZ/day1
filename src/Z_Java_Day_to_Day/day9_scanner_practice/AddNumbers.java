package Z_Java_Day_to_Day.day9_scanner_practice;
import java.util.Scanner;
public class AddNumbers {

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Welcome to UG birHelPayZi calculator");
        System.out.println("Are you Xax  Enough to use it,If so ");
        System.out.println("Please type the first number ");
        int num1=scan.nextInt();
        System.out.println("PLease type the Second number");
        int num2=scan.nextInt();
        int result=num1+num2;
        String s1="+";
        System.out.println(num1+s1+num2+"\tTotal result will be "+result);
        System.out.println("you are welcome , Akax Aski is ready for you");


    }
}
