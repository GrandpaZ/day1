package Replit;
import java.util.Scanner;
public class _028_Week_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a whole number between 1-7 to show you what day is today ");
        int day = scanner.nextInt();
        if (day ==1){
            System.out.println(" Today is Monday ");
        } else if (day==2) {
            System.out.println(" Today is Tuesday ");
        }else if (day==3) {
            System.out.println(" Today is Wednesday ");
        }else if (day==4) {
            System.out.println(" Today is Thursday ");
        }else if (day==5) {
            System.out.println(" Today is Friday ");
        }else if (day==6) {
            System.out.println(" Today is Saturday ");
        }else if (day==7) {
            System.out.println(" Today is Sunday ");
        }else{
            System.out.println("is not a valid number, please enter 1-7 ");
        }
    }
}
