package Z_Java_Day_to_Day.day9_scanner_practice;
import java.util.Scanner;
public class CentsToDollor {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("PLease Enter how many Cents do you have");
        int cents=scan.nextInt();
        int dollor=cents/100;
        int remindcents=cents%100;
        System.out.println("\tCents = "+cents);
        System.out.println("\tDollors = "+dollor);
        System.out.println("\tRemindcents = "+remindcents);
        System.out.println("In "+cents+" cents : "+dollor+" Dollors "+remindcents+" Cents ");





    }
}
