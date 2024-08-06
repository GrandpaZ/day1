package N_Java_Day_to_Day.day_53_CustomExceptions;
class A{




    public void method1(){
        System.out.println("Enter username and password");
    }
    public final void method1(int a ){
        System.out.println("Enter skr skr skr "+a);
    }
    public final static void method2(int b){
        System.out.println("Enter username and password");
    }
}
public class finalMethod extends A {

   @Override
   public void method1(){
       System.out.println("Enter something else");

   }





}
