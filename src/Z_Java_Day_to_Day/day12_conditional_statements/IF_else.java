package Z_Java_Day_to_Day.day12_conditional_statements;
import java.util.Scanner;
public class IF_else {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=scan.nextInt();
        if(age>=18){
            System.out.println("You are Eligible to Vote");
            System.out.println("Age is greater or equal to 18 ");
        }else{
            System.out.println("You are not  Eligible to Vote");
            System.out.println("Age is less than 18 ");
            System.out.println("Please wait "+(18-age)+" Years to come back and vote");
        }






    }
}
