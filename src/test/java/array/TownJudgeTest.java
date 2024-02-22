package array;

import org.junit.Assert;
import org.junit.Test;

public class TownJudgeTest {

    TownJudge townJudge = new TownJudge();

    @Test
    public void findJudge() {

        Assert.assertEquals(3, townJudge.findJudge(4, new int[][]{{1,3},{1,4},{2,3},{2,4},{4,3}}));

    }
}