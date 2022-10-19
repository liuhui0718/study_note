package day27.threadsafetest;

/**
 * 使用同步方法解决实现Runnable接口的线程安全问题
 */



public class ThreadWindowsTest3 implements Runnable {

    private  int ticket =100;



    @Override
    public void run() {
        while(ticket!=0) {
            show();

        }
    }


    private synchronized void show() {//同步监视器：this
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "票号为： " + ticket);
            ticket--;
        }
    }

}


class RunnableTest {
    public static void main(String[] args) {

        ThreadWindowsTest3 t = new ThreadWindowsTest3();

        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);

        t1.setName("线程1");
        t2.setName("线程2");
        t3.setName("线程3");

        t1.start();
        t2.start();
        t3.start();

    }
}
