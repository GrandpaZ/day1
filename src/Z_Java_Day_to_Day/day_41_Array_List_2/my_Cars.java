package Z_Java_Day_to_Day.day_41_Array_List_2;

import java.util.ArrayList;

public class my_Cars {
    public static void main(String[] args) {
        ArrayList<String> myCars=new ArrayList<>();
        myCars.add("Toyota");myCars.add("BMW");myCars.add("Audi");myCars.add("Honda");myCars.add("KIA");myCars.add(0,"Tesla");myCars.add("Dodge");
        myCars.add("Jeep");
        System.out.println(myCars);
        System.out.println(myCars.toString());
        String allCarList=myCars.toString();
        System.out.println(" All Car List = "+allCarList);
        myCars.set(2,"Ford");
        System.out.println(myCars);
        System.out.println("\n"+myCars.toString());
        System.out.println("The index of KIA = "+myCars.indexOf("KIA"));
        int jeepIndex=myCars.indexOf("Jeep");
        System.out.println("The index of Jeep = "+jeepIndex);
        myCars.set(1,"Ram");
        System.out.println("After the change "+myCars);
        myCars.set(myCars.indexOf("KIA"),"BMW");
        System.out.println("\n"+myCars);






    }
}
