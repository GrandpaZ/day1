package Z_Java_Day_to_Day.day_15_Logical_Statement;

public class Job_offer {
    public static void main(String[] args) {
        String location = "San Jose";
        double salary=110000;
        boolean remote =true;
        boolean hasBenefits=true;
        if (location.equalsIgnoreCase("san jose")&&remote&&hasBenefits&&salary>=100000){
            System.out.println("This job is at "+location+", has salary : "+salary+
                    ",\nAnd remote = "+remote+",\nHas beneefits"+hasBenefits);
            System.out.println("I decide to accept job offer ");
        }else {
            System.out.println("I decide not to accept job offer ");
            System.out.println("Because it does not fit my expectation");
        }










    }
}
