import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/unique-morse-code-words/submissions/
 */

public class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        String [] mores= {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> result = new HashSet<>();
        for (String word : words){
            StringBuilder sb = new StringBuilder();
            for (char c : word.toCharArray()){
             sb.append(mores[c-97]);
            }

            result.add(sb.toString());
        }
        return result.size();
    }
}
