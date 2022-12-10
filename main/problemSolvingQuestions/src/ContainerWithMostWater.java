import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class ContainerWithMostWater {
    /**
     * https://leetcode.com/problems/container-with-most-water/
     */

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
    public static int maxArea(int[] height) {
        TreeMap<Integer,Integer> map = new TreeMap(Comparator.reverseOrder());
        for (Integer integer : height){
           if (map.containsKey(integer))
               map.put(integer, map.get(integer)+1);
        else map.put(integer,1);
        }

        if (map.firstEntry().getValue()>1)
            return map.firstKey()*map.firstKey();
        else{
            int first = map.firstKey();
            map.remove(map.firstKey());
            return first * map.firstKey();
        }
    }
}
