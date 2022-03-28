package day11;


/**
 *理解变量的赋值
 *
 * 1，如果变量是基本数据类型，此时赋值是变量所保存的数据值
 * 2，如果变量是引用数据类型，此时赋值的是变量所保存的数据的地址值
 *
 */
public class ValueTransferTest {
    public static void main(String[] args) {

        System.out.println("******************基本数据类型*****************");
        int m = 10;
        int n = m;
        System.out.println("m=" + m + " n = " + n);


        System.out.println("******************引用数据类型*****************");

        Order order = new Order();
        order.orderId = 1001;

        Order o = order;

        System.out.println("order.orderId=" + order.orderId + " o.orderId = " + o.orderId);

        o.orderId = 1002;
        System.out.println("order.orderId=" + order.orderId + " o.orderId = " + o.orderId);




    }

}

class Order {
    int orderId;
}