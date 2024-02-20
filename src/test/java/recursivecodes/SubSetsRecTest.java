package recursivecodes;

import org.junit.Test;

public class SubSetsRecTest {

    SubSetsRec s = new SubSetsRec();
    @Test
    public void subsets() {

        System.out.println(s.subsets(new int[]{1, 2, 3}));

    }
}