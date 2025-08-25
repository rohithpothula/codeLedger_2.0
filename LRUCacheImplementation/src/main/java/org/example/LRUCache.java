package org.example;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class LRUCache {
    int maxSize;
    int currSize;
    Map<Object,Long> cache;

    LRUCache(int maxSize){
        this.maxSize=maxSize;
        this.currSize=0;
        this.cache=new LinkedHashMap<>();
    }

    public Object get(Object key){
        Long timestamp = cache.get(key);
        if(timestamp==null){
            return null;
        }
        cache.put(key,System.currentTimeMillis());
        return key;
    }

    public void put(Object key){
        if(currSize==maxSize){
            removeLRU();
        }
        cache.put(key,System.currentTimeMillis());
        currSize++;
    }

    private void removeLRU() {
        Object lru = null;
        long minTimeStamp = Integer.MAX_VALUE;
        for(Map.Entry<Object,Long> cache_entry: cache.entrySet()){
            if(cache_entry.getValue()<minTimeStamp){
                lru=cache_entry.getKey();
                minTimeStamp=cache_entry.getValue();
            }
        }
        cache.remove(lru);
        currSize--;
    }
}
