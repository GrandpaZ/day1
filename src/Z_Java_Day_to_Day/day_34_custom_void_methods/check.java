package Z_Java_Day_to_Day.day_34_custom_void_methods;

public class check {

    public static void main(String[] args) {
        test.checkTheNumber(9);
        System.out.println("test.myName = " + test.myName);
        test.myName="Zach";
        System.out.println(test.myName);

        test obj=new test();
        obj.helloWord();

        check checkObj=new check();
       // block.sayHii("hi");

    }
}
