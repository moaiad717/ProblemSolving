package leetCode_easy.strings;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/881/
 */
public class FirstUniqueCharacter {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("aabb"));
    }

    public static int firstUniqChar(String s) {

        int indx=0;
        int length=s.length();
        while ( indx< length){
            char current = s.charAt(indx);
            if (!s.substring(indx+1,length).contains(String.valueOf(current))
            && !s.substring(0,indx).contains(String.valueOf(current))){
                return indx;
            }
            indx++;
        }
        return -1;
    }


}
