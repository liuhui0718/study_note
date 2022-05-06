package day23.interfacetest.exer1;

/**
 * @Author Miracle Liuhui
 * @Date 2022/4/25 上午11:10
 * @Version 1.0
 */
public class CompareCircle extends Circle implements CompareObject {

    public CompareCircle(double redius){
        super(redius);
    }

    public int CompareTo(Object object) {

        if (this == object) {
            return 0;
        }
        if (object instanceof CompareObject) {

            CompareCircle compareCircle = (CompareCircle) object;
            //错误的
            //return (int) (this.getRedius() - compareCircle.getRedius());


            //正确的
            if (this.getRedius() > compareCircle.getRedius()) {
                return 1;
            }
            if (this.getRedius() < compareCircle.getRedius()) {
                return -1;
            }
            else {
                return 0;
            }

        } else {
            throw new RuntimeException("传入的数据类型不匹配");
        }
    }
}