package day11;


/**
 * 可变个数形参的方法
 *
 * 1，jdk 5.0新增的方法
 * 2，具体使用
 *      2.1，可变个数形参的格式：数据类型 ... 变量名
 *      2.2，当调用可变个数形参的方法时，传入的形参可以是0个，1个，2个。。。
 *      2.3，可变个数形参的方法与本类中的方法名重名，形参不同的方法间构成重载
 *      2.4，可变个数形参的方法与本类中的方法名重名，形参类型也相同的数组之间不构成重载。换句话说，二者不能共存。
 *      2.5，可变个数的形参在方法的形参中，必须声明在末尾
 *      2.6，可变个数的形参在方法的形参中，只能有一个可变形参
 */
public class MethodArgsTest {
    public static void main(String[] args) {

    }

    public void show(int i){

    }

    public void show(String abc){

    }

    public void show(String ... params){

    }

//    2.4
//    public  void show(String[] param){}

    public void show(int i,String... params){

    }

}
