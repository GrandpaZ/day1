package N_Java_Day_to_Day.day_56_OOP_Abstraction_Interface.PhoneTasks;

public final class Iphone extends phone{

    public static String brand="Iphone";

    public Iphone(String brand, String model, double price, String size) {
        super(brand, model, price, size);
        if (price<=0||price>1500){
            throw new RuntimeException("Invalid price: "+price);
        }
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Iphone is calling "+phoneNumber);
    }
    public void calling(long num1,long num2){
        calling(num1);
        calling(num2);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Iphone is texting "+phoneNumber);
    }
    public void texting(long num1,long num2){
        texting(num1);
        texting(num2);
    }
    @Override
    public String toString() {
        return "Iphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price= $" + price +
                ", size='" + size + '\'' +
                '}';
    }
    public void faceTiming(long phoneNumber){
        System.out.println("Iphone is FaceTiming with "+phoneNumber);
    }
    public void faceTiming(long num1,long num2){
    faceTiming(num1);
    faceTiming(num2);
    }








}
