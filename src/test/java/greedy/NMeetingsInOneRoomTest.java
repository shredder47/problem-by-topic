package greedy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NMeetingsInOneRoomTest {


    NMeetingsInOneRoom n = new NMeetingsInOneRoom();

    @Test
    public void maxMeetings() {

        int start[] = new int[]{1, 3, 0, 5, 8, 5};
        int end[] = new int[]{2, 4, 6, 7, 9, 9};


        int i = n.maxMeetings(start, end, 6);
        Assert.assertEquals(4,i);

    }
}