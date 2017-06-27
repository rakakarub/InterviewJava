package ArraysandStrings.CheckPermutation;

/**
 * Created by Burak on 27.6.2017.
 */
public class Test {

    public static void main(String[] args){

        String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
        for (String[] pair : pairs){
            String word1 = pair[0];
            String word2 = pair[1];

            boolean result = Solution.checkPermutation(word1, word2);
            System.out.println(word1 + " vs " + word2 + " : " + result);
        }
    }
}
