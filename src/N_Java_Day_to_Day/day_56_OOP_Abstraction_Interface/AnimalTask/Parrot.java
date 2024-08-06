package N_Java_Day_to_Day.day_56_OOP_Abstraction_Interface.AnimalTask;

public class Parrot extends Animal implements Flyable ,Playable,Talkative{
    @Override
    public void eat() {System.out.println("Parrot is eating  ");}
    @Override
    public void sleep() {System.out.println("Parrot is sleeping ");}
    public void fly(){System.out.println("parrot is flying ");}
    public void play(){System.out.println("Parrot is playing ");}
    @Override
    public void talk() {System.out.println("Parrot is talking  ");}
}
