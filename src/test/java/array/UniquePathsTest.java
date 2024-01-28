package array;

import org.junit.Assert;
import org.junit.Test;

public class UniquePathsTest {
    UniquePaths u = new UniquePaths();

    @Test
    public void test1() {

       Assert.assertEquals(28,u.uniquePaths(3,7));
    }

    @Test
    public void test2() {

        Assert.assertEquals(3,u.uniquePaths(3,2));

    }
}
