package Z_Java_Day_to_Day.day_17_Ternary_Practice;

public class Nested_if_2 {
    public static void main(String []args){
        System.out.println(" Welcome to abu store , are you ready to buy the stuff ");
        System.out.println(" what can i get for you ?");
        String selection ="snack" ;
        String drink = "coke";
        String snack = "candy ";
        if (selection=="drink"){
            System.out.println("Drink option is selected");
            if (drink=="tea"){
                System.out.println("tea is selected");
            } else if (drink=="coke") {
                System.out.println("coke is selected");

            }else {
                System.out.println(" we do not have "+drink+" for drink");
            }
        } else if (selection=="snack") {
            System.out.println("snack option is selected");
            if (snack=="chips"){
                System.out.println("chips item is selection");
            }else {
                System.out.println(" we do not have "+snack+" for snack");
            }

        }


    }
}
