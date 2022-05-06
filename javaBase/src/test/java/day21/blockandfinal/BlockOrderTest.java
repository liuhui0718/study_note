package day21.blockandfinal;

/**
 * @Author Miracle Liuhui
 * @Date 2022/4/2 下午4:29
 * @Version 1.0
 *
 * 对属性赋值的位置
 *     1，默认初始化
 *     2，显示初始化/5，在代码块中赋值    //看谁在前面声明
 *     3，构造器中初始化
 *     4，有了对象之后，可以通过对象.方法、对象.属性的方式进行赋值
 *
 *
 */
public class BlockOrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.id);

        Account account = new Account();
        System.out.println(account.name);
    }




}

class Order{
    int id = 1001;
     {
        id = 888;
    }
}


class Account{

    {
        name = "刘亦菲";
    }
    String name = "王力宏";
}


