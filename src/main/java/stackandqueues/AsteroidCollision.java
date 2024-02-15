package stackandqueues;

import java.util.Stack;

public class AsteroidCollision {

    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            //If its going right, then blindly put it as no previous element can interfere, all at same speed
            if (asteroid > 0) {
                stack.push(asteroid);
            } else {
                //If Asteroid is going left

                //if asteroid traveling left is bigger then smash(pop) all asteroids going right
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -asteroid) {
                    stack.pop();
                }
                //Put the asteroid going left blindly if stack is empty, nothing to compare..
                //Put the asteroid going left on a place next to an asteroid going left
                if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(asteroid);
                    // if asteroid traveling left is equal to asteroid going right then burst(pop)
                } else if (stack.peek() == -asteroid) {
                    stack.pop();
                }
            }
        }

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }

}
