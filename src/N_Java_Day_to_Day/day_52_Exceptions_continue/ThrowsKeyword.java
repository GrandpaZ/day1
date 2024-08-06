package N_Java_Day_to_Day.day_52_Exceptions_continue;

public class ThrowsKeyword {
    public static void main(String[] args) {

    }
    public static void method1()throws InterruptedException{
        Thread.sleep(3000);
    }
    public static void method2(){
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){}
    }
}
