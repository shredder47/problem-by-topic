package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class NMeetingsInOneRoom {

    /*
        https://www.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1

        Input:
        N = 6
        start[] = {1,3,0,5,8,5}
        end[] =  {2,4,6,7,9,9}
        Output: 4
     */


    public static int maxMeetings(int start[], int end[], int n) {

        //Meetings Pairs
        Pair[] meetings = new Pair[n];


        for (int i = 0; i < n; i++) {
            meetings[i] = new Pair(start[i], end[i]);
        }

        Arrays.sort(meetings, Comparator.comparingInt(x -> x.end));


        int counter = 1;

        int lastMeetingEnd = meetings[0].end;
        //if current Meeting's start > lastMeetingEnd then only accept the meeting
        for (int i = 1; i < meetings.length; i++) {

            if (meetings[i].start > lastMeetingEnd) {
                lastMeetingEnd = meetings[i].end;
                counter++;
            }

        }

        return counter;
    }


    public static class Pair {

        int start;
        int end;

        public Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }


}
