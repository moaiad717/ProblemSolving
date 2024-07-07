import java.util.*;

public class Test {

    public static void main(String[] args) {

        int[] ints = new Test().topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
        for (int i : ints)
            System.out.println(i);

        StringBuilder db = new StringBuilder ();
        Map<String, String> sb = new HashMap<>();
        sb.put("s",null);
        sb.put("m","Moaiad");

        db.append(sb.get("s"));
        db.append(sb.get("m"));

        System.out.println(db);
    }

    public int[] topKFrequent(int[] nums, int k) {

        if (nums.length < k)
            return new int[]{0};

        Map<Integer, Integer> intMap = new HashMap<>();
        PriorityQueue<Map.Entry<Integer,Integer>> sorted = new PriorityQueue<>((e , z) -> z.getValue()-e.getValue());
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((e , x) -> x.getValue()- e.getValue());

        for (int curr: nums){
            intMap.put(curr,intMap.getOrDefault(curr,0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: intMap.entrySet() ) {
            sorted.add(entry);
        }

        int result[] = new int[k];
        for (int i=0; i<k; i++){
            if(sorted.peek()==null)
                break;
            else
                result[i]= sorted.poll().getKey();
        }

        return result;
    }
}
