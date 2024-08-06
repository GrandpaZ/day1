package N_Java_Day_to_Day.day_57_OOP_Polymorphism.PhoneTasks;

public abstract class Phone {
    public String Brand,model,size;
    public double price;

    public Phone(String brand, String model, String size, double price) {
         this.Brand=brand;
         this.model=model;
        this.size = size;
        if (price<=0){
            throw  new RuntimeException("Price of the phone cannot be negative or zero ");
        }
        this.price=price;
    }

    public abstract void texting(long phoneNumber);
    public abstract void calling(long phoneNumber);















}
