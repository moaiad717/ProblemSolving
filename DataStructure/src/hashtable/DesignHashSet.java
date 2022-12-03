package hashtable;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DesignHashSet {
    public static void main(String[] args) {

        DesignHashSet designHashSet = new DesignHashSet();
        designHashSet.add(3);

    }


    private int MAX_CAPACITY = 100;
    private List<List<Integer>> parentList;

    public DesignHashSet() {
        parentList = new ArrayList<>(MAX_CAPACITY);
        for (int i = 0; i< 100; i++){
            parentList.add(null);
        }
    }

    public void add(int key) {
        int index = hash(key);
        if (parentList.get(index)!=null){
            List<Integer> bucket= parentList.get(index);
            if (!bucket.contains(key)){
                bucket.add(key);
            }
        }else{
            List<Integer> bucket = new LinkedList<>();
            bucket.add(key);
            parentList.set(index,bucket);
        }
    }

    public void remove(int key) {
        int index = hash(key);
        List<Integer> bucket = parentList.get(index);

        if (bucket!=null){
            bucket.remove(Integer.valueOf(key));
        }

    }

    public boolean contains(int key) {
        int index = hash(key);
        List<Integer> bucket = parentList.get(index);
        return bucket !=null ? bucket.contains(key): false;
    }

    private int hash(int value){
        return value % MAX_CAPACITY;
    }
}
