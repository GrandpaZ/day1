package N_Java_Day_to_Day.day_52_Exceptions_continue;

public class Throws_Practice {
    public static void main(String[] args) throws InterruptedException{
        m1();
        m2();
    }
    public static void m1()throws InterruptedException{
        Thread.sleep(3000);
    }
    public static void m2()throws InterruptedException{
        m1();
    }
    public static void m3(){
        try{
            m2();
        }catch (InterruptedException e){}
    }
    public static void m4(){
        m3();
    }
}
