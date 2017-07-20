package ArraysandStrings.StringRotation;

/**
 * Created by Burak on 20.7.2017.
 */
public class Solution {

    public boolean checkRotation(String string1, String string2){

        int len1 = string1.length();
        int len2 = string2.length();

        if(len1 != len2){
            return false;
        }

        String newString = string1 + string1;
        if(newString.indexOf(string2) > 0 ){
            return true;
        }

        else{
            return false;
        }
    }

}
