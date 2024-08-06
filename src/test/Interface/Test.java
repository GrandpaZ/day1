package test.Interface;

public class Test {
    static Phone phonetype;

    public static void main(String[] args) {
        phonetype=new Apple();
        phonetype.phoneInfo();
        phonetype=new Samsung();
        phonetype.phoneInfo();
        phonetype=new Xiaomi();
        phonetype.phoneInfo();
        phonetype=new Nokia();
        phonetype.phoneInfo();
        System.out.println("=========================================");
        Phone p=new Apple();
        p.phoneInfo();
        Phone p1=new Samsung();
        p1.phoneInfo();
        Phone p2=new Xiaomi();
        p2.phoneInfo();
        Phone p3=new Nokia();
        p3.phoneInfo();
        System.out.println("=========================================");










    }
}
