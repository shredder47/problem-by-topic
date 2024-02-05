package array;

import org.junit.Test;

public class RemoveDuplicatesFromSortedArrayTest {

    RemoveDuplicatesFromSortedArray r = new RemoveDuplicatesFromSortedArray();

    @Test
    public void removeDuplicates1() {

        int num[] = new int[] {0,0,1,1,1,2,2,3,3,4};

        int i = r.removeDuplicates(num);
        System.out.println(i);

    }

    @Test
    public void removeDuplicates2() {

        int num[] = new int[] {1,1,2};

        int i = r.removeDuplicates(num);
        System.out.println(i);

    }
}