package Z_Java_Day_to_Day.day_17_Ternary_Practice;

public class Nested_If {
    public static void main(String []args){
        System.out.println("****** Welcome To Amazon ******");
        System.out.println("Ready to get some stuff you like ? ");
        double itemPrice = 30;
        boolean isPrimeMember=true;
        if (isPrimeMember==true){
            System.out.println(" You are Eligible for free 2 day shipping");}
        else {
            if (itemPrice>25){
                System.out.println("Eligible for free regular shipping");
            } else {
            System.out.println(" Not eligible for free shipping . fee is 10 $ ");
        }}}}