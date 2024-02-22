package array;

import org.junit.Test;
import recursivecodes.Permutations;

public class PermutationsTest {

    Permutations p = new Permutations();
    @Test
    public void permute() {

        System.out.println(p.permute(new int[]{1,2,3}));
    }
}