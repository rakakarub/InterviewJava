package ArraysandStrings.StringRotation;

/**
 * Created by Burak on 20.7.2017.
 */
public class Test {
    public static void main(String[] args) {
        String[][] pairs = {{"apple", "pleap"}, {"waterbottle", "erbottlewat"}, {"camera", "macera"}};
        Solution sol = new Solution();
        for (String[] pair : pairs) {
            String word1 = pair[0];
            String word2 = pair[1];
            boolean is_rotation = sol.checkRotation(word1, word2);
            System.out.println(word1 + ", " + word2 + ": " + is_rotation);
        }
    }
}
