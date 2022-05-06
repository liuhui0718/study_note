package day15.supertest.exer;

/**
 * @Author Miracle Liuhui
 * @Date 2022/3/29 下午6:55
 * @Version 1.0
 */
public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount checkAccount = new CheckAccount(1122,20000,0.045,5000);
        checkAccount.withDraw(5000);
        System.out.println(checkAccount.getBalance());
        System.out.println(checkAccount.getOverdraft());
        System.out.println();

        checkAccount.withDraw(18000);
        System.out.println(checkAccount.getBalance());
        System.out.println(checkAccount.getOverdraft());

        System.out.println();

        checkAccount.withDraw(3000);
        System.out.println(checkAccount.getBalance());
        System.out.println(checkAccount.getOverdraft());
    }

}
