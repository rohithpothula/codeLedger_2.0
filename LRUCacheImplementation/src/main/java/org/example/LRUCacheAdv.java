package org.example;

import java.util.HashMap;
import java.util.LinkedList;

public class LRUCacheAdv {
    int maxSize;
    int currSize;
    HashMap<Integer,CacheNode> value_map;

    CacheNode head;
    CacheNode tail;

    LRUCacheAdv(int maxSize){
        this.maxSize=maxSize;
        this.value_map=new HashMap<>();

        this.head=new CacheNode(-1,-1);
        this.tail=new CacheNode(-1,-1);
        head.next=tail;
        tail.prev=head;
    }

//    TODO this should be implemented in O(1)
    public int get(int key){
        CacheNode node = value_map.get(key);
        if(node==null){
            return -1;
        }

        moveToHead(node);
        return node.value;
    }

//    TODO this should be implemeted in O(1)
    public void put(int key,int value){
        CacheNode node = value_map.get(key);

        if(node!=null){
            node.value=value;
            moveToHead(node);
        }
        else{
            if(this.currSize>=this.maxSize){
                removeLRUAdv();
            }



            CacheNode insertNode = new CacheNode(key,value);
            value_map.put(key,insertNode);

            insertNode.next=head.next;
            insertNode.prev=head;
            insertNode.next.prev=insertNode;
            head.next=insertNode;
            this.currSize++;
        }
    }

    private void moveToHead(CacheNode node) {
        node.prev.next=node.next;
        node.next.prev=node.prev;


        node.prev=null;
        node.next=null;

        node.prev=head;
        node.next=head.next;
        node.next.prev=node;
        head.next=node;
    }

    public void removeLRUAdv(){
        CacheNode lastNode = tail.prev;
        lastNode.prev.next=tail;
        tail.prev=lastNode.prev;
        value_map.remove(lastNode.key);
        this.currSize--;
    }

}
