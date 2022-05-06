package day13.override;

/**
 * @Author Miracle Liuhui
 * @Date 2022/3/30 下午8:18
 * @Version 1.0
 * <p>
 * 练习：调用方法和属性
 *  1,若子类重写了父类方法,则子类定义的方法彻底覆盖了父类的同名方法，系统无法将父类的方法转移到子类中
 *
 *  2，对于实例变量而言，即使子类定义了与父类完全相同的实例变量，这个变量也不会覆盖父类中d定义的实例变量
 *
 */
public class MethodAndNatureExer {
    public static void main(String[] args) {
        Sub sub = new Sub();
        System.out.println(sub.id);//200
        sub.display();//200

        Base base = sub;
        //==比较的是地址值
        System.out.println(base == sub);//true
        System.out.println(base.id);//100
        base.display();//200
    }


}

class Base {

    int id = 100;
    public void display(){
        System.out.println(this.id);
    }

}

class Sub extends Base{
    int id = 200;

    public void display(){
        System.out.println(this.id);

    }
}
