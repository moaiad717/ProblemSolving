package slidingWindow;

import java.util.*;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class LongestSubstringWithoutRepeating {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty())
            return 0;
        if (s.isBlank())
            return 1;
        int max=0;
        for (int i=0; i<s.length();i++){
            Set<Character> characters = new HashSet<>();
            characters.add(s.charAt(i));
            for (int j=i;j<s.length();j++){
                char charVal = s.charAt(j);
                if (!characters.contains(charVal)){
                    characters.add(charVal);
                }else
                break;
            }
           max = Math.max(characters.size(),max);
        }
        return max;
    }

}

