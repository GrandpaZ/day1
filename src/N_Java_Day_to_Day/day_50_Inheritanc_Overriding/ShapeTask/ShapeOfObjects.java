package N_Java_Day_to_Day.day_50_Inheritanc_Overriding.ShapeTask;

public class ShapeOfObjects {
    public static void main(String[] args) {
        Circle circle=new Circle(3);
        System.out.println(circle.calculateArea());
        Rectangle rectangle=new Rectangle(3,4);
        System.out.println(rectangle.calculateArea());
        System.out.println(circle.calculatePerimeter());



    }

}
