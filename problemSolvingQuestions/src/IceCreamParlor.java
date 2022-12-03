import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IceCreamParlor {


    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        // Write your code here
        Map<Integer,Integer> integerMap = new HashMap<>();
        List<Integer> integers = new ArrayList<>();
        for(int i=0; i< arr.size();i++){
            if (integerMap.containsKey(m-arr.get(i))){
                integers.add(integerMap.get(m-arr.get(i)));
                integers.add(i+1);
                break;
            }
            else
                integerMap.put(m-arr.get(i),i+1);
        }

        return integers;
    }


}
