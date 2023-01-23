package HW_12122022;

import java.util.ArrayList;
import java.util.List;

public class MyQueueImpl implements MyQueue{
// Collection
    List<String> list = new ArrayList<>();

    @Override
    public void add(Object el) {
       list.add("Nikolay");
       list.add("Sergey");
       list.add("Dmitriy");
       list.add("Slawa");
       list.add("Stas");
     }

    @Override
    public void remove(Object el) {
        list.remove(3);
    }

    @Override
    public void isEmpty(Object el) {
        list.isEmpty();
    }
}

