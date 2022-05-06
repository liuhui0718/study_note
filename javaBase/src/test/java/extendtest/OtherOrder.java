package extendtest;

import day14.limit.Order;

/**
 * @Author Miracle Liuhui
 * @Date 2022/3/29 下午3:50
 * @Version 1.0
 */
public class OtherOrder {
    public static void main(String[] args) {
        //不同包的普通类（非子类）要使用order类，不可以调用声明为private、缺省、protected
        Order order = new Order();
        order.orderPublic = 44;
        order.methodPublic();
    }
}
