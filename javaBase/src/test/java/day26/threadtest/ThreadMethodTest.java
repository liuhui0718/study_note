package day26.threadtest;

import static java.lang.Thread.yield;

/**
 * 测试Thread中常用方法
 *
 * 1，start()：启动当前线程，调用当前线程的run()；
 * 2，run()：通常需要重写Thread类中的此方法，并将创建的线程要执行的操作声明在此方法中
 * 3，currentThread()：静态方法，返回执行当前代码的线程
 * 4，getName()：获取当前线程的名字
 * 5，setName():设置当前线程的名字
 * 6，yield():释放当前cpu的执行权
 * 7,jion():在线程a中调用线程b的join()，此时线程a处于阻塞状态，直到线程b完全执行完以后才会执行a的线程
 * 8,sleep(long millitime)：让线程睡眠指定的millitime（毫秒数）
 * 9,isAlive();判断当前线程是否存活
 *
 *
 * 线程的优先级
 *
 * MAX_PRIORITY:10
 * MIN_PRIORITY:1
 * NORM_PRIORITY:5-默认优先级
 *
 * 如何设置和获取当前线程的优先级
 * getPriority()：获取线程的优先级
 * setPriority()：设置线程的优先级
 *
 * 说明：高优先级的线程要抢占低优先级线程cpu的执行权，但是只是从概率上讲，高优先级的线程高概率的情况下被执行
 *      并不意味者只有高优先级的线程执行完以后，低优先级的线程执行
 *
 *
 *
 */

public class ThreadMethodTest {
    public static void main(String[] args) {

        ThreadTest1 t1 = new ThreadTest1();
        ThreadTest2 t2 = new ThreadTest2("线程二");

        t1.setName("线程一");
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();


        Thread.currentThread().setName("主线程");
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        for (int i = 0; i <100 ; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + "  " + Thread.currentThread().getPriority()+"  "+ i);

            }
//            if (i == 20) {
//                //yield();//释放当前cpu的执行权
//                try {
//                    t1.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//            }


        }
        System.out.println(t1.isAlive());


    }

}

class ThreadTest1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName()+ "  "+Thread.currentThread().getPriority() +"    "+ i);
            }


        }
    }
}

class ThreadTest2 extends Thread{


    //构造器设置线程名字
    public ThreadTest2(String name){
        super(name);

    }
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            if (i % 2 != 0){
                System.out.println(Thread.currentThread().getName()+ "  " + i);
            }

        }
    }
}
