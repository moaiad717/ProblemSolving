import java.util.*;
import java.util.stream.Collectors;

public class KthDistinctStringinanArray {
    public static void main(String[] args) {
        System.out.println(kthDistinct(new String[]{"d","b","c","b","c","a"},2));
    }

    public static String kthDistinct(String[] arr, int k) {
        Map<String,Integer> map= new LinkedHashMap<>();
        for(String s:arr){
            map.put(s,map.getOrDefault(s,0)+1);
        }

        List<String> list = map.entrySet().stream().filter(e->e.getValue()==1).map(e->e.getKey()).collect(Collectors.toList());
        int count =1;
        for(String s: list){
         if (count==k)
             return s;
         count++;
        }
        return "";
    }
}
