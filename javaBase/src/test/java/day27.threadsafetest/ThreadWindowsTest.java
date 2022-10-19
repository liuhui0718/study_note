package day27.threadsafetest;

/**
 * 创建三个窗口，总票数为100张，使用继承Thread类的方式
 *
 *
 * 使用同步代码块来解决继承Thread类的方式的线程安全问题
 *
 *
 * 在继承Thread类来创建多线程的方式中，慎用this来充当同步监视器，需要看是不是同一个对象
 */

class Windows extends Thread{
    private static int ticket = 100;

   private static Object obj =new Object();

//    private Windows(){
//
//    }
//
//   private static Windows windows = new Windows();
//
//    public static  Windows getWindows(){
//        return windows;
//
//    }

    @Override
    public void run() {
        while (true) {
            //正确的
            //synchronized (obj) {
            synchronized(Windows.class){//Windows.class类只会加载一次
                //错误的方式:this代表者w1，w2，w3三个对象
                //synchronized(this){
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "买票：票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}

public class ThreadWindowsTest {

    public static void main(String[] args) {
        Windows w1 = new Windows();
        Windows w2 = new Windows();
        Windows w3 = new Windows();


        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }


}
