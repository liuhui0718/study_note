package day15.supertest.exer;

/**
 * @Author Miracle Liuhui
 * @Date 2022/3/29 下午6:32
 * @Version 1.0
 */
public class CheckAccount extends Account {

    private  double overdraft;//可透支限额


    public double getOverdraft() {
        return overdraft;
    }

    public CheckAccount(double overdraft) {
        this.overdraft = overdraft;
    }

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public void withDraw(double amount){
        if (amount <=  getBalance()){
            super.withDraw(amount);
        }else if (overdraft >= amount-getBalance()){


            overdraft = overdraft - (amount-getBalance());
            setBalance(0);

        }else {
            System.out.println("透支额度不足");
        }
    }
}
