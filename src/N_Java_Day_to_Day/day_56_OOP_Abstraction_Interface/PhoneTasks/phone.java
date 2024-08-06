package N_Java_Day_to_Day.day_56_OOP_Abstraction_Interface.PhoneTasks;

public abstract class phone {
    public String brand;
    public String model;
    public double price;
    public String size;

    public abstract void calling (long phoneNumber);
    public abstract void calling(long num1,long num2);

    public abstract void texting (long phoneNumber);
    public abstract void texting(long num1,long num2);

    @Override
    public String toString() {
        return "phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price= $" + price +
                ", size='" + size + '\'' +
                '}';
    }

    public phone(String brand, String model, double price, String size) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.size = size;
    }
}
