package E2;

public class Test {
    public static void main(String[] args) {
       BasicAccount basicAccount = new BasicAccount("Tarek",1000);

        System.out.println(basicAccount);

        basicAccount.withdraw(700);
        System.out.println(basicAccount);

        basicAccount.deposit(500);
        System.out.println(basicAccount);

        basicAccount.withdraw(300);
        System.out.println(basicAccount);

        basicAccount.withdraw(30000);
        System.out.println(basicAccount);


    }
}
