package E4;

public class Test {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(500);
        System.out.println(checkingAccount);

        checkingAccount.deposit(100);
        System.out.println(checkingAccount);

        checkingAccount.withdraw(400);
        System.out.println(checkingAccount);

        checkingAccount.withdraw(300);
        System.out.println(checkingAccount);

        checkingAccount.withdraw(200);
        System.out.println(checkingAccount);

        checkingAccount.withdraw(100);
        System.out.println(checkingAccount);
    }
}
