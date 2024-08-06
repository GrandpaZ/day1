package N_Java_Day_to_Day.day_57_OOP_Polymorphism.PhoneTasks;

public class Huawei extends Phone implements AndroidApp,AppleApp,Downloadable{
    public Huawei( String model, String size, double price) {
        super("Huawei", model, size, price);
        if (price>200){
            throw new RuntimeException("No way Huawei is worth more than 200");
        }
    }

    @Override
    public void download() {System.out.println("Huawei is downloading apps from "+AndroidApp.AppStoreName+AppleApp.AppStoreName);}

    @Override
    public void texting(long phoneNumber) {System.out.println("Huawei is texting to "+phoneNumber);}

    @Override
    public void calling(long phoneNumber) {System.out.println("Huawei is calling "+phoneNumber);}

    public void stealInfo(){System.out.println("Huawei is stealing your info");}

    @Override
    public String toString() {
        return "Huawei{" +
                "Brand='" + Brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                '}';
    }
}
