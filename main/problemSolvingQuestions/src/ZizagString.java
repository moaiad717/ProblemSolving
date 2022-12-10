public class ZizagString {

    /**
     *  https://leetcode.com/problems/zigzag-conversion/
     */


    public static String convert(String s, int numRows) {
        StringBuilder [] stringBuilders = new  StringBuilder[numRows];
        for (int i=0; i<numRows; i++){
            stringBuilders[i]= new StringBuilder();
        }
        int length = s.length();
        int index =0;

        while (index<length){
            for (int i =0; i < numRows && index<length; i++){
                stringBuilders[i].append(s.charAt(index++));
            }
            for (int j = numRows -2; j>0 && index<length; j--){
                stringBuilders [j].append(s.charAt(index++));
            }
        }

        StringBuilder finalRes= new StringBuilder();
        for (StringBuilder sb : stringBuilders){
            finalRes.append(sb.toString());

        }

        return finalRes.toString();
    }
}
