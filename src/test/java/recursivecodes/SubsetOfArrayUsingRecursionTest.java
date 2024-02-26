package recursivecodes;

import org.junit.Test;

public class SubsetOfArrayUsingRecursionTest {

    SubsetOfArrayUsingRecursion s = new SubsetOfArrayUsingRecursion();
    @Test
    public void subsets() {

        System.out.println(s.subsets(new int[]{1, 2, 3}));

    }
}