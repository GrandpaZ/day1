package Z_Java_Day_to_Day.day_14_Multi_branch;

import java.util.Scanner;

public class CalculatorV2 {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to use CalculatorV2");
        System.out.println("Please enter 2 numbers ");
        System.out.println("Please enter the first  numbers ");
        double num1 = scanner.nextDouble();
        System.out.println("Please enter the second  numbers ");
        double num2 = scanner.nextDouble();
        System.out.println("Enter operator : - ,+ ,* ,/ ");
        char operator= scanner.next().charAt(0);

        if (operator =='+'){
            System.out.println("add: "+num1+" + "+num2+" = "+(num1+num2));
            System.out.println("Thank you for using Calculator V2 ");
        }else  if (operator =='-'){
            System.out.println("minus: "+num1+" - "+num2+" = "+(num1-num2));
            System.out.println("Thank you for using Calculator V2 ");
        }else if (operator =='*'){
            System.out.println("multiply: "+num1+" * "+num2+" = "+(num1*num2));
            System.out.println("Thank you for using Calculator V2 ");
        }else if (operator =='/'){
            System.out.println("divide: "+num1+" / "+num2+" = "+(num1/num2));
            System.out.println("Thank you for using Calculator V2 ");
        }else{
            System.out.println("invalid operator");}













    }
}
