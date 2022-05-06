package day15.supertest.exer;

/**
 * @Author Miracle Liuhui
 * @Date 2022/3/29 下午6:20
 * @Version 1.0
 */
public class Account {
    private int id;//账户
    private double balance;//余额
    private double annualInterestRate;//年利率


    public Account(){

    }
    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }


    //获取月利率
    public double getMonthlyInterest(){
        return annualInterestRate/12;
    }


    //取钱
    public void withDraw(double amount){
        if (amount > balance){
            System.out.println("余额不足");
        }else{
            balance -= amount;
        }

    }


    //存钱
    public void deposit(double amount){
        balance += amount;

    }
}
