public class LongestPalindromicSubString {

    /**
     * https://leetcode.com/problems/longest-palindromic-substring/submissions/
     *
     */
    public static void main(String[] args) {

        LongestPalindromicSubString l = new LongestPalindromicSubString();
        String res= l.longestPalindrome("bbabcbab");
        System.out.println(res);
    }

    public String longestPalindrome(String s) {
        String longest= "";
        for (int i = 0; i<s.length() ; i++){
            // If String have Odd num of char
            String palindrom= checkPalind(s,i,i);
            //If String have even number of Char
            String palindrom2= checkPalind(s,i,i+1);

            if (palindrom2.length()>palindrom.length())
                palindrom=palindrom2;

            if (palindrom.length()>longest.length()){
                longest=palindrom;
            }
        }
        return longest;
    }

    String checkPalind( String strig, int prev, int next){
        while (prev >=0 && next < strig.length()){
            if (strig.charAt(prev) == strig.charAt(next)){
                next+=1;
                prev-=1;
            }
            else
                break;
        }
        return strig.substring(prev+1,next);
    }
}
