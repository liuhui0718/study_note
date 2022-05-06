package day14.limit;

/**
 * @Author Miracle Liuhui
 * @Date 2022/3/29 下午3:05
 * @Version 1.0
 *
 *
 */
public class OrderTest {
    public static void main(String[] args) {
        //在不同类中，不能调用private权限的属性和方法
        Order order = new Order();
        order.orderPublic = 44;
        order.orderProtected = 33;
        order.orderDefault = 22;

        order.methodDefault();
        order.methodProtected();
        order.methodPublic();

        System.out.println(order.orderPublic);
    }

    public  void method(){
    }
}
