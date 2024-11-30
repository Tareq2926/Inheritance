package E3;

public class Test {
    public static void main(String[] args) {
        BasicAccount basicAccount = new BasicAccount(1000);
        System.out.println(basicAccount);

        basicAccount.withdraw(1001);
        System.out.println(basicAccount);

        basicAccount.deposit(50);
        System.out.println(basicAccount);
    }
}
