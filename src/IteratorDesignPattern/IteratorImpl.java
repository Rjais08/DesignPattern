package IteratorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class IteratorImpl implements Iterator{

    int length = 0;
    List<Object> list = new ArrayList<>();

    public IteratorImpl(List<Object> list){
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return list.size()>length;
    }

    @Override
    public Object next() {
        if(length< list.size()){
            return list.get(length++);
        }
        return null;
    }
}
