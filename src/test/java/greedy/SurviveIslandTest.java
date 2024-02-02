package greedy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SurviveIslandTest {

    SurviveIsland s = new SurviveIsland();
    @Test
    public void minimumDays1() {

        int num = s.minimumDays(10, 16, 2);

        Assert.assertEquals(2, num);

    }

    @Test
    public void minimumDays2() {

        int num = s.minimumDays(10, 20, 30);

        Assert.assertEquals(-1, num);

    }
}