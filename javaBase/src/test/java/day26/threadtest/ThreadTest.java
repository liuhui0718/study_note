package day26.threadtest;

/**
 * 多线程的创建，方式一：继承于Thread类
 *
 * 1,创建一个Thread类的子类
 * 2，重写Thread类中的run()----将此线程执行的操作声明在run中
 * 3，创建Thread类的子类的对象
 * 4，通过此对象调用start()
 *
 *
 * //例子：遍历100以内的偶数
 */

public class ThreadTest {
    public static void main(String[] args) {
        //3，创建Thread类的子类的对象
        MyThread myThread = new MyThread();

        //4，通过此对象调用start()：1，启动当前线程；2，调用当前线程的run（）
        myThread.start();
        //问题一：我们不能通过直接调用run（）的方式启动线程
        //myThread.run();

        //问题二：再启动一个线程，遍历100以内的偶数，不可以让已经start（）的线程去执行，会报错；我们需要重新建一个对象
        MyThread m2 = new MyThread();
        m2.start();

        //如下操作仍然是在main线程中执行
        for (int i = 0; i <50 ; i++) {
            if (i % 2 != 0){
                System.out.println(i+"奇数");
            }

        }

    }

}


//1,创建一个Thread类的子类
class MyThread extends Thread{

    //2，重写Thread类中的run()
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }

        }


    }
}
