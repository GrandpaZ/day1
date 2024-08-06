package N_Java_Day_to_Day.day_52_Exceptions_continue;

public class MultiCatchBlock {

    public static void main(String[] args) {
        int[] arr={10,20};

        try{
            System.out.println(arr[20]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println( e.getMessage());
            System.out.println("exception is handled");
        }
        System.out.println("======================");
        String str="Cybertek";
        try {
            System.out.println(str.charAt(200));
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("handel by RuntimeExcetion");
        }
        System.out.println("======================");
       try{
           Thread.sleep(3000);
       }catch (Exception e){
       }
        System.out.println("======================");
       try{
       System.out.println(8/0);
       System.out.println("try blcok");
       }catch (ArithmeticException e){
            System.out.println("catch block");
        }finally {
           System.out.println("finally block ");
       }
        System.out.println("complete  ");







    }
}
