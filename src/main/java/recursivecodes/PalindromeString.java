package recursivecodes;

public class PalindromeString {


    public static void main(String[] args) {

        String str = "racecar";
        System.out.println(isPalindrome(str, 0, str.length() - 1));

    }

    private static boolean isPalindrome(String str, int l, int r) {
        //Base Case
        if (str.isEmpty() || str.length() == 1)
            return true;

        if (l < r) {

            if (str.charAt(l) == str.charAt(r))
                //if the comparison is successful continue doing more
                return isPalindrome(str, ++l, --r);
            else
                //else stop
                return false;
        }
        //means Successful Traversal of all elements, no false encountered so far
        return true;
    }


}
