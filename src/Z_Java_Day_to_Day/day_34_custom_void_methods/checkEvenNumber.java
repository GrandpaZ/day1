package Z_Java_Day_to_Day.day_34_custom_void_methods;
import java.util.Scanner;
public class checkEvenNumber {
    public static void main(String[] args) {
        System.out.println("please type a number between 1-100 ");
        Scanner scanner=new Scanner(System.in);
        int  number = scanner.nextInt();
        if (number%2==0){
            System.out.println("your number is even number ");
        }else{
            System.out.println("it not even number");
        }}

}
