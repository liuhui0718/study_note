package day12.thistest3;

public class Account {
    private double balance;

    public  Account(){

    }

    public  Account(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return  balance;
    }
    public void deposit(double amt){
        if (amt > 0){
            balance += amt;
            System.out.println("成功存入" + amt);
        }
    }

    public void withdraw(double amt){
        if (amt > balance){
            System.out.println("余额不足");
        }else {
            balance -= amt;
            System.out.println("余额为：" + balance);
        }
    }
}

