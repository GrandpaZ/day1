package N_Java_Day_to_Day.day_49_Inheritanc_Practice.ScrumTeamTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class ScramTeam {

    public ArrayList<Tester> testers=new ArrayList<>();
    public ArrayList<Developer> developers = new ArrayList<>();

   public ScramTeam(Tester[] testers,Developer[] developers){
      addTesters(testers);
      addDevelopers(developers);
   }
    public void addTester(Tester tester){testers.add(tester);}
    public void addDeveloper(Developer developer){developers.add(developer);};
    public void  addTesters(Tester[] testers){this.testers.addAll(Arrays.asList(testers));}
    public void addDevelopers(Developer[] developers){this.developers.addAll(Arrays.asList(developers));}
    public void removeTester(int ID){testers.removeIf(p->p.ID==ID);}
    public void removeDeveloper(int ID){developers.removeIf(p->p.ID==ID);}
    public void removeTesterDeveloper(int testerID,int developerID){removeTester(testerID);removeDeveloper(developerID);}
    public String toString(){
        return "==================================="+
                "\nDevelopers #"+developers.size()+
                "\nTesters #"+testers.size()+
                "\nCapacity: "+((developers.size()+testers.size())*8)+" point (Dev.Team * 8 days)"+
                "\nVelocity: "+((developers.size()+testers.size())*8)+" point for current Sprint (No days off)"+
                "===================================";}
}
