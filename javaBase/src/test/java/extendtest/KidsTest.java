package extendtest;

/**
 * @Author Miracle Liuhui
 * @Date 2022/3/28 下午9:30
 * @Version 1.0
 */
public class KidsTest {
    public static void main(String[] args) {
        Kids kids = new Kids(14);
        kids.printAge();


        kids.setSex(1);
        kids.manOrWoman();

        kids.setSalary(0);
        kids.employeed();

        System.out.println("==========");


        ManKind manKind = new ManKind(0,3);
        manKind.manOrWoman();
        manKind.employeed();
    }
}
