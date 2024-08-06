package Z_Java_Day_to_Day.day_24_Loop;

import java.util.Scanner;

public class timer {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the seconds left ");
        int min=scanner.nextInt();
        for (int i=min;i>=0;i--){

                System.out.println(i+ " seconds left ");
                Thread.sleep(1000);

        }
    }
}
