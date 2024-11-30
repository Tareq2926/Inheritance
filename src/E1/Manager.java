package E1;

public class Manager extends Employee{

    private double salaryBonus;

    public Manager(String name, double baseSalary, double salaryBonus) {
        super(name, baseSalary);
        this.salaryBonus = salaryBonus;
    }

    public double getSalaryBonus() {
        return salaryBonus;
    }

    public void setSalaryBonus(double salaryBonus) {
        this.salaryBonus = salaryBonus;
    }

    @Override
    public double getBaseSalary() {
        return super.getBaseSalary()+salaryBonus;
    }

    @Override
    public String toString() {
        return "Name:"+getName()+"  TotalSalary:"+getBaseSalary()+"  Bonus:"+getSalaryBonus();
    }
}
