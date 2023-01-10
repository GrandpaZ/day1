package day9_scanner_practice;
import java.util.Scanner;
public class SpeedCheck {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        System.out.println("\n\t What is your Current Speed ?");

        int currentSpeed=scan.nextInt();
        int speedLimit=10;
        int overthelimit=currentSpeed-speedLimit;
        System.out.println("\n\t You are over speed litmit by "+overthelimit+" MPH ");
        System.out.println("\n\t Please Slow Down ! ");

    }

}
