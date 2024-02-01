package array;

public class TrappingRainwater {

/*

    5:
    J.
    ?.
    ?.
  . ?.                                                      :^^^^^^^.
    ?.                                                      B@@@@@@@!
    ?.                                                      B@@@@@@@!
    ?.                                                      B@@@@@@@~
  . ?.                      :GPPPPPP5!!!!!!!!!!!!!!!!!!!!!!!&@@@@@@@#PPPPPPP?!!!!!!7PPPPPPG5
    ?.                      ~@@@@@@@@PPPPPPPPPPPPPPPPPPPPPPP&@@@@@@@@@@@@@@@B5PPPPPG@@@@@@@@.
    ?.                      ~@@@@@@@@55555555555555555555555&@@@@@@@@@@@@@@@B555555P@@@@@@@@.
    ?.                      !@@@@@@@@PPPPPPPP5555555PPPPPPPP&@@@@@@@@@@@@@@@BPPPPPPG@@@@@@@@:
  . ?.      .&@@@@@@&5YYYYYYB@@@@@@@@@@@@@@@&5555555&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    ?.      .@@@@@@@@P555555B@@@@@@@@@@@@@@@&5555555&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    ?.      .@@@@@@@@P5PPPP5#@@@@@@@@@@@@@@@@5PPPPP5&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
 .: ~:......^GGGGGGGGJ??????YGGGGGGGGGGGGGGGP???????PGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG
left    0       1       1       2       2       2       2       3       3       3       3       3
right   3       3       3       3       3       3       3       3       2       2       2       1

 */

    public int trap(int[] height) {

        int[] leftMaxHeight = new int[height.length];
        int[] rightMaxHeight = new int[height.length];

        int leftMaxSoFar = 0;
        for (int i = 0; i < height.length; i++) {
            leftMaxSoFar = Math.max(leftMaxSoFar, height[i]);
            leftMaxHeight[i] = leftMaxSoFar;
        }

        int rightMaxSoFar = 0;
        for (int j = (height.length - 1); j >= 0; j--) {
            rightMaxSoFar = Math.max(rightMaxSoFar, height[j]);
            rightMaxHeight[j] = rightMaxSoFar;
        }

        int waterUnits = 0;
        for (int i = 0; i < height.length; i++) {
            int minOfLeftAndRight = Math.min(leftMaxHeight[i], rightMaxHeight[i]);
            waterUnits = waterUnits + (minOfLeftAndRight - height[i]);
        }


        return waterUnits;
    }


}
