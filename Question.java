public class Question {
    protected String text;
    private String answer;

    public Question()
    {
        text="";
        answer="";
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public boolean checkAnswer(String respons) {
        int i=0,sumLength=0;
        String capRespons=respons.toUpperCase();
        String capAnswer=answer.toUpperCase();
        while (i<answer.length()&&capAnswer.charAt(i)==capRespons.charAt(i))
        {
            i++;
            sumLength++;
        }
        if(sumLength==answer.length())  return true;
        else return false;
    }
    public String toString(){
        System.out.println("**********************************");
        System.out.println(text);
        return null;
    }
}
