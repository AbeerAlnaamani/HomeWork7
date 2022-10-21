public class Student extends Person{
    private String major;
    public Student(String name,String BirthYear,String major)
    {
        super(name,BirthYear);
        this.major=major;
    }
    public String toString()
    {
        String fullInfo=super.toString()+" "+major;
        return fullInfo;
    }
}

