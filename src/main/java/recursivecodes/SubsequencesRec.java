package recursivecodes;

public class SubsequencesRec {


//    Sample Input 1:
//            1
//    abc
//    Sample Output 1:
//    a ab abc ac b bc c
//    Explanation of sample input 1:
//    All possible subsequences of abc are :
//            “a” , “b” , “c” , “ab” , “bc” , “ac”, “abc”
//    Sample Input 2:
//            1
//    bbb
//    Sample Output 2:
//    b b b bb bb bb bbb

    public static void subsequence(String str, String ans) {
        //base case
         if (str.isEmpty()) {
              System.out.print(ans + " ");
              return;
         }


         //recursive case
         char ch = str.charAt(0);

         //recursive call
         String ros = str.substring(1);
         subsequence(ros, ans);
         subsequence(ros, ans + ch);
    }

    public static void main(String[] args) {
        String str = "abc";
        subsequence(str, "");
    }


}
