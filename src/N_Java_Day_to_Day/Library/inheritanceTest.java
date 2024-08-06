package N_Java_Day_to_Day.Library;


import N_Java_Day_to_Day.day_50_Inheritanc_Overriding.AccessModifiers;

public class inheritanceTest extends AccessModifiers {
    public static void main(String[] args) {
        System.out.println(inheritanceTest.publicData);//public is visible outside package
        System.out.println(inheritanceTest.protectedData);//protected is visible always visible to any sub class
       // System.out.println(inheritanceTest.defaultData);//default is not visible outside package

    }
}
