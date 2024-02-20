package recursivecodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class SubsetsTest {

    Subsets s = new Subsets();
    @Test
    public void subsets() {

        System.out.println(s.subsets(new int[]{1, 2, 3}));

    }
}