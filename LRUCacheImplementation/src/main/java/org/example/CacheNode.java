package org.example;

public class CacheNode {
    int key;
    int value;
    CacheNode prev;
    CacheNode next;

    CacheNode(int key,int value){
        this.value=value;
        this.key=key;
    }

    public CacheNode getNext() {
        return next;
    }

    public void setNext(CacheNode next) {
        this.next = next;
    }

    public CacheNode getPrev() {
        return prev;
    }

    public void setPrev(CacheNode prev) {
        this.prev = prev;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
}
