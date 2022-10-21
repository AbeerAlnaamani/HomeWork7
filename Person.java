public class Person {
    protected String name;
    protected String BirthYear;
    public Person(String name, String BirthYear) {
        this.name = name;
        this.BirthYear = BirthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthYear() {
        return BirthYear;
    }

    public void setBirthYear(String BirthYear) { this.BirthYear = BirthYear;}
    public String toString()
    {
        String f= name+" "+BirthYear;
        return f;
    }

}

