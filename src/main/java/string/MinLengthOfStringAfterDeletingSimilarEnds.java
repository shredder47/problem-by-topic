package string;

public class MinLengthOfStringAfterDeletingSimilarEnds {

    public int minimumLength(String s) {

        int left = 0;
        int right = s.length() - 1;

        // As two pointer, hence left should not cross right
        while (left < right) {

            // Perform the given algorithm only if this condition satisfies
            if (s.charAt(left) == s.charAt(right)) {
                char curChar = s.charAt(left);
                //Move left forward as long as the character matches
                while (left <= right && s.charAt(left) == curChar) {
                    left++;
                }

                //Move Right Backward as long as the character matches
                while (left <= right && s.charAt(right) == curChar) {
                    right--;
                }

            } else {
                break;
            }
        }

        // if left crossed right, that means all are deleted, hence size must be zero
        if(left > right)
            return 0;
        else
            //remaining string length will be Right Pointer - Left Pounter + 1(as zero Indexed)
            return right - left + 1;

    }

}
