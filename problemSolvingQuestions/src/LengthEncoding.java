public class LengthEncoding {

    public static void main(String[] args)
    {
        String str = "wwwwaaadexxxxxxywww";
        printRLE(str);
    }

    public static void printRLE(String str){
        int length= str.length();
        String out = "";
        for (int i=0; i<length;i++){
            int count=1;
            while (i<length-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            out= out +str.charAt(i)+ count;
        }
        System.out.println(out);
    }
}
