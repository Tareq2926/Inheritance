package E3;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance +=amount;
        }
    }
    public void withdraw(double amount){
        balance -=amount;
    }

    @Override
    public String toString() {
        return "Balance: "+getBalance();
    }
}
