package greedy;

public class SurviveIsland {

    /*
    Geekina got stuck on an island. There is only one shop on this island and it is open on all days of the week except for Sunday. Consider following constraints:

    N – The maximum unit of food you can buy each day.
    S – Number of days you are required to survive.
    M – Unit of food required each day to survive.
    Currently, it’s Monday, and she needs to survive for the next S days.
    Find the minimum number of days on which you need to buy food from the shop so that she can survive the next S days, or determine that it isn’t possible to survive.
     */


    static int minimumDays(int S, int N, int M) {
        // code here

        if(M > N) return -1;

        int numberOfSundays = S / 7;
        int buyableDays = S - numberOfSundays;

        int amountOfFoodRequired = S * M;

        // amount of days required = total requirement / per day purchase capacity, if there is a reminder then + 1 day more required
        int numberOfDaysRequiredToBuyFood = amountOfFoodRequired / N + (amountOfFoodRequired % N != 0 ? 1 : 0);

        return numberOfDaysRequiredToBuyFood <= buyableDays ? numberOfDaysRequiredToBuyFood : -1;
    }

}
