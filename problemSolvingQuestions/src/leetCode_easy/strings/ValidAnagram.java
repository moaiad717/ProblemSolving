package leetCode_easy.strings;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/882/
 */
public class ValidAnagram {

    public static void main(String[] args) {
        System.out.println(  isAnagram("anagram", "nagaram"));
    }


    public static boolean isAnagram(String s, String t) {
        if (s.length()!=t.length())
            return false;

        char[] string1= s.toCharArray();
        char[] string2= t.toCharArray();
        Arrays.sort(string1);
        Arrays.sort(string2);

        return Arrays.equals(string1,string2);
    }
}