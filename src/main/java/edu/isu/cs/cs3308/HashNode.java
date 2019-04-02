package edu.isu.cs.cs3308;

public class HashNode<K,V> {

    private HashNode<K, V> next;
    private K key;
    private V value;

    public HashNode(){

    }
    public HashNode(K k, V v) {
        this.key = k;
        this.setValue(v);
    }
    public K getKey() {
        return key;
    }

    public void setValue (V value) {
        this.value = value;
    }

    public V getValue () {
        return value;
    }
    public void setNext(HashNode<K, V> n) {
        this.next = n;
    }

    public HashNode<K, V> getNext() {
        return next;
    }
}
