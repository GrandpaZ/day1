package N_Java_Day_to_Day.day_57_OOP_Polymorphism.PhoneTasks;

public class Samsung extends Phone implements Downloadable,AndroidApp{


    public Samsung(String model, String size, double price) {
        super("Samsung", model, size, price);
        if (price>1200){
            throw new RuntimeException("Samsung price cannot be greater than 1200 ");
        }
    }

    @Override
    public void download() {System.out.println("Samsung is downloading app from "+AppStoreName);}

    @Override
    public void texting(long phoneNumber) {System.out.println("Samsung is texting "+phoneNumber);}

    @Override
    public void calling(long phoneNumber) {System.out.println("Samsung is calling "+phoneNumber);}

    public void freezing(){System.out.println("Samsung is freezing");}


    @Override
    public String toString() {
        return "Samsung{" +
                "Brand='" + Brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                '}';
    }
}
