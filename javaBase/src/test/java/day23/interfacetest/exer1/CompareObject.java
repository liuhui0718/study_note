package day23.interfacetest.exer1;

/**
 * @Author Miracle Liuhui
 * @Date 2022/4/25 上午11:04
 * @Version 1.0
 */
public interface CompareObject {

    //若返回值是0，代表相等；若为正数，代表当前对象大，负数代表当前对象小
    public int CompareTo(Object object);

}
