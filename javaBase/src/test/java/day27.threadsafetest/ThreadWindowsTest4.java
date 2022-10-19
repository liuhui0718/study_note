package day27.threadsafetest;

/**
 * 使用同步方法解决继承Thread类创建线程的安全问题
 *
 * 关于同步方法的总结：
 *
 * 1，同步方法仍然涉及到同步监视器，只是不需要我们显式的声明
 * 2，非静态的同步方法，同步监视器是：this；
 *    静态的同步方法，同步监视器是：当前类本身
 */

public class ThreadWindowsTest4 {
    public static void main(String[] args) {
        ThreadTest t1 = new ThreadTest();
        ThreadTest t2 = new ThreadTest();
        ThreadTest t3 = new ThreadTest();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}


class ThreadTest extends Thread{
    private static int ticket = 100;



    @Override
    public void run() {
        while (ticket != 0){
            show();


        }

    }

    public static synchronized void show(){ // 同步监视器 ThreadTest.class
        //public synchronized void show(){  同步监视器：t1，t2，t3  这种解决方式是错误的
        if (ticket > 0){
            try {
                Thread.sleep(100);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "     票数为："+ ticket);
            ticket--;
        }

    }
}
