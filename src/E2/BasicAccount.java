package E2;

public class BasicAccount extends BankAccount{

    public BasicAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void withdraw(double amount) {

        if(amount<=getBalance()){
            super.withdraw(amount);
        }
        else{
            System.out.println("Insufficiant Balance ");
        }
    }

}
