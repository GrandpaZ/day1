package N_Java_Day_to_Day.day_52_Exceptions_continue;

public class Exceptions {
    public static void main(String[] args) {
       try {
           System.out.println(9 / 0);
       }catch(ArithmeticException e){
           System.out.println(e.getMessage());
       }
        System.out.println("Test complete");

    }
}
