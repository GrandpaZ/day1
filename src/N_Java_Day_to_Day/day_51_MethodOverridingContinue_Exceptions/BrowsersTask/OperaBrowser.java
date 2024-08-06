package N_Java_Day_to_Day.day_51_MethodOverridingContinue_Exceptions.BrowsersTask;

public class OperaBrowser extends WebDriver{
    public void get(String url) {
        System.out.println("Opening the "+url+" in OperaBrowser browser");
    }

    public void close() {
        System.out.println("Closing the OperaBrowser browser");
    }
}
