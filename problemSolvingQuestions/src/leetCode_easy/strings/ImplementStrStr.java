package leetCode_easy.strings;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/885/
 */
public class ImplementStrStr {

    public static void main(String[] args) {
        System.out.println(strStr("mississippi","sipp"));
    }

        public static int strStr(String haystack, String needle) {
            if (haystack.equals(needle))
                return 0;
            if (haystack.length() < needle.length())
                return -1;
            if (!haystack.isEmpty() && needle.isEmpty())
                return 0;

            char first = needle.charAt(0);
            OUTER :
            for (int i =0; i<haystack.length(); i++){
                if (haystack.length()-i < needle.length())
                    return -1;
                if (haystack.charAt(i)==first){
                    int index =i;
                    for (int j =0; j<needle.length();j++) {
                        if (haystack.charAt(i + j) == needle.charAt(j)) {
                            if (j == needle.length() - 1)
                                return index;
                        } else
                            continue OUTER;
                    }
                }
            }
            return -1;
        }
}
