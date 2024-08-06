package Z_Java_Day_to_Day.day_19_class_vs_object_string;
import java.util.Scanner;
public class Steam_SignUp {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Steam sign up website");
        System.out.println("Please enter the username that you like ");
        System.out.println("username should be  at least 8 characters and less than 12 characters");
        System.out.println("username should start with @ and end with 0 ");
        String userName=scanner.next();
        while ((userName.length()>=8&&userName.length()<=12)&&(!userName.startsWith("@")&&userName.endsWith("0"))){
            System.out.println("username should be  at least 8 characters and less than 12 characters");
            System.out.println("username should start with @ and end with 0 ");
            System.out.println("please try again");
            String userName1=scanner.next();
            userName=userName1;
    }
}}
