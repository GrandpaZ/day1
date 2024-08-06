package N_Java_Day_to_Day.day_56_OOP_Abstraction_Interface.AnimalTask;

public class Snake extends Animal implements Swimmable{
    @Override
    public void eat() {System.out.println("Snake is eating");}

    @Override
    public void sleep() {System.out.println("Snake is sleeping");}
    public void swim(){System.out.println("Snake is swimming ");}
}
