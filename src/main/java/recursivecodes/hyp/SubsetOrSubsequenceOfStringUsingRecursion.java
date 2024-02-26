package recursivecodes.hyp;

public class SubsetOrSubsequenceOfStringUsingRecursion {

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
