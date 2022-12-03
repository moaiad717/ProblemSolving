package leetCode_easy.strings;

/**
 * https://leetcode.com/problems/reverse-string/
 */
public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("abcd".toCharArray()));
    }

    public static String reverseString(char[] s) {
        int start= 0;
        int last= s.length-1;
        while (start<last){
            char temp= s[start];
            s[start]=s[last];
            s[last]=temp;
            start++;
            last--;
        }
        return String.copyValueOf(s);
    }
}
