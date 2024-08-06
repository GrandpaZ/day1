package Z_Java_Day_to_Day.day_24_Loop;
import java.util.Scanner;
public class guess_number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secretNumber = 100;
        int guessNumber = 0;

        int guessingNumber;
        do {
            System.out.println("Guess what the number");
            guessingNumber = scan.nextInt();
            if (guessingNumber > 88) {
                System.out.println("your number is too big");
            } else if (guessingNumber < 88) {
                System.out.println("your number is too small");
            }


        } while (secretNumber != guessingNumber);
        {
            System.out.println("you win");

        }

    }
}
