package day14.limit;

/**
 * @Author Miracle Liuhui
 * @Date 2022/4/15 下午5:33
 * @Version 1.0
 */
public class PrivateTest extends Order {
    public static void main(String[] args) {
        Order order = new Order();
        order.methodPublic();
        order.methodProtected();
        order.methodDefault();
    }

}
