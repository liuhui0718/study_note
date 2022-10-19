package day25.errortest;

import org.junit.Test;

/**
 * 关于异常对象的产生：
 *      1，系统自动生成的异常对象
 *      2，手动的生成一个异常对象，并抛出（throw）
 */

public class ErrorExer1 {

    public static void main(String[] args) {

//        Student s = new Student();
//        s.regist(-1001);
//        System.out.println(s);

        try {
            Student s = new Student();
            s.test02(-1002);
            System.out.println(s);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


}

class  Student{
    private int id;


    public void regist(int id){

        if (id >0){
            this.id = id;
        }else{
            throw new RuntimeException("输入参数不合法！！");
        }
    }

    public void test02(int id) throws Exception {
        if (id > 0) {
            this.id = id;
        }else{
            //throw new Exception("输入参数不合法！！");
            throw new MyException("不能输入负数");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
