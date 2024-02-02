package greedy;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class MaxMeetingsInOneRoomTest {


    MaxMeetingsInOneRoom n = new MaxMeetingsInOneRoom();

    @Test
    public void maxMeetings() {

        int start[] = new int[]{1, 3, 0, 5, 8, 5};
        int end[] = new int[]  {2, 4, 6, 7, 9, 9};


        List<Integer> i = n.maxMeetings(6, start, end);
        System.out.println(i);
        Assert.assertArrayEquals(Arrays.asList(1,2,4,5).toArray(), i.toArray());

    }

    @Test
    public void maxMeetings2() {

        //                       1  2    3  4   5   6   7   8   9   10
        int start[] = new int[]{12, 6,  16, 12, 6,  9,  16, 6,  17, 5 };
        int end[] = new int[]  {17, 13, 16, 18, 17, 10, 18, 12, 18, 11};


        List<Integer> i = n.maxMeetings(10, start, end);
        Assert.assertArrayEquals(Arrays.asList(3,6,9).toArray(), i.toArray());




    }


}