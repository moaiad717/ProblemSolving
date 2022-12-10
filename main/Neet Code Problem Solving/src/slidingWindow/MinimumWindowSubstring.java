package slidingWindow;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/minimum-window-substring/
 */

public class MinimumWindowSubstring {

//    public static void main(String[] args) {
//        minWindow("s","|d");
//    }
//    public static String minWindow(String s, String t) {
//        if (t==null || t.isEmpty()){
//            return "";
//        }
//
//        Map<Character, Integer> sCounts = new HashMap<>();
//        Map<Character, Integer> tCounts = new HashMap<>();
//
//        //init tCount Map.
//        for (char c : t.toCharArray()){
//            tCounts.put(c,1 + tCounts.getOrDefault(c,0));
//        }
//
//        int need = tCounts.size();
//        int have = 0;
//        int [] res = {-1,-1};
//        int resLength = Integer.MAX_VALUE;
//        int left= 0;
//
//        for (int i =0; i< s.length(); i++){
//            char curr = s.charAt(i);
//            sCounts.put(curr, 1+ sCounts.getOrDefault(curr,0));
//
//            if (tCounts.containsKey(curr) && sCounts.get(curr)== tCounts.get(curr)){
//                have+=1;
//            }
//
//            while (have==need){
//                if ((i - left +1) <resLength){
//                    res [0] = left;
//                    res [1] = i;
//                    resLength = (i - left +1);
//                }
//                sCounts.put(curr,  sCounts.getOrDefault(curr,0)-1);
//            }
//        }
//
//
//
//        return "";
//    }
}
