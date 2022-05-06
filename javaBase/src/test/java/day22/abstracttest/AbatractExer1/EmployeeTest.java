package day22.abstracttest.AbatractExer1;

/**
 * @Author Miracle Liuhui
 * @Date 2022/4/15 下午5:15
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {

        Manager manager = new Manager(1000);
        manager.work();

        CommonEmployee commonEmployee = new CommonEmployee();
        commonEmployee.work();

        Employee ma = new Manager("tom",1000,9000,89999);
        ma.work();

    }
}
