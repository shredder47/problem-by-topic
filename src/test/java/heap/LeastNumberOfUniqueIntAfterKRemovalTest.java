package heap;

import org.junit.Test;

public class LeastNumberOfUniqueIntAfterKRemovalTest {
    LeastNumberOfUniqueIntAfterKRemoval l = new LeastNumberOfUniqueIntAfterKRemoval();

    @Test
    public void findLeastNumOfUniqueInts1() {

        System.out.println(l.findLeastNumOfUniqueInts(new int[]{5, 5, 4}, 1));

    }

    @Test
    public void findLeastNumOfUniqueInts2() {

        System.out.println(l.findLeastNumOfUniqueInts(new int[]{4,3,1,1,3,3,2}, 3));

    }
}