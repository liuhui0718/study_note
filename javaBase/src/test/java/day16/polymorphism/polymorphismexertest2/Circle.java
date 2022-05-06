package day16.polymorphism.polymorphismexertest2;

/**
 * @Author Miracle Liuhui
 * @Date 2022/3/31 上午11:50
 * @Version 1.0
 */
public class Circle extends GeometricObject{

    protected double radius;


    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double findArea(){
        return  3.14 * radius * radius;//圆的面积
    }
}
