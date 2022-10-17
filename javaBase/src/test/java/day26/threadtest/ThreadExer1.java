package day26.threadtest;

/**
 * 创建两个分线程，其中一个遍历100以内的偶数，一个遍历100以内的奇数
 */
public class ThreadExer1 {

    public static void main(String[] args) {
         new Thread(){
             public void run() {
                 for (int i = 0; i < 100; i++) {
                     if (i % 2 == 0) {
                         System.out.println(Thread.currentThread().getName() + "  " + i);
                     }

                 }
             }
         }.start();
         //创建Thread类的匿名子类
       new Thread(){
           public void run() {
               for (int i = 0; i < 100; i++) {
                   if (i % 2 != 0){
                       System.out.println(Thread.currentThread().getName()+"  "  + i);
                   }

               }

           }
       }.start();

    }


}

class MyThread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName()+"  "  + i);
            }

        }

    }
}


class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0){
                System.out.println(Thread.currentThread().getName()+"  "  + i);
            }

        }

    }

}
