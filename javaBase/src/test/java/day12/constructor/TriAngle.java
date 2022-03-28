package day12.constructor;

public class TriAngle {
    public static void main(String[] args) {

        TriAngleTest triAngleTest1 = new TriAngleTest();

        triAngleTest1.setBase(2);
        triAngleTest1.setHeight(6);
        System.out.println(triAngleTest1.getBase()+"===" + triAngleTest1.getHeight());


        TriAngleTest triAngleTest = new TriAngleTest(12,4);
        System.out.println(triAngleTest.getBase()+"===" + triAngleTest.getHeight());
    }
}
