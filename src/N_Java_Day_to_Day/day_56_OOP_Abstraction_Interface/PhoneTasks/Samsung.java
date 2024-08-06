package N_Java_Day_to_Day.day_56_OOP_Abstraction_Interface.PhoneTasks;

public final class Samsung extends phone{
public static String brand="Samsung";
    public Samsung(String brand, String model, double price, String size) {
        super(brand, model, price, size);
        if (price<=0||price>1200){
            throw new RuntimeException("Invalid price: "+price);
        }
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Samsung is calling "+phoneNumber);
    }
    public void calling(long num1,long num2){
        calling(num1);
        calling(num2);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Samsung is texting "+phoneNumber);
    }
    public void texting(long num1,long num2){
        texting(num1);
        texting(num2);
    }
    public void freezing(){
        System.out.println("Samsung is freezing");
    }




    @Override
    public String toString() {
        return "Samsung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price= $" + price +
                ", size='" + size + '\'' +
                '}';
    }
}
