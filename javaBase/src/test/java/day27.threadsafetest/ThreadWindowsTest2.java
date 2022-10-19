package day27.threadsafetest;

/**
 * 创建三个窗口卖票，总共100张票，使用实现Runnable接口的方式
 *
 * 1，问题：卖票过程中，出现留重票，错票--出现留线程安全问题
 * 2，问题出现的原因：当某个线程操作车票的过程中，尚未操作完成时，其他线程参与进来，也操作车票
 * 3，如何解决：当一个线程a在操作ticket的时候，其他线程不能参与进来，直到线程a操作完ticket的时候，其他线程才能参与进来
 *              这种情况，即使线程a出现了阻塞，也不能被改变
 *
 *
 * 4，在java中，我们通过同步机制，来解决线程的安全问题
 *
 *      方式一：同步代码块
 *
 *      synchronized（同步监视器）{
 *          //需要被同步的代码
 *      }
 *      说明：1，操作共享数据的代码，即为需要被同步的代码-----》操作的代码不能包含多了，也不能包含少了
 *           2，共享数据：多个线程共同操作的变量。比如，ticket就是共享变量
 *           3，同步监视器，俗称：锁，任何一个类的对象，都可以充当锁
 *              要求：多个线程必须要公用一把锁
 *
 *
 *          补充：在实现Runnable接口创建多线程的方式中，可以考虑用this充当同步监视器。
 *
 *
 *
 *      方式二：同步方法
 *
 *      如果操作共享数据的代码完整的声明在一个方法中，我们不妨将此方法声明同步的
 *
 *
 *
 *
 *
 *  5,  同步的方式，解决了线程的安全问题----好处
 *
 *     操作同步代码时，只能有一个线程参与，其他线程等待。相当于是一个等待的过程，效率低
 *
 *
 */

class Winsows1 implements Runnable{
    private static int ticket = 100;
    //Object obj = new Object();

    @Override
    public void run() {


        while(true){

            synchronized(this){//此时的this：唯一的windows1对象  //方式二：synchronized(obj){
            if(ticket > 0){
                System.out.println(Thread.currentThread().getName() + "票号为：" + ticket);
                ticket--;
            }
            else {
                break;
            }
            }
        }

    }
}



public class ThreadWindowsTest2 {
    public static void main(String[] args) {
        Winsows1 w = new Winsows1();

        Thread w1 = new Thread(w);
        Thread w2 = new Thread(w);
        Thread w3 = new Thread(w);

        w1.setName("线程1");
        w2.setName("线程2");
        w3.setName("线程3");

        w1.start();
        w2.start();
        w3.start();





    }

}
