package Replit;
import sun.nio.ch.sctp.SctpNet;

import java.util.Scanner;
public class _026_Positive_Negative_0_2 {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please Enter the number ");
        int number=scanner.nextInt();
        if (number>0){
            System.out.println(number+" is positive number ");
        } else if (number==0) {
            System.out.println(number+" is equal to zero ");

        }else{
            System.out.println(number+" is negative number ");
        }


    }
}
