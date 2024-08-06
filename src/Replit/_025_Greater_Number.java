package Replit;
import java.util.Scanner;
public class _025_Greater_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please Enter The First whole Number ");
        int firstNumber= scanner.nextInt();;
        System.out.println(" Please Enter The Second whole Number ");
        int secondNumber= scanner.nextInt();
        if (firstNumber>secondNumber){
            System.out.println(" First Number is Greater than second number "+firstNumber+" > "+secondNumber);
        }else if (firstNumber==secondNumber){
            System.out.println(" First Number is equal to second number "+firstNumber+" = "+secondNumber);
        }else {
            System.out.println(" Second Number is Greater than First number "+secondNumber+" < "+firstNumber);

        }














    }
}
