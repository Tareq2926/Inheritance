package E13;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee("Tarek",1000);
        System.out.println(employee);

        Manager manager = new Manager("Ahmed",500,"CSE");
        System.out.println(manager);

        Executive executive = new Executive("Tasnim",2000,"HR");
        System.out.println(executive);
    }
}
