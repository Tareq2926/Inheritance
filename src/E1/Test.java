package E1;

public class Test {
    public static void main(String[] args) {

        Manager manager = new Manager("Tarek",500,44);

        Employee employee = new Employee("Ahmed",200);

        System.out.println(manager);
        System.out.println(employee);

        manager.setSalaryBonus(5000);
        System.out.println(manager);

        System.out.println(manager.getBaseSalary());


    }
}
