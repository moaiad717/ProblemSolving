package Memoization;

import java.util.HashMap;
import java.util.Map;

public class GridTraveler {

    public static void main(String[] args) {
        System.out.println("-------------With Memoization - Run---------------");
        System.out.println(System.currentTimeMillis());
        System.out.println(gridTravelerMemoization(18,18));
        System.out.println(System.currentTimeMillis());

        System.out.println("-------------NO Memoization - Run---------------");
        System.out.println(System.currentTimeMillis());
        System.out.println(gridTraveler(18,18));
        System.out.println(System.currentTimeMillis());    }


    public static  long gridTraveler (int m, int x){
        if (m==1 && x==1)
            return 1;
        if (m==0 || x==0)
            return 0;
        return gridTraveler(m-1, x) + gridTraveler(m, x-1);
    }

    static Map<String,Long> map = new HashMap<>();
    public static  long gridTravelerMemoization (int m, int x){
        String s= m+","+x;
        if (map.containsKey(s))
            return map.get(s);
        if (m==1 && x==1)
            return 1;
        if (m==0 || x==0)
            return 0;

        map.put(s, gridTravelerMemoization(m-1, x) + gridTravelerMemoization(m, x-1));
        return map.get(s);
    }
}