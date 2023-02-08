package day28.collection.settest;

import org.junit.Test;

public interface Impl<T> {
    void show(T value);




}


class StringShowImpl implements Impl<String>{
    @Override
    public void show(String value) {
        System.out.println(value);
    }

}

class NumberShowImpl implements Impl<Integer> {
    @Override
    public void show(Integer value) {
        System.out.println(value);
    }



}