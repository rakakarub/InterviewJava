package ArraysandStrings.isUnique;

public class Test{

    public static void main(String[] args){

        String[] words = {"abcde", "hello", "apple", "kite", "padle"};

        for(String word : words){
            System.out.println(word + " :   " + Solution.isUnique(word));
        }

    }
}