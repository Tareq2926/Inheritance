package E13;

public class Executive extends Manager {
    public Executive(String name, double salary, String department) {
        super(name, salary, department);
    }

    public String toString() {
        return "Name: "+getName()+"  Salary:"+getSalary()+"  Dept: "+getDepartment();
    }
}

