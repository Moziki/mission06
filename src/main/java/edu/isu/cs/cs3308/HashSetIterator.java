package edu.isu.cs.cs3308;

import java.util.LinkedList;
import java.util.Iterator;

public class HashSetIterator<T> implements Iterator{

    private T next;
    private LinkedList<T> s;
    public HashSetIterator(HashSet<T> h) {
         s = h.list;
         next = s.getFirst();
    }

    @Override
    public boolean hasNext() {
        return next != null;
    }

    @Override
    public T next() {
        T value = s.pop();
        if (s.isEmpty()){
            next = null;
        }
        else {
            next = s.getFirst();
        }
        return value;
    }
}
