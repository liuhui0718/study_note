package day28.collection.settest;

import org.junit.Test;

public class ImplTest {

    @Test
    public void test01() {
        Impl<String> o = new StringShowImpl();
        o.show("wanglihong");
        Impl<Integer> d = new NumberShowImpl();


    }
}
