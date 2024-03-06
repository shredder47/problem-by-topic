package string;

import org.junit.Assert;
import org.junit.Test;

public class MinLengthOfStringAfterDeletingSimilarEndsTest {

    MinLengthOfStringAfterDeletingSimilarEnds m = new MinLengthOfStringAfterDeletingSimilarEnds();
    @Test
    public void minimumLength() {


            Assert.assertEquals(1,m.minimumLength("bbbbbbbbbbbbbbbbbbbbbbbbbbbabbbbbbbbbbbbbbbccbcbcbccbbabbb"));
            Assert.assertEquals(2,m.minimumLength("ca"));
            Assert.assertEquals(0,m.minimumLength("cabaabac"));
            Assert.assertEquals(3,m.minimumLength("abccabbaaaaaa"));
            Assert.assertEquals(1,m.minimumLength("c"));

    }
}