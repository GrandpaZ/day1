package Z_Java_Day_to_Day.day_45_Opp_Help_and_Stack;

public class Traffic_Light {
    String color;

    public void showColor() {
        System.out.println(" Current color = " + color);
    }

    public void changeColor(String newColor) {
        if (newColor.equalsIgnoreCase("red") || newColor.equalsIgnoreCase("yellow")
                || newColor.equalsIgnoreCase("green")) {
            System.out.println(" Changing Color to " + newColor);
            color = newColor;
        } else {
            System.out.println("Error : Invalid color "+newColor);
        }
    }
}