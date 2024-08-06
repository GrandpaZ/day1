package Z_Java_Day_to_Day.day_18_conditions_review;

public class ScoreRangeTest {
    public static void main(String[] args) {
        System.out.println("Welcome to score tester range");
        System.out.println("please type your score");
        int score =1000;
        if (score>1&&score<=40){
            System.out.println("your score is D - "+score);
        } else if (score>40&&score<=60) {
            System.out.println("your score is C - "+score);
        } else if (score>60&&score<90) {
            System.out.println("your score is B - "+score);
        } else if (score>=90&&score<=100) {
            System.out.println("your score is A - "+score);
        }else {
            System.out.println("you have entered invalid score");
        }

    }
}
