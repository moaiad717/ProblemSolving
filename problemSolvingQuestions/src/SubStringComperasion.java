import java.util.ArrayList;
import java.util.List;

/**
 *https://www.hackerrank.com/challenges/java-string-compare/problem
 */

public class SubStringComperasion {
    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs",30));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest="";
        String largest="";

        int i = 0;
        while (i+k-1<s.length()){
            String subString= s.substring(i,i+k);
            if (smallest.length()==0 || subString.charAt(0) < smallest.charAt(0) )
                smallest=subString;
            if ( largest.length()==0 ||subString.charAt(0)> largest.charAt(0))
                largest=subString;

            if (subString.charAt(0)==smallest.charAt(0)){
                int count=1;
                while (count<subString.length()-1){
                    if (subString.charAt(count)<smallest.charAt(count)){
                        smallest=subString;
                        break;
                    }
                    count++;
                }
            }

            if (subString.charAt(0)==largest.charAt(0)){
                if (subString=="sdlkfhsdlfhsLFDLSFHSDLFHsdkfhs"){
                    System.out.println("MM");
                }
                int count=1;
                while (count<subString.length()-1){
                    if (subString.charAt(count)==largest.charAt(count)){
                        count++;
                        continue;
                    }
                    if (subString.charAt(count)>largest.charAt(count)){
                        largest=subString;
                        break;
                    }
                    break;
                }
            }
            i++;
        }
        return smallest + "\n" + largest;
    }

}
