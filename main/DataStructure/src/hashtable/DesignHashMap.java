package hashtable;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class DesignHashMap {

    private int MAX_CAPACITY = 100;
    private List<List<Entry>> parentList;



    public DesignHashMap() {
        parentList = new ArrayList<>(MAX_CAPACITY);
        for (int i = 0; i< 100; i++){
            parentList.add(null);
        }
    }

    public void put(int key , int value) {
        int index = hash(key);
        Entry entry = new Entry(key,value);

        List<Entry> bucket = parentList.get(index);
        if (bucket != null){
             int itemIndex = bucket.indexOf(entry);
            if (itemIndex<0){
                bucket.add(entry);
            } else
                bucket.set(itemIndex, entry);
        }else{
            bucket = new LinkedList<>();
            bucket.add(entry);
            parentList.set(index,bucket);
        }
    }

    public void remove(int key) {
        int index = hash(key);
        List<Entry> bucket = parentList.get(index);
        if (bucket!=null){
            Entry entry = new Entry(key,0);
            if (bucket.contains(entry)){
                bucket.remove(entry);
            }
        }

    }

    public int get(int key) {
        int index = hash(key);
        List<Entry> bucket = parentList.get(index);
        if (bucket==null)
            return -1;
        for (Entry e : bucket){
            if (e.key == key)
                return e.val;
        }

        return -1;
    }

    private int hash(int value){
        return value % MAX_CAPACITY;
    }


    static private class Entry{
        public Entry(int key, int val) {
            this.key = key;
            this.val = val;
        }

        int key;
        int val;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Entry entry = (Entry) o;
            return key == entry.key;
        }

        @Override
        public int hashCode() {
            return Objects.hash(key, val);
        }
    }
}
