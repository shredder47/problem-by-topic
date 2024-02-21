package recursivecodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class RatInMazeTest {

    RatInMaze r = new RatInMaze();

    @Test
    public void findPath() {

        int N = 4;
        int[][] m = new int[][]
                {{1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}};


        System.out.println(RatInMaze.findPath(m, N));
    }
}