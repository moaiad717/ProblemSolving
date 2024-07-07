package arrays;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> results = new ArrayList<>();
        Set<Integer> skip = new HashSet<>();
        for (int i=0; i< strs.length; i++){
            if (!skip.contains(i)) {
                List<String> list = new ArrayList<>();
                String curr= strs[i];
                list.add(curr);
                for (int j=i+1; j< strs.length; j++){
                    if(isAnagram(curr, strs[j])){
                        list.add(strs[j]);
                        skip.add(j);
                    }
                }

                results.add(list);
            }
        }
        return results;

    }

    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
            return false;


        int[] charArr = new int[26];

        for (int i =0; i <s.length(); i++){
            charArr[s.charAt(i) - 'a']++;
            charArr[t.charAt(i) - 'a']--;
        }

        for (int i = 0;i< charArr.length; i++){
            if (charArr[i] != 0)
                return false;
        }
        return true;
    }

    /**
     *
     * Another Solution
     */

    public List<List<String>> groupAnagrams2(String[] strs) {
        List<List<String>> result = new ArrayList();

        Map<String, List<String>> map=Arrays.stream(strs).parallel().collect(Collectors.groupingBy(e-> {
             char[] chars = e.toCharArray();
             Arrays.sort(chars);
            String sortedString = new String(chars);
             return sortedString;
         }));
        for (List<String> list:map.values()){
            result.add(list);
        }

        for(String s : strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sortedString = new String(arr);
            if(map.containsKey(sortedString)){
                map.get(sortedString).add(s);
            }else{
                List<String> list = new ArrayList();
                result.add(list);
                list.add(s);
                map.put(sortedString, list);
            }
        }
        return result;
    }
}
