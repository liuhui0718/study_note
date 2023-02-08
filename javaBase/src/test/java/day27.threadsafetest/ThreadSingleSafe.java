package day27.threadsafetest;

/**
 *
 *使用同步机制将单例模式中的懒汉式改写为线程安全的
 */

public class ThreadSingleSafe {


}


class Bank{
    private Bank(){

    }

    private static Bank bank = null;

    private  static  Bank getInstance() {

        //方式一：效率稍差
//        synchronized (Bank.class) {
//            if (bank == null) {
//                bank = new Bank();
//            }
//            return bank;
//        }

        //方式二：效率更高
        if (bank == null) {
            synchronized (Bank.class) {
                if (bank == null) {
                    bank = new Bank();
                }
            }
        }
            return bank;


    }
}
