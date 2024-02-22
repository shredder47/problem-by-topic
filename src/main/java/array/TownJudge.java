package array;

public class TownJudge {
//    https://leetcode.com/problems/find-the-town-judge/description/

//    Example 1:
//
//    Input: n = 2, trust = [[1,2]]
//    Output: 2
//    Example 2:
//
//    Input: n = 3, trust = [[1,3],[2,3]]
//    Output: 3
//    Example 3:
//
//    Input: n = 3, trust = [[1,3],[2,3],[3,1]]
//    Output: -1

//    Input: n = 4 , trust = {{1,3},{1,4},{2,3},{2,4},{4,3}
//    Output: 3


    /*For input {{1,3},{1,4},{2,3},{2,4},{4,3}}
       when t[0] is 1 and t[1] is 3 trustCount is [0, -1, 0, 1, 0]
       when t[0] is 1 and t[1] is 4 trustCount is [0, -2, 0, 1, 1]
       when t[0] is 2 and t[1] is 3 trustCount is [0, -2, -1, 2, 1]
       when t[0] is 2 and t[1] is 4 trustCount is [0, -2, -2, 2, 2]
       when t[0] is 4 and t[1] is 3 trustCount is [0, -2, -2, 3, 1]
       */
    public int findJudge(int n, int[][] trust) {

        //create a trust count array of size n+1 , as the people are from 1 to n , 0th index is not used
        int[] trustCount = new int[n + 1];

        // iterate through the trust array and decrement the trust count of the person who is trusting and increment the trust count of the person who is being trusted
        // decrementing is required there can be many people who can be trust by n-1 people, but judge is the one who trusts no one(hence no decrements for him)
        // This ensures the one with n-1 trust count is the judge
        for (int[] t : trust) {

            trustCount[t[0]]--;
            trustCount[t[1]]++;
        }
        // iterate through the trust count array and check if the trust count of a person is n-1, if yes return the person
        // if number of people is 4, then the judge will be trusted by 3 people, so the trust count of the judge will be 3
        for (int i = 1; i <= n; i++) {
            if (trustCount[i] == n - 1) {
                return i;
            }
        }

        return -1;
    }
}

