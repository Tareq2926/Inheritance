package E2;

public class BankAccount {
    private String name;
    private double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance +=amount;
        }
    }
    public void withdraw(double amount){
        balance -=amount;
    }

    @Override
    public String toString() {
        return "Name: "+getName()+"  Balance: "+getBalance();
    }
}
