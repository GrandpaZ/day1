package test;

public class instance__ {
    String name="abu";
    String mood="xax";
    public void sayHi(){
        System.out.println("Hi,Hi\nHi,Hi\nHi,Hi\nHi,Hi");
    }
    public void sayBye(){
        System.out.println("Bye,Bye\nBye,Bye\nBye,Bye\nBye,Bye");
    }
    public void saySomething(String something){
        System.out.println(something+"\n"+something);
    }

    public static void main(String[] args) {
        instance__ h=new instance__();
        h.sayBye();
    }
}
