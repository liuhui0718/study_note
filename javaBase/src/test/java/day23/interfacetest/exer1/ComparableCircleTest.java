package day23.interfacetest.exer1;

/**
 * @Author Miracle Liuhui
 * @Date 2022/4/25 下午7:00
 * @Version 1.0
 */
public class ComparableCircleTest {
    public static void main(String[] args) {
        CompareCircle c1 = new CompareCircle(2.9);
        CompareCircle c2 = new CompareCircle(2.5);

        int compareValue = c1.CompareTo(c2);
        if (compareValue  > 0){
            System.out.println("c1比c2大");
        }else if (compareValue < 0){
            System.out.println("c1比c2小");
        }else{
            System.out.println("c1与c2一样大");
        }
    }
}
