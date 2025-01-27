package N_Java_Day_to_Day.day_58_OOP_Polymorphism.AnimalTasks;

public class Dog extends Animal{

    public String dogName;



    public Dog(String dogName,int age, char gender) {
        super(age, gender);
        this.dogName=dogName;
    }


    public void bark(){System.out.println("Dog "+dogName+" is barking");}
    public void eat(){System.out.println("Dog "+dogName+" is eating");}
    public void sleep(){System.out.println("Dog "+dogName+" is sleeping");}

    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
