package recursivecodes.hyp;

import java.util.HashSet;
import java.util.Set;

public class PermutationWithCase {

    //    Input : ab
//    Output : AB Ab ab aB
//
//    Input : ABC
//    Output : abc Abc aBc ABc abC AbC aBC ABC
    public static void main(String[] args) {

        String input = "3Z4";

        Set<String> permutations = new HashSet<>();

        permuteWithCase(input, "", permutations);

        System.out.println(permutations);
    }

    private static void permuteWithCase(String input, String output, Set<String> permutations) {

        if (input.isEmpty()) {
            permutations.add(output);
            return;
        }

        String output1 = output + input.charAt(0);
        String invert = "";

        if (Character.isUpperCase((input.charAt(0)))) {
            invert = String.valueOf(input.charAt(0)).toLowerCase();
        } else
            invert = String.valueOf(input.charAt(0)).toUpperCase();

        String output2 = output + invert;
        String newInput = input.substring(1);

        permuteWithCase(newInput, output1, permutations);
        permuteWithCase(newInput, output2, permutations);
    }


}
