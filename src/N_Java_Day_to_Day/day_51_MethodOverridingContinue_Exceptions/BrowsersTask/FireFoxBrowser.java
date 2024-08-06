package N_Java_Day_to_Day.day_51_MethodOverridingContinue_Exceptions.BrowsersTask;

public class FireFoxBrowser extends WebDriver {


    public void get(String url) {System.out.println("Opening the "+url+" in FireFox browser");}

    public void close() {System.out.println("Closing the FireFox browser");}
}
