package test;

public class Hello {
    public static void HelloWorld(){
        System.out.println("Hello World");
    }
    public static void HelloJava(){
        System.out.println("Hello Java");
    }


    public static void Love(String input){
        System.out.println("love"+input);
    }
    public static void main(String[] args) {

        HelloJava();
        Hello.HelloWorld();
    }
}
