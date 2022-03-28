package day12.test;

import day12.Order;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.orderPublic = 1;




        //出了Order类所属的包之后，私有的结构（private）缺省的结构就不可以用了
//        order.orderDefault = 2;
//        order.orderPrivate =3;


        order.methodPublic();


        //出了Order类所属的包之后，私有的结构（private）、缺省的结构就不可以用了
//        order.methodDefault();
//        order.methodPrivate();
    }
}
