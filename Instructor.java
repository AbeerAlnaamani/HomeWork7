public class Instructor extends Person{
    private double salary;
    public Instructor(String name,String BirthYear,double salary)
    {
        super(name,BirthYear);
        this.salary=salary;
    }
    public String toString()
    {
        String fullInfo=super.toString()+" "+salary;
        return fullInfo;
    }
}

