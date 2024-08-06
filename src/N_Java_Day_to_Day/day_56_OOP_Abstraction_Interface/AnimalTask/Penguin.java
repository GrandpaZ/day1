package N_Java_Day_to_Day.day_56_OOP_Abstraction_Interface.AnimalTask;

public class Penguin extends Animal implements Swimmable,Playable{
    @Override
    public void eat() {System.out.println("Penguin is eating ");}

    @Override
    public void sleep() {System.out.println("Penguin is sleeping ");}

    @Override
    public void swim() {System.out.println("Penguin is Swimming ");}
    public void play(){System.out.println("Penguin is playing");}
}
