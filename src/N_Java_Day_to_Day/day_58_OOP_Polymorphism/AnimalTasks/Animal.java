package N_Java_Day_to_Day.day_58_OOP_Polymorphism.AnimalTasks;

public class Animal {

public int age;
public char gender;

    public Animal(int age, char gender) {
        this.age = age;
        this.gender = gender;
    }

    public void eat(){System.out.println("Animal is eating");}
    public void sleep(){System.out.println("Animal is Sleeping");}


    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", gender=" + gender +
                '}';
    }
}
