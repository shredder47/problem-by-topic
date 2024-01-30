package array;

import org.junit.Test;

public class DuplicateNumberTest {
    DuplicateNumber s = new DuplicateNumber();

    @Test
    public void test1() {

        int [] arr = new int[] {1,3,4,2,2};

        System.out.println(s.findDuplicate(arr));
    }

    @Test
    public void test2() {

        int [] arr = new int[] {3,1,3,4,2};

        System.out.println(s.findDuplicate(arr));
    }





}
