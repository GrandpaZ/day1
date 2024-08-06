package N_Java_Day_to_Day.day_56_OOP_Abstraction_Interface.AnimalTask;

public class Eagle extends Animal implements Flyable{
    @Override
    public void eat() {System.out.println("Eagle is eating ");}

    @Override
    public void sleep() {System.out.println("Eagle is Sleeping ");}

    @Override
    public void fly() {System.out.println("Eagle is flying ");}
}
