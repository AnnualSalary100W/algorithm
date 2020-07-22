package handwritten.ByteDance;


import sun.misc.LRUCache;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRU146 {
    class LRUCache extends  LinkedHashMap<Integer,Integer>{
        private int capacity;

        public  LRUCache(int capacity){
            super(capacity,0.75F,true);
            this.capacity=capacity;
        }

        public int get(int key){
            return super.getOrDefault(key,-1);
        }

        public void put(int key,int vaule){
            super.put(key,vaule);
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
            return size() > capacity;
        }






    }
}
