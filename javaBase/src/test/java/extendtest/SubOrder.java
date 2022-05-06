package extendtest;

import day14.limit.Order;

/**
 * @Author Miracle Liuhui
 * @Date 2022/3/29 下午3:36
 * @Version 1.0
 */
public class SubOrder extends Order{
    public static void main(String[] args) {
        Order order = new Order();
        //order.orderProtected = 2;


    }

    public void method(){

        //不同包的子类，不能调用private与缺省修饰的属性和方法
        orderProtected = 666;
        orderPublic = 888;
        methodProtected();
        methodPublic();

    }
}
