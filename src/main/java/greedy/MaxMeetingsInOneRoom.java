package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class MaxMeetingsInOneRoom {

    /*
        https://www.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1

Input: s[] = {1, 3, 0, 5, 8, 5}, f[] = {2, 4, 6, 7, 9, 9}
Output: 1 2 4 5
First meeting [1, 2]
Second meeting [3, 4]
Fourth meeting [5, 7]
Fifth meeting [8, 9]

Input : s[] = {75250, 50074, 43659, 8931, 11273, 27545, 50879, 77924},
f[] = {112960, 114515, 81825, 93424, 54316, 35533, 73383, 160252 }
Output : 6 7 1
     */


    public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) {

        //Meetings Triple
        Triple[] meetings = new Triple[N];
        ArrayList<Triple> acceptedMeetings = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            meetings[i] = new Triple(S[i], F[i],i+1);
        }

        Arrays.sort(meetings, Comparator.comparingInt(x -> x.end));

        int lastMeetingEnd = meetings[0].end;
        acceptedMeetings.add(meetings[0]);
        //if current Meeting's start > lastMeetingEnd then only accept the meeting
        for (int i = 1; i < meetings.length; i++) {

            if (meetings[i].start > lastMeetingEnd) {
                lastMeetingEnd = meetings[i].end;

                acceptedMeetings.add(meetings[i]);
            }

        }

        return (ArrayList<Integer>) acceptedMeetings.stream().sorted(Comparator.comparingInt(x -> x.position)).map(x -> x.position).collect(Collectors.toList());
    }


    public static class Triple {

        int start;
        int end;

        int position;

        public Triple(int start, int end,int position) {
            this.start = start;
            this.end = end;
            this.position = position;
        }
    }


}
