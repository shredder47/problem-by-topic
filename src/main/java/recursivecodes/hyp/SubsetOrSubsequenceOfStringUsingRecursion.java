package recursivecodes.hyp;

public class SubsetOrSubsequenceOfStringUsingRecursion {


    //SUBSTRING of ABC -> A B C AB BC ABC (CONTEGIUOUS CHUNKS)
    //SUBSEQUENCE of ABC -> "" A B C AB BC AC ABC (HERE AC IS ALLOWED, but ORDER Matters here)
    //SUBSET of ABC -> "" A B C AB BC AC ABC (Here order doesn't matter but for STRINGS SUBSET == SUBSEQUENCES)  AB can be written as BA, ABC can be written as ACB BCA and so on... hence one combination is enough.

    public static void main(String[] args) {

        subsets("abcd",""); // "" "a" "b" "ab" "c" "ac" "bc" "abc"

    }

    private static void subsets(String input,String output){

        if(input.isEmpty()){
            System.out.println(output);
            return;
        }

        String output1 = output;
        String output2 = output + input.charAt(0);

        String newInput = input.substring(1);
        subsets(newInput,output1);
        subsets(newInput,output2);

    }

}
