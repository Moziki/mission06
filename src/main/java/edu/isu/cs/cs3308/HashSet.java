package edu.isu.cs.cs3308;

import edu.isu.cs.cs3308.structures.Set;

import java.util.Iterator;
import java.util.LinkedList;

public class HashSet<T> implements Set<T>, Iterable<T>{

    public LinkedList<T> list;

    public HashSet() {
        list = new LinkedList<>();
    }
    public HashSet(LinkedList<T> passList) {
        list = passList;
    }
    @Override
    public void add(T e) {
        if (e == null)
        {}
        else if (this.contains(e))
        {}
        else {
            this.list.add(e);
        }
    }

    @Override
    public void remove(T e) {
        if (e == null || !(this.contains(e))){

        }
        else {
            this.list.remove(e);
        }
    }

    @Override
    public boolean contains(T e) {
        if (this.list == null)
            return false;
        else if (this.list.contains(e))
            return true;
        else
            return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new HashSetIterator<>(this);
    }

    @Override
    public boolean isEmpty() {
        if (list == null || list.isEmpty())
            return true;
        else
        return false;
    }

    @Override
    public void addAll(Set<T> s) {
        for (T t : (HashSet<T>) s)
            add(t);
    }

    @Override
    public void retainAll(Set<T> s) {
        for (T t : this) {
            if (s.contains(t)){}
            else this.remove(t);
        }
    }

    @Override
    public void removeAll(Set<T> s) {
        for (T t : (HashSet<T>) s) {
            this.remove(t);
        }
    }
}
