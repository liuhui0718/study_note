package day14.limit;

/**
 * @Author Miracle Liuhui
 * @Date 2022/3/29 下午2:54
 * @Version 1.0
 */
public class Order {
    protected int orderProtected;
    private int orderPrivate;
    int orderDefault;
    public int orderPublic;

    private void methodPrivate(){
        orderPrivate =1;
        orderDefault = 2;
        orderProtected = 3;
        orderPublic = 4;
        System.out.println(orderPrivate);
        System.out.println(orderDefault);
        System.out.println(orderProtected);
        System.out.println(orderPublic);

    }

    void methodDefault(){
        orderPrivate =1;
        orderDefault = 2;
        orderProtected = 3;
        orderPublic = 4;
        System.out.println(orderPrivate);
        System.out.println(orderDefault);
        System.out.println(orderProtected);
        System.out.println(orderPublic);

    }

    protected void methodProtected(){
        orderPrivate =1;
        orderDefault = 2;
        orderProtected = 3;
        orderPublic = 4;
        System.out.println(orderPrivate);
        System.out.println(orderDefault);
        System.out.println(orderProtected);
        System.out.println(orderPublic);

    }

    public void methodPublic(){
        orderPrivate =1;
        orderDefault = 2;
        orderProtected = 3;
        orderPublic = 4;
        System.out.println(orderPrivate);
        System.out.println(orderDefault);
        System.out.println(orderProtected);
        System.out.println(orderPublic);

    }
}
