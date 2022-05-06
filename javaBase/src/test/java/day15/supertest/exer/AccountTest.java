package day15.supertest.exer;

/**
 * @Author Miracle Liuhui
 * @Date 2022/3/29 下午6:27
 * @Version 1.0
 */
public class AccountTest {

    public static void main(String[] args) {
        Account account = new Account(1122,20000,0.045);
        account.withDraw(30000);
        System.out.println(account.getBalance());

        System.out.println("=============");
        account.withDraw(2500);
        System.out.println(account.getBalance());
        System.out.println("==============");

        account.deposit(3000);
        System.out.println(account.getBalance());
        System.out.println(account.getMonthlyInterest());
    }

}
