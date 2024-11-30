package E3;
public class BasicAccount extends BankAccount {
    public double PALANTY = 30;

    public BasicAccount(double balance) {
        super(balance);
    }
    @Override
    public void withdraw(double amount){
        if(amount<=getBalance()){
            super.withdraw(amount);
        }
        else{
            super.withdraw(amount+PALANTY);
        }
    }
}
