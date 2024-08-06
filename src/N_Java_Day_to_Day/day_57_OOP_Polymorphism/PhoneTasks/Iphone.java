package N_Java_Day_to_Day.day_57_OOP_Polymorphism.PhoneTasks;

public class Iphone extends Phone implements AppleApp,Downloadable{

    public Iphone( String model, String size, double price) {
        super("Iphone", model, size, price);
        if (price > 1500) {
            throw new RuntimeException("Iphone price cannot be greater than 1500");
        }
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Iphone is texting "+phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Iphone is calling "+phoneNumber);
    }

    @Override
    public void download() {
        System.out.println("Iphone is downloading app from " + AppStoreName);
    }
    public void facetime(long phoneNumber){
        System.out.println("Iphone is facetiming "+phoneNumber);
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "Brand='Iphone" + Brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                '}';

    }











}
