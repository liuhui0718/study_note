package day16.polymorphism.polymorphismexertest2;

/**
 * @Author Miracle Liuhui
 * @Date 2022/3/31 上午11:54
 * @Version 1.0
 */
public class MyRectangle extends GeometricObject{

    protected double weight;
    protected double height;

    public MyRectangle(String color, double weight, double weight1, double height) {
        super(color, weight);
        this.weight = weight1;
        this.height = height;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double findArea(){
        return weight*height;

    }
}
