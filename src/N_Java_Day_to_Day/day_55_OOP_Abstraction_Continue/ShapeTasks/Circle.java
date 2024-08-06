package N_Java_Day_to_Day.day_55_OOP_Abstraction_Continue.ShapeTasks;

import Z_Java_Day_to_Day.day_16_switch._switch;

public final  class Circle extends Shape{
    public double radius;

    public Circle(double radius){
        if (radius<=0){
            throw new RuntimeException("Radius of the circle can not be negative or 0 ");
        }
        this.radius=radius;
        area=calculateArea();
        perimeter=calculatePerimeter();
        volume=calculateVolume();
    }
    public  double calculateArea(){return Math.pow(radius,2)*Math.PI;}
    public  double calculatePerimeter(){return radius*2*Math.PI;}
    public  double calculateVolume(){return 0;}

    static{
        name="Circle";
        hasVolume=false;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }
}
