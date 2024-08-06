package test.Interface;

public class Nokia implements Phone{
    String name="Nokia";
    double price=299.99;

    @Override
    public void phoneInfo() {
        System.out.println("Phone brane: "+this.name+"\n Phone price : "+this.price);
    }
}
