package day19.statictest;

/**
 * @Author Miracle Liuhui
 * @Date 2022/4/1 下午7:11
 * @Version 1.0
 */
public class StsticExer {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();

        System.out.println("id的值为：" + c1.getId());
        System.out.println("id的值为：" + c2.getId());


        System.out.println(c1.getTotal());
        System.out.println("创建圆的个数为：" + Circle.getTotal());

        Circle c3 = new Circle(2);
        c3.findArea();
        System.out.println(c3.getId());
        System.out.println(c3.getTotal());

    }
}

class Circle{
    private double redius;
    private int id;//圆的编号

    private static int total;//计算创建了多少个圆

    private static int init = 1001;//圆的默认编号，被所有的对象所共享


    public Circle(){
        id = init++;
        total++;//每创建一个圆的对象就+1
    }

    public Circle(double redius){
        this();
        this.redius = redius;
    }

    public double getRedius() {
        return redius;
    }

    public void setRedius(double redius) {
        this.redius = redius;
    }

    public int getId() {
        return id;
    }

    public static int getTotal() {
        return total;
    }

    public double findArea(){
        return 3.14*redius*redius;
    }
}
