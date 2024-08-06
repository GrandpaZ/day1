package N_Java_Day_to_Day.day_56_OOP_Abstraction_Interface.AnimalTask;

public class Turtle extends Animal implements Swimmable{


    @Override
    public void eat() {System.out.println("Turtle is eating ");}

    @Override
    public void sleep() {System.out.println("Turtle is sleeping");}

    @Override
    public void swim() {System.out.println("Turtle i swimming");}
}
