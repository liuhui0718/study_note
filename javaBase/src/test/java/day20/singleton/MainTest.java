package day20.singleton;

/**
 * @Author Miracle Liuhui
 * @Date 2022/4/2 上午10:54
 * @Version 1.0
 *
 * main()方法的使用说明
 *      1，main作为程序的入口
 *      2，main也是一个普通的静态方法
 *      //3，main（）方法可以作为我们与控制台的交互方式  （之前使用scanner）
 */
public class MainTest {

    public static void main(String[] args) {

        String[] str = new String[]{"12","34"};
        Main.main(str);
        show();//show()为静态可以直接调用，否则需要创建对象去调用

    }

    public static void show(){

    }
}

class Main{
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            args[i] = "args_"+i;
            System.out.println(args[i]);

        }
    }
}
