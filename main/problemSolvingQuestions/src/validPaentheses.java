import java.util.*;

/**
 *  https://leetcode.com/problems/valid-parentheses/
 */

public class validPaentheses {

    public static void main(String[] args) {
     boolean isV= isValid("(([]){})");
     boolean isV2= isValid("()[]{}");
     //"(([]){})"
        System.out.println(isV);
    }

    public static boolean isValid(String s) {
        Map<Character,Character> openClose = Map.ofEntries(Map.entry('(',')'),Map.entry('{','}'),Map.entry('[',']'));
        Stack<Character> opens = new Stack<>();

        if (s.length()%2 !=0)
            return false;

        for (char c : s.toCharArray()){
            if (openClose.containsKey(c)){
                opens.push(c);
            } else if (opens.isEmpty()){
                return false;
            }else if (c!= openClose.get(opens.pop()))
                return false;
        }
       return opens.isEmpty();
    }
}
