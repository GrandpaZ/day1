package Z_Java_Day_to_Day.day_29_loop5;

import java.util.Scanner;

public class task1_sumOf_twoNumber {
    public static void main(String[] args){
    System.out.println("*****Welcome to Sum of Two Numbers*****");
    Scanner scanner = new Scanner(System.in);

    while (true) {

        System.out.println("Please enter the first  number ");
        double num1 = scanner.nextDouble();
        System.out.println("Please enter the second number ");
        double num2 = scanner.nextDouble();
        double result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
        System.out.println("Do you want to continue? ");
        String anwser = scanner.next().toLowerCase();

        while (!anwser.equals("yes")||anwser.equals("no")){
            System.out.println("Invalid Answer,Please enter yes or no");
            System.out.println("Do you want to continue? ");
            anwser=scanner.next().toLowerCase();
        }

        if (anwser.equals("no")){
            System.out.println("you said no\n Bye Bye");
            break;
        }


    }



    }}
