package day10_shorthand_operators;

public class shortHandOperators {
    public static void main(String[] args) {
        int cars=10;
        System.out.println("Cars in the parking lot = "+cars);
        cars=cars+2;
        System.out.println("Cars in the parking lot = "+cars);
        cars+=5;
        System.out.println("Cars in the parking lot = "+cars);
        cars=cars-1;
        System.out.println("Cars left in the parking lot = "+cars);
        cars-=2;
        System.out.println("Cars left in the parking lot = "+cars);
        int elctricCars = 13;
        cars+=elctricCars;
        System.out.println("Total of  "+cars+" cars in the parking lot ");
        String word="Jave";
        System.out.println(" Word + "+word);
        word=word+"programming";
        System.out.println(" Word + "+word);
        word="Is fun";
        System.out.println("Word = "+word);
    }
}
