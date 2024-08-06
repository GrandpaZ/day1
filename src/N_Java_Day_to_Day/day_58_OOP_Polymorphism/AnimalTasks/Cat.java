package N_Java_Day_to_Day.day_58_OOP_Polymorphism.AnimalTasks;

public class Cat extends Animal{

    public String catName;






    public Cat(String catName,int age, char gender) {
        super(age, gender);
        this.catName=catName;

    }



    public void scratch(){System.out.println("Cat "+catName+" is scratch");}


    @Override
    public String toString() {
        return "Cat{" +
                "catName='" + catName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
