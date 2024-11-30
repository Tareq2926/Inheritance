package E12;

public class Student extends Person{
    private String major;

    public Student(String name, int yearOfBirth, String major) {
        super(name, yearOfBirth);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Name: "+getName()+"  Year of Birth:"+getYearOfBirth()+"  Major:"+getMajor();
    }
}
