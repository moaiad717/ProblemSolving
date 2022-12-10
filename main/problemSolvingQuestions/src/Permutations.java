import java.util.*;

/**
 * https://leetcode.com/problems/permutations/
 */
public class Permutations {

    public static void main(String[] args) {

        Permutations permutations = new Permutations();
        String val = "abc";
        List<List<Character>> permute = permutations.permute(val.toCharArray());
        permute.forEach(e-> {
            System.out.print("{");
            e.forEach(System.out::print);
            System.out.print("}");
            System.out.println();
        });

    }


    public List<List<Character>> permute(char[] nums) {
        List<List<Character>> list = new ArrayList<>();
        // Arrays.sort(nums); // not necessary
        backtrack(list, new ArrayList<>(), nums);
        return list;
    }

    private void backtrack(List<List<Character>> list, List<Character> tempList, char [] nums){

        if(tempList.size() == nums.length){
            list.add(new ArrayList<>(tempList));
        } else{
            for(int i = 0; i < nums.length; i++){
                if(tempList.contains(nums[i])) continue; // element already exists, skip
                tempList.add(nums[i]);
                backtrack(list, tempList, nums);
                tempList.remove(tempList.size() - 1);

            }
        }
    }


//    public List<List<Integer>> permute(int[] nums) {
//        List<List<Integer>> list = new ArrayList<>();
//        // Arrays.sort(nums); // not necessary
//        backtrack(list, new ArrayList<>(), nums);
//        return list;
//    }
//
//    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums){
//        if(tempList.size() == nums.length){
//            list.add(new ArrayList<>(tempList));
//        } else{
//            for(int i = 0; i < nums.length; i++){
//                if(tempList.contains(nums[i])) continue; // element already exists, skip
//                tempList.add(nums[i]);
//                backtrack(list, tempList, nums);
//                tempList.remove(tempList.size() - 1);
//            }
//        }
//    }

}
