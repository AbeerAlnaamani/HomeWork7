public class NumericQuestion extends Question {
    private double answer;
    public void setAnswer(double correctResponse)
    {
        answer=correctResponse;
    }
    public boolean checkAnswer(String Response)
    {
        double responseDouble=Double.parseDouble(Response);
        return Math.abs(responseDouble-answer)<=0.01;
    }
}

