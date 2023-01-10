package day5_primtives__concatanaton;

public class CellPhone {

    public static void main(String[] args){

        String brand="apple";
        String model="14 pro";
        String color="White";
        Double price=1499.99d;
        int storage=1;
        boolean hasCamera=true;

        System.out.print("\n\t Phone brand = ");
        System.out.println(brand);
        System.out.print("\n\t model =");
        System.out.println(model);
        System.out.print("\n\t Color = ");
        System.out.println(color);
        System.out.print("\n\t Price = ");
        System.out.println(price);
        System.out.print("\n\t Storage = ");
        System.out.println(storage+"TB");
        System.out.print("\n\t It has a camera ");
        System.out.println(hasCamera);

        System.out.println("\n\tBrand is "+ brand);
        System.out.println("\n\tModel is "+model);
        System.out.println("\n\tColor is "+color);
        System.out.println("\n\tPrice is $"+price);
        System.out.println("\n\tStorage is "+storage+" TB");
        System.out.println("\n\tIt has Camera\t"+ hasCamera);



    }
}
