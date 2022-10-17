package day26.threadtest;

/**
 * 创建三个窗口卖票，总共100张票，使用实现Runnable接口的方式
 *
 * 存在线程安全问题，待解决
 *
 *
 *
 */


class Winsows1 implements Runnable{
    private int ticket = 100;

    @Override
    public void run() {

        while(true){
            if(ticket > 0){
                System.out.println(Thread.currentThread().getName() + "票号为：" + ticket);
                ticket--;
            }
            else{
                break;
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
