package test.Interface;

public class Samsung implements Phone{
    String name="Samsung";
    double price=1399.99;

    @Override
    public void phoneInfo() {
        System.out.println("Phone brane: "+this.name+"\n Phone price : "+this.price);
    }
}
