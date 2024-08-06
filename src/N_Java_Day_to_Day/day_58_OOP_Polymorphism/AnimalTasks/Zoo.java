package N_Java_Day_to_Day.day_58_OOP_Polymorphism.AnimalTasks;

import Z_Java_Day_to_Day.day_31_A_rrays_2.Arra_y_Joi_n_Method;

import java.sql.SQLOutput;

public class Zoo {

        public static void main(String[] args) {

        Dog dog1=new Dog("Winston",4,'M');
        dog1.sleep();
        dog1.eat();
        dog1.bark();
        System.out.println("Doge name : "+dog1.dogName);
        System.out.println("Doge age : "+dog1.age);
        System.out.println("Doge gender : "+dog1.gender);
        System.out.println(dog1);
        System.out.println("==========================================");
        Animal animal1=new Dog("Grizzly",4,'F');
        animal1.sleep();
        animal1.eat();

        System.out.println("Doge age : "+animal1.age);
        System.out.println("Doge gender : "+animal1.gender);
        System.out.println(animal1);


    }


}
