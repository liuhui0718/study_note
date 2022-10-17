package day26.threadtest;

/**
 * 创建三个窗口，总票数为100张
 *
 *
 * 存在线程安全问题，待解决
 */

class Windows extends Thread{
    private static int ticket = 100;

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
        while (true){
            if (ticket > 0){
                System.out.println(Thread.currentThread().getName()+ "买票：票号为：" + ticket);
                ticket--;
            }else{
                break;
            }
        }
    }
}

public class ThreadWindowsTest1 {

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
