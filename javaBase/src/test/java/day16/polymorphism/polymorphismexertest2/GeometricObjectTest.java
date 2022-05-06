package day16.polymorphism.polymorphismexertest2;

/**
 * @Author Miracle Liuhui
 * @Date 2022/3/31 上午11:57
 * @Version 1.0
 */
public class GeometricObjectTest {
    public static void main(String[] args) {


        GeometricObjectTest g = new GeometricObjectTest();

        Circle c1 = new Circle("yellow",1,3.3);
        g.displayGeometricObject(c1);
        Circle c2 = new Circle("yellow",1,2.3);
        g.displayGeometricObject(c2);

        System.out.println(g.areaEqual(c1,c2));



    }




    //显示对象面积
    public void displayGeometricObject(GeometricObject g){
        System.out.println(g.findArea());
    }




    //测试两个对象的面积是否相等
    public boolean areaEqual(GeometricObject g1,GeometricObject g2){
        return g1.findArea() == g2.findArea();
    }
}
