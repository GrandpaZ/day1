package test.Interface;

public class Apple implements Phone{
    String name="apple";
    double price=1499.99;

    @Override
    public void phoneInfo() {
        System.out.println("Phone brane: "+this.name+"\n Phone price : "+this.price);
    }
}
