package revisit.queue;

import java.util.LinkedList;
import java.util.Queue;

import static java.util.Arrays.sort;

public class RevealCardsInIncreasingOrder {

//    https://leetcode.com/problems/reveal-cards-in-increasing-order/

    public int[] deckRevealedIncreasing(int[] deck) {

        sort(deck);

        int n = deck.length;

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) q.offer(i);

        int ans[] = new int[deck.length];

        for (int j : deck) {
            ans[q.poll()] = j;
            q.offer(q.poll());
        }

        return ans;
    }
}
