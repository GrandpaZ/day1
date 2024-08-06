package Z_Java_Day_to_Day.day_16_switch;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        String size ="venti";

        switch (size){
            case "tell":
                System.out.println(" Tall Cappuccino Please ");
                System.out.println(" price : 3.69 $ ");
                System.out.println(" calories : 90");
                break;
            case "grade":
                System.out.println(" Grad Cappuccino Please ");
                System.out.println(" price : 3.99 $ ");
                System.out.println(" calories : 120");
                break;
            case "venti":
                System.out.println(" Venti Cappuccino Please ");
                System.out.println(" price : 4.29 $ ");
                System.out.println(" calories : 150");
                break;
            default:
                System.out.println(" We Do Not serve that size of Cappuccino ");
        }








    }
}
