/**
 * https://leetcode.com/problems/detect-capital/
 */

public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        int countUP =0;

        for (int i =0; i<word.length() ;i++){
            char curr = word.charAt(i);
            if (curr >= 'A' && curr <= 'Z')
                countUP ++;

        }
        //All are small letter
        if (countUP ==0)
            return true;

        if (countUP == word.length())
            return true;

        if (countUP == 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z')
            return true;

        return false;
    }
}
