package N_Java_Day_to_Day.day_58_OOP_Polymorphism;

import N_Java_Day_to_Day.day_58_OOP_Polymorphism.AnimalTasks.Animal;
import N_Java_Day_to_Day.day_58_OOP_Polymorphism.AnimalTasks.Cat;
import N_Java_Day_to_Day.day_58_OOP_Polymorphism.AnimalTasks.Dog;

public class InstanceOf_Keyword {


    public static void main(String[] args) {
        Animal  animal1=new Animal(10,'F');
        Animal  animal2=new Dog("Wintons",4,'F');
        Animal  animal3=new Cat("Kiko",2,'M');

    boolean r1=animal3 instanceof Animal;
        System.out.println(r1);

    boolean r2=animal3 instanceof Cat;
        System.out.println(r2);
        boolean r3=animal1 instanceof Dog;
        System.out.println(r3);




    }





}
