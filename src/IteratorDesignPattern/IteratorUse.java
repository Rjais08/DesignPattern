package IteratorDesignPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class IteratorUse {

    public static void main(String[] args) {
        List<Object> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(5);

        Iterator iterator = new IteratorImpl(arrayList);

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
