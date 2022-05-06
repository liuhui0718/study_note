package day16.polymorphism.polymorphismexertest2;

/**
 * @Author Miracle Liuhui
 * @Date 2022/3/31 上午11:45
 * @Version 1.0
 */
public class GeometricObject {//几何形状

    protected  String color;
    protected double weight;

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public double findArea(){
        return 0.0;
    }
}
