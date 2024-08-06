package test.Interface;

public class Xiaomi implements Phone{
    String name="Xiaomi";
    double price=499.99;

    @Override
    public void phoneInfo() {
        System.out.println("Phone brane: "+this.name+"\n Phone price : "+this.price);
    }
}
