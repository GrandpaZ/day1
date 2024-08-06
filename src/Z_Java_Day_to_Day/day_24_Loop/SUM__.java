package Z_Java_Day_to_Day.day_24_Loop;

import java.util.Scanner;

public class SUM__ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int sum = 0;
       for (int i=0;i<100;){
           System.out.println("enter a number: ");
           int num= scanner.nextInt();
           if (num<0){
               break;
           }
           sum+=num;
           System.out.println(sum);
       }











    }
}
