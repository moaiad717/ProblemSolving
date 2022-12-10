import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CombinationSum {


    public static void main(String[] args) {
            for (List<Integer> list : combinationSum(new int[]{2,3,6,7},7)){
                System.out.println(list);
            }
    }
//    static  List<List<Integer>> answer = new ArrayList<>();
    private static void construct(int idx, int [] arr, int target, List<Integer> temp, List<List<Integer>> answer){
        if (idx== arr.length ){
            if(target == 0)
                answer.add(new ArrayList<>(temp));
            return;
        }
        if (arr[idx]<=target){
            temp.add(arr[idx]);
            construct(idx,arr,target-arr[idx], temp,answer);
            temp.remove(temp.size()-1);
        }

        construct(idx+1,arr,target, temp,answer);
    }
    public static   List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        construct(0,candidates,target,new ArrayList<>(),answer);
        return answer;
    }
}
