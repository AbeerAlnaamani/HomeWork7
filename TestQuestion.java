import java.util.ArrayList;
import java.util.Scanner;

public class TestQuestion {

    public static void main(String[] args) {

        ArrayList<Question> all= new ArrayList<>();
        Question Q1= new Question();
        Q1.setText("whats your name?");
        Q1.setAnswer("Abeer");

        ChoiceQuestion Q2= new ChoiceQuestion();
        Q2.setText("Who are you?");
        Q2.addChoice("ali",false);
        Q2.addChoice("Abeer",true);
        Q2.addChoice("hana",false);

        all.add(Q1);
        all.add(Q2);
        for (int i = 0; i <all.size() ; i++) {
            presentQuestion(all.get(i));
        }

    }
    public static void presentQuestion(Question q)
    {
        q.toString();
        Scanner in= new Scanner(System.in);
        String  x=in.next();
        System.out.println(q.checkAnswer(x));
    }

}


