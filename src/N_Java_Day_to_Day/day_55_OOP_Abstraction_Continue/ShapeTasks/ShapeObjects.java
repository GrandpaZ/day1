package N_Java_Day_to_Day.day_55_OOP_Abstraction_Continue.ShapeTasks;

public class ShapeObjects {
    public static void main(String[] args) {

      Circle circle1=new Circle(2.5);
        System.out.println(circle1);
        System.out.println("Circle has Volume: "+circle1.hasVolume);
      Circle circle2=new Circle(3.5);
        System.out.println(circle2);
        System.out.println("=======================================");
        Rectangle rectangle1=new Rectangle(10,5);
        System.out.println(rectangle1);
        System.out.println("Rectangle1 has Volume: "+rectangle1.hasVolume);
        System.out.println(new Rectangle(20,30));
        System.out.println("=======================================");
        Cylinder cylinder1=new Cylinder(5,10);
        System.out.println(cylinder1);
        System.out.println(cylinder1.hasVolume);
        System.out.println("=======================================");
        Cylinder cylinder2=new Cylinder(0,0);
        System.out.println(cylinder2);







    }
}
