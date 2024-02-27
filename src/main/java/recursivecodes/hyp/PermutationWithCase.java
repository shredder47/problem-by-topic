package recursivecodes.hyp;

public class PermutationWithCase {

//    Input : ab
//    Output : AB Ab ab aB
//
//    Input : ABC
//    Output : abc Abc aBc ABc abC AbC aBC ABC
    public static void main(String[] args) {

        String input = "abc";

        permuteWithCase(input,"");

    }

    private static void permuteWithCase(String input,String output){

        if(input.isEmpty())
        {
            System.out.println(output);
            return;
        }

        String output1 = output + input.charAt(0);
        String output2 = output + String.valueOf(input.charAt(0)).toUpperCase();
        String newInput = input.substring(1);

        permuteWithCase(newInput,output1);
        permuteWithCase(newInput,output2);
    }


}
