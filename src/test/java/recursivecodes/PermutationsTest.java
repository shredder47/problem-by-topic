package recursivecodes;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PermutationsTest {

    Permutations permutations = new Permutations();
    @Test
    public void permute() {

        Assert.assertEquals(6, permutations.permute(new int[]{1,2,3}).size());
        System.out.println(permutations.permute(new int[]{1,2,3}));
    }
}