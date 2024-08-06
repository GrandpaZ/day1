package Replit;
import java.util.Scanner;
public class _020_Time_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Could you enter the enter a whole number for hour ");
        int hour = scanner.nextInt();
        System.out.println(" Could you enter the enter a whole number for minutes ");
        int minutes = scanner.nextInt();
        System.out.println(" Could you enter the enter a whole number for second ");
        int second = scanner.nextInt();
        System.out.println(" Could you enter the enter a PM or AM ");
        String amOrpm=scanner.next();

        System.out.println(hour+":"+minutes+":"+second+" "+amOrpm);









    }
}