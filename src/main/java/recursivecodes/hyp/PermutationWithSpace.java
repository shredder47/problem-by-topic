package recursivecodes.hyp;

import java.util.ArrayList;
import java.util.Comparator;

public class PermutationWithSpace {

    //Aditya Verma, Recursion playlist
//    https://www.geeksforgeeks.org/problems/permutation-with-spaces3627/1
    public static void main(String[] args) {


        String input = "abc";
        System.out.println(permutation(input));


    }

    public static ArrayList<String> permutation(String S) {
        ArrayList<String> permutations = new ArrayList<>();
        String output = String.valueOf(S.charAt(0));
        String newInput = S.substring(1);
        permuteWithSpace(newInput, output, permutations);
        permutations.sort( Comparator.comparingInt(String::length).reversed());
        return permutations;
    }


    private static void permuteWithSpace(String input, String output, ArrayList<String> permutations) {

        if (input.isEmpty()) {
            permutations.add(output);
            return;
        }

        String output1 = output + input.charAt(0);
        String output2 = output + " " + input.charAt(0);

        String newInput = input.substring(1);
        permuteWithSpace(newInput, output2, permutations);
        permuteWithSpace(newInput, output1, permutations);

    }
}
