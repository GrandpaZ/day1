package Z_Java_Day_to_Day.day_14_Multi_branch;

public class Weather_ {
    public static void main(String []args) {
        String Weather = "rainy";
        System.out.println(" What's the weather today ? ");
        if (Weather == "sunny") {
            System.out.println(Weather+" - Go to park , hiking , and code java ");
        } else if (Weather == "rainy") {
            System.out.println(Weather+" - stay home , drink tea , and code java ");
        } else if (Weather == "snowy") {
            System.out.println(Weather+" - clean the car then build snowman , drink hot chocolate , and code java ");
        } else if (Weather == "windy") {
            System.out.println(Weather+" - Get ready for power loss , fly a kite , and code java ");
        } else{
            System.out.println(" just keep coding java");
        }
    }}