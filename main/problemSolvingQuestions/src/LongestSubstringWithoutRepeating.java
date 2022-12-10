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
            String temp="";
            for (int j=i;j<s.length();j++){
                String charVal=String.valueOf(s.charAt(j));
                if (!temp.contains(charVal)){
                    temp=temp.concat(charVal);
                }else
                break;
            }
            if (temp.length()>max)
                max=temp.length();
        }
        return max;
        }
    }

