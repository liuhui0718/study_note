package day19.statictest;

/**
 * @Author Miracle Liuhui
 * @Date 2022/4/1 下午8:18
 * @Version 1.0
 */
public class StaticExer2 {
    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account("123456",2000);
        System.out.println(a1);
        System.out.println(a2);

        Account.setIntrerstRate(0.34);
        Account.setMinMoney(1000);

        System.out.println(a1.getIntrerstRate());
        System.out.println(a2.getMinMoney());
        Account account = new Account();
        System.out.println(account);




    }
}



class Account{
    private int id;
    private String password;
    private double balance;

    private static double intrerstRate ;
    private  static double minMoney = 1.0;
    private static int init = 1001;//用于自动生成ID使用

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }


    public static double getIntrerstRate() {
        return intrerstRate;
    }

    public static void setIntrerstRate(double intrerstRate) {
        Account.intrerstRate = intrerstRate;
    }

    public static double getMinMoney() {
        return minMoney;
    }

    public static void setMinMoney(double minMoney) {
        Account.minMoney = minMoney;
    }

    public static int getInit() {
        return init;
    }

    public static void setInit(int init) {
        Account.init = init;
    }


    public Account(){
        id = init++;

    }
    public Account(String password,double balance){
        id = init++;
        this.password = password;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}
