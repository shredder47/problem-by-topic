package stackandqueues;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AsteroidCollisionTest {

    AsteroidCollision a = new AsteroidCollision();
    @Test
    public void asteroidCollision() {

       Assert.assertArrayEquals(new int[] {5,10},a.asteroidCollision(new int[]{5, 10, -5}));
       Assert.assertArrayEquals(new int[] {},a.asteroidCollision(new int[]{8, -8}));
       Assert.assertArrayEquals(new int[] {10},a.asteroidCollision(new int[]{10, 2, -5}));
       Assert.assertArrayEquals(new int[] {-2,-2,-2},a.asteroidCollision(new int[]{-2, -2, 1, -2}));
       Assert.assertArrayEquals(new int[] {-2,-2,-2},a.asteroidCollision(new int[]{1, -2, -2, -2}));
    }
}