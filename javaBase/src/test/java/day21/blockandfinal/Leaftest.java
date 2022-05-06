package day21.blockandfinal;

/**
 * @Author Miracle Liuhui
 * @Date 2022/4/2 下午4:05
 * @Version 1.0
 *
 * //总结，由父及子，静态先行
 */
public class Leaftest {
    public static void main(String[] args) {
        new Leaf();
    }
}

class Root{
    static {
        System.out.println("Root的静态代码块");
    }
    {
        System.out.println("Root的非静态代码块");
    }

    public Root(){
        System.out.println("Root的无参构造器");

    }
}

class Mid extends Root{
    static {
        System.out.println("Mid的静态代码块");
    }
    {
        System.out.println("Mid的非静态代码块");
    }
    public Mid(){
        System.out.println("Mid的无参构造器");

    }

    public Mid(String msg){
        this();
        System.out.println("Midd的带参构造器，其参数为：" + msg);

    }
}

class Leaf extends Mid{
    static {
        System.out.println("Leaf的静态代码块");
    }
    {
        System.out.println("Leaf的非静态代码块");
    }

    public Leaf(){
        super("尚硅谷");
        System.out.println("Leaf的构造器");
    }
}
