package hamzaQuest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindLongestSlot {


    public static void main(String[] args) {
        List<List<Integer>> aa= new ArrayList<>();

        aa.add(List.of(0,3));
        aa.add(List.of(20,5));
        aa.add(List.of(2,6));
        aa.add(List.of(15,7));
        aa.add(List.of(9,8));
        aa.add(List.of(19,9));
        aa.add(List.of(24,10));
        aa.add(List.of(4,12));
        aa.add(List.of(3,13));
//        aa.add(List.of(0,3));
//        aa.add(List.of(2,5));
//        aa.add(List.of(0,9));
//        aa.add(List.of(1,15));
//        aa.add(List.of(0,3));
        System.out.println(findLongestSlot(aa));
    }
    public static char findLongestSlot(List<List<Integer>> slot){
        Map<Integer, Integer> mySolots = new HashMap<>();
        int curr =0;
        int slotVal=0;
        for (List<Integer> list : slot ) {
            slotVal=list.get(1) - curr;
            if (mySolots.containsKey(list.get(0))){
                if (slotVal> mySolots.get(list.get(0)))
                     mySolots.put(list.get(0), slotVal);
            }
            else
                mySolots.put(list.get(0), slotVal);
            curr = list.get(1);
        }

        int ans =  mySolots.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
        ans = ans +97;
        return (char) ans;
    }

    public int countBinarySubstrings(String s) {
        // only update res when current position is last char or current char not the same as next char
        // e.g. 00111, update res at 2nd 0 and 3rd 1. at 2nd 0, prvCount is 0, therefore res += 0
        // at 3rd 1, prvCount is 2, curCount is 3, res += 2
        // once res updated, assign curCount to prvCount, then reset curCount
        int prvCount = 0, curCount = 0, res = 0;
        for (int i = 0; i < s.length(); i++) {
            curCount ++;
            if (i == s.length()-1 || s.charAt(i) != s.charAt(i+1)) {
                res += Math.min(prvCount, curCount);
                prvCount = curCount;
                curCount = 0;
            }
        }
        return res;
    }
}
