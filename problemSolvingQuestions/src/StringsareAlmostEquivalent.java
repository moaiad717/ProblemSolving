import java.util.HashMap;
import java.util.Map;

public class StringsareAlmostEquivalent {

    public static void main(String[] args) {
        System.out.println(checkAlmostEquivalent("abcdeef",
                "abaaacc"  ));
    }
    public static boolean checkAlmostEquivalent(String word1, String word2) {

        Map<Character, Integer> w1CharacterIntegerMap = new HashMap<>();
        Map<Character, Integer> w2CharacterIntegerMap = new HashMap<>();

        if (word1.length() - word2.length() >3)
            return false;
        char[] chars1= word1.toCharArray();
        for (int i =0; i< chars1.length; i++){
            Character curr = chars1[i];
            w1CharacterIntegerMap.put(curr,w1CharacterIntegerMap.getOrDefault(curr,0)+1);
        }

        char[] characters = word2.toCharArray();
        for (int j =0; j< characters.length; j++) {

            Character curr = characters[j];
            Integer val = w1CharacterIntegerMap.getOrDefault(curr, 0);
            if (val > 0)
                w1CharacterIntegerMap.put(curr, val - 1);
            else
                w2CharacterIntegerMap.put(curr, w2CharacterIntegerMap.getOrDefault(curr, 0) + 1);
        }

        if (w1CharacterIntegerMap.values().stream().filter(e->e>3 || e < -3).findAny().isPresent())
            return false;
        if (w2CharacterIntegerMap.values().stream().filter(e->e>3 || e < -3).findAny().isPresent())
            return false;

        return true;


    }
}
