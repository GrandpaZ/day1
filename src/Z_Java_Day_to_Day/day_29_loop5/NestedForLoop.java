package Z_Java_Day_to_Day.day_29_loop5;

public class NestedForLoop {
    public static void main(String[] args) {
        int inner;
        int outer;
        for (outer=1;outer<=5;outer++){
            System.out.println(" Outer = "+outer);
            System.out.println("================");
            for (inner=1;inner<=10;inner++){
                System.out.println(" inner = "+ inner);
            }
        }
    }
}
