package N_Java_Day_to_Day.day_49_Inheritanc_Practice.ScrumTeamTasks;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class AppleInc {
    public static void main(String[] args) {


    Tester tester1=new Tester("Alex",30,'F',128888,123456,"SDET");
    Tester tester2=new Tester("Bonnie",20,'F',120888,654321,"SDET");
    Tester tester3=new Tester("Chris",18,'M',126888,123321,"SDET");
    Tester[] testers={tester1,tester2,tester3};
    Developer developer1=new Developer("Depdigna",88,'M',186888,520888,"SDET");
    Developer developer2=new Developer("Esil",28,'F',100888,345543,"Lead Developer");
    Developer developer3=new Developer("Fiona",68,'M',286888,520666,"Lead skr");
    Developer developer4=new Developer("Good",66,'M',286888,566666,"Lead Xax");
    Developer[] developers={developer1,developer2,developer3,developer4};
    ScramTeam scrum1=new ScramTeam(testers,developers);
        System.out.println(scrum1);
    Tester[] testers2={
            new Tester("Harper",46,'M',186188,522366,"Lead 0.0"),
            new Tester("Iris",36,'F',100688,512366,"Lead ;)"),
    };
    Developer[] developers2={
                new Developer("Harper",46,'M',186188,522366,"Lead 0.0"),
                new Developer("Iris",36,'F',100688,512366,"Lead ;)"),
                new Developer("John",28,'M',100608,543266,"Lead xD"),
    };
    ScramTeam scram2=new ScramTeam(testers2,developers2);
        System.out.println(scram2);
        scram2.removeDeveloper(543266);
        scrum1.removeTester(120888);
        ScramTeam[] allScrumTeam={scrum1,scram2};
        System.out.println("==============================");
        System.out.println("Testers: ");
        for (ScramTeam eachScrum : allScrumTeam){
            for (Tester eachTester:eachScrum.testers){
                System.out.println(eachTester.name+" "+eachTester.Salary);
            }
        }
        System.out.println("==============================");
        System.out.println("Developer: ");
        for (ScramTeam eachScrum : allScrumTeam){
            for (Developer eachDeveloper:eachScrum.developers){
                System.out.println(eachDeveloper.name+" "+eachDeveloper.Salary);
            }
        }

}}
