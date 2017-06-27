package ArraysandStrings.CheckPermutation;

public class Solution{

    public static String stringSort(String str){

        char[] content = str.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

    public static boolean checkPermutation(String str1, String str2){
        return stringSort(str1).equals(stringSort(str2));
    }
}