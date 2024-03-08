package stackandqueues;

import java.util.Stack;

public class AsteroidCollision {

    //https://leetcode.com/problems/asteroid-collision/

    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {


            // Asteroid is going right, add as it is, nothing to check... why?
            // All going left / right are at same speed.
            // So if new positive asteroid spawns ,it will also go right,no other asteroid before it can catch it
            // therefore anything going right naturally we dont have to worry
            if (asteroid > 0)
                stack.push(asteroid);

            else {
                // We need to check asteroid when its traveling left also when its spawned later
                // Reason is the asteroids spawned before this and also travelling right will collide, hence we need
                // To check if its going to destroy / both getting destroyed / getting destroyed

                // Negative Asteroid should destroy all Smaller Positive Asteroid on its path
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -asteroid){
                    stack.pop();
                }

                // IF stack is empty or Last Asteroid is Negative, nothing to compare
                if(stack.isEmpty() || stack.peek() < 0){
                    stack.push(asteroid);
                    continue;
                }

                //IF last Positive Size is equal to Incoming Negative Size, Blast!
                if(!stack.isEmpty() && stack.peek() == -asteroid){
                    stack.pop();
                    continue;
                }

                //IF last Positive is bigger than incoming negative, Negative Blasts!
                if(!stack.isEmpty() && stack.peek() > -asteroid)
                    continue;
            }
        }

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }

}
