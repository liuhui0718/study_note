package day23.interfacetest;

/**
 * @Author Miracle Liuhui
 * @Date 2022/4/17 下午4:27
 * @Version 1.0
 * <p>
 * 接口的使用
 * 1，接口使用上也满足多态性
 * 2,接口，实际上就是定义了一种规范
 * 3，开发中，体会面向接口编程
 */
public class USBTest {
    public static void main(String[] args) {
        Computer computer = new Computer();

        //创建了接口的非匿名实现类，非匿名对象
        Flash flash = new Flash();
        computer.transferData(flash);//Usb usb = new Flash()

        //创建了接口的非匿名实现类，匿名对象
        computer.transferData(new Printer());

        //创建了接口的匿名实现类，非匿名对象
        Usb phone = new Usb() {
            public void start() {
                System.out.println("手机开始工作");

            }

            public void stop() {
                System.out.println("手机停止工作");
            }

        };
        computer.transferData(phone);

        //创建了接口的匿名实现类，非匿名对象
        computer.transferData(new Usb() {
            public void start() {
                System.out.println("mp3开始工作");
            }

            public void stop() {
                System.out.println("mp3停止工作");

            }
        });


    }

}

class Computer {
    public void transferData(Usb usb) {
        usb.start();
        System.out.println("具体的传输细节");
        usb.stop();
    }
}

interface Usb {
    //常量：定义尺寸，传输速率
    void start();

    void stop();
}

class Flash implements Usb {

    public void start() {
        System.out.println("u盘开始工作");
    }

    public void stop() {
        System.out.println("u盘拔出");

    }
}

class Printer implements Usb {
    public void start() {
        System.out.println("打印机开始工作");
    }

    public void stop() {
        System.out.println("打印机停止工作");

    }

}
