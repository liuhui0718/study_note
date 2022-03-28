package day12;

public class OrderTest {
    public static void main(String[] args) {

        Order order = new Order();
        order.orderPublic = 1;
        order.orderDefault = 2;

        //出了Order类所属的类之后，私有的结构（private）声明的结构就不可以用了
//        order.orderPrivate =3;

        order.methodDefault();
        order.methodPublic();


        //出了Order类所属的类之后，私有的结构（private）声明的结构就不可以用了
//        order.methodPrivate();

    }



}
