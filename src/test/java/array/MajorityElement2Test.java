package array;

import org.junit.Test;

public class MajorityElement2Test {

    @Test
    public void test1() {

        MajorityElement2 s = new MajorityElement2();

        System.out.println(s.majorityElement(new int[]{3,2,3}));
        System.out.println(s.majorityElement(new int[]{1}));
        System.out.println(s.majorityElement(new int[]{1,2}));
        System.out.println(s.majorityElement(new int[]{2,2,1,1,1,2,2}));
    }




}
