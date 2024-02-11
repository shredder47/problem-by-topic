package string;

import org.junit.Assert;
import org.junit.Test;

public class SortCharsByFreqTest {

    SortCharsByFreq f = new SortCharsByFreq();
    @Test
    public void sort1() {

        Assert.assertEquals("eert",f.frequencySort("tree"));

    }
    @Test
    public void sort2() {

        Assert.assertEquals("aaaccc",f.frequencySort("cccaaa"));

    }

    @Test
    public void sort3() {

        Assert.assertEquals("bbAa",f.frequencySort("Aabb"));

    }


    @Test
    public void sort4() {

        Assert.assertEquals("eeeeaaarrd",f.frequencySort("raaeaedere"));

    }

}