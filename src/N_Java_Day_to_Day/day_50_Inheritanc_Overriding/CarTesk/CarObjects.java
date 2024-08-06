package N_Java_Day_to_Day.day_50_Inheritanc_Overriding.CarTesk;

import test.Hello;

public class CarObjects {
    public static void main(String[] args) {
        honda honda=new honda();
        Mercedes mercedes=new Mercedes();
        Tesla tesla=new Tesla();
        Jeep jeep=new Jeep();

        honda.start();
        System.out.println("=============================");
        mercedes.start();
        System.out.println("================================");
        tesla.start();
        System.out.println("===================================");
        jeep.start();

    }
}
