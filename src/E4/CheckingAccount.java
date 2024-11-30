package E4;

import java.time.LocalDate;

public class CheckingAccount extends BankAccount{
     private static final double FirstOverDraft = 20;
     private static final double SecondOverDraft = 30;

     private int countOverDraft;
     private int currentMonth;

    public CheckingAccount(double balance) {
        super(balance);
        this.countOverDraft = countOverDraft;
        this.currentMonth = currentMonth;
    }

    @Override
    public void withdraw(double amount){
       int month = LocalDate.now().getDayOfMonth();

       if(month != currentMonth){
           countOverDraft = 0;
            currentMonth = month;
       }
       if(amount > getBalance()){
           countOverDraft++;
           if(countOverDraft == 1){
             super.withdraw(amount+FirstOverDraft);
           }
           else{
               super.withdraw(amount+SecondOverDraft);
           }
       }
       else{
           super.withdraw(amount);
       }
    }
}
