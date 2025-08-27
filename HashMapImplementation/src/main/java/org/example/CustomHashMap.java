package org.example;

public class CustomHashMap<K, V> {

    private static final int DEFAULT_CAPACITY=20;

    private static final float DEFAULT_LOAD_FACTOR=0.75f;

    private int capacity;
    private float loadFactor;
    private int size;
    private CustomNode<K,V>[] hashTable;

    CustomHashMap(int capacity,float loadFactor){
        this.capacity=capacity;
        this.loadFactor=loadFactor;
        this.hashTable= (CustomNode<K, V>[]) new CustomNode[this.capacity];
    }

    public void put(K key,V value){
        int index = hash(key);
        CustomNode<K,V> node = hashTable[index];
        while(node!=null){
            if(node.key.equals(key)){
                node.value = value;
                return;
            }
            node=node.next;
        }
        CustomNode customNode = new CustomNode<>(key,value);
        customNode.next=hashTable[index];
        hashTable[index]=customNode;
        size++;
        if(size>capacity*loadFactor){
            resize();
        }
    }

    public V get(K key){
        int index = hash(key);
        CustomNode<K,V> node = hashTable[index];
        while(node!=null){
            if(node.key.equals(key)){
                return node.value;
            }
            node= node.next;
        }
        return null;
    }

    public void remove(K key){
        int index = hash(key);
        CustomNode<K,V> node = hashTable[index];
        CustomNode<K,V> prev=null;
        while(node!=null){
            if(node.key.equals(key)){
                if(prev==null){
                    hashTable[index]=node.next;
                }
                else{
                    prev.next=node.next;
                }
                this.size--;
                return;
            }
            prev=node;
            node=node.next;
        }
    }

    private void resize() {
        int newCapacity = capacity*2;
        int tempOldCapacity=this.capacity;
        this.capacity=newCapacity;
        CustomNode<K,V>[] newTable = (CustomNode<K, V>[])new CustomNode[newCapacity];
        for(int i=0;i<tempOldCapacity;i++){
            CustomNode<K,V> node = hashTable[i];
            while(node!=null){
                CustomNode<K,V> tempNode = node.next;
                int index = hash(node.key);
                node.next=newTable[index];
                newTable[index]=node;
                node=tempNode;
            }
        }
        hashTable=newTable;
    }

    private int hash(K key){
        return Math.abs(key.hashCode())%this.capacity;
    }


    public static class CustomNode<K,V> {
        final K key;
        V value;
        CustomNode<K,V> next;

        CustomNode(K key, V value){
            this.key=key;
            this.value=value;
        }

    }

    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
//        return this.size>0 ? false:true;
        return this.size==0;
    }

    public boolean containsKey(K key){
        int index = hash(key);
        CustomNode<K,V> node = hashTable[index];
        while(node!=null){
            if(node.key.equals(key)){
                return true;
            }
            node=node.next;
        }
        return false;
    }
}

