package N_Java_Day_to_Day.day_50_Inheritanc_Overriding.ShapeTask;

public class Circle extends Shape{
    public double radius;
    public double diameter;
    public static double PI=3.14;
    public Circle(double radius){
        this.radius=radius;
             diameter=radius*2;
             area=calculateArea();
             perimeter=calculatePerimeter();

    }
    public double calculateArea(){return radius*radius*PI;}
    public double calculatePerimeter(){return diameter*PI;}

}
