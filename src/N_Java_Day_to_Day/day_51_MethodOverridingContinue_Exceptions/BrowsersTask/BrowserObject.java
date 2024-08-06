package N_Java_Day_to_Day.day_51_MethodOverridingContinue_Exceptions.BrowsersTask;

public class BrowserObject {
    public static void main(String[] args) {

        ChromeBrowser chrome = new ChromeBrowser();
        chrome.get("https://www.google.com/");
        chrome.close();
        System.out.println("============================");
        FireFoxBrowser foxBrowser=new FireFoxBrowser();
        foxBrowser.get("https://www.google.com/");
        foxBrowser.close();
        System.out.println("============================");
        OperaBrowser operaBrowser=new OperaBrowser();
        operaBrowser.get("https://www.google.com/");
        operaBrowser.close();





    }
}