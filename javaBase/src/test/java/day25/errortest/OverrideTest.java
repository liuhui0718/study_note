package day25.errortest;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 方法重写规则之一：
 * 子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型
 *
 */

public class OverrideTest {

    public static void main(String[] args) {
        OverrideTest o = new OverrideTest();
        o.disPlay(new SubClass());

    }

    public void disPlay(SuperClass s){
        try {
            s.method1();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }


}

class  SuperClass{

    public void disPlay(SuperClass s){
        try {
            s.method1();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void method1() throws IOException{

    }
}

class SubClass extends SuperClass{

    @Override
    public void method1() throws FileNotFoundException {
        method1();
    }
}
