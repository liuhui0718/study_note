package day09;


/*

方法的声明

权限修饰符  返回值类型 方法名（形参列表）{
    方法体
}

static 、 final 、abstract来修饰方法

2，关于权限修饰符：
    2.1java的4种权限修饰符：private、public、缺省、protect

    2.2 返回值类型：有返回值vs无返回值

    


public void eat(){}

public void  name(String name){}

public String langeage(){}

public  String walk(int number){}






 */




public class CustomerTest {


}

class Customer {


    //属性
    String speak;
    int age;
    boolean isMale;

    public void eat(){
        System.out.println("今天吃鱼");

    }

    public void  name(String name){
        System.out.println("他的名字叫"+name);

    }
    public String langeage(){
        return speak;
    }

    public  String walk(int number){
        String foot = "今天走了" + number;
        return foot;

    }

}
