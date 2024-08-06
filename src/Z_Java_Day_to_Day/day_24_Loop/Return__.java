package Z_Java_Day_to_Day.day_24_Loop;

import java.util.Scanner;

public class Return__ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result =1;
        System.out.println("please enter a number");
        for (int i= scanner.nextInt();i>=1;i-=1){
            result*=i;
        }
        System.out.println(result+" = result");









    }
}
