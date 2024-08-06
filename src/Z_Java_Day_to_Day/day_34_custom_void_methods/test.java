package Z_Java_Day_to_Day.day_34_custom_void_methods;
public class test {

    public static String myName="Zilikram";
    public static void checkTheNumber(int input){
        if(input%2==0){
           System.out.println(input+"is even number");
        }
        else{
     System.out.println(input+"is not even number");
    }

}

// non static
    public void helloWord(){
        System.out.println("HelloWord");
    }

    public static void main(String[] args) {
        test.checkTheNumber(8);
        String name="Zach";
        System.out.println("myName = " + test.myName);
        test.myName="Balabala";
        System.out.println("myName = " + test.myName);


        System.out.println("=================================");

        test obj=new test();
        obj.helloWord();

    }
}
