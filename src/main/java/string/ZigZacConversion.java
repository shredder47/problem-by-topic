package string;

public class ZigZacConversion {


//    Input: s = "PAYPALISHIRING", numRows = 4
//    Output:    "PINALSIGYAHRPI"

    /*

                PAYPALISHIRING


            +---------+---------+---------+----------+
            |         |         |         |          |
            |         |         |         |          |
        0   |    P    |         |         |    S     |     SB[0]
            |         |         |         |          |
            +---------+---------+---------+----------+
            |         |         |         |          |
        1   |    A    |         |    I    |          |     SB[1]
            +---------+---------+---------+---------++
            |         |         |         |          |
        2   |    Y    |   [ L ] |         |          |     SB[2]
            |         |         |         |          |
            +---------+---------+---------+----------+
            |         |         |         |          |
        3   |    P    |         |         |          |     SB[3]
            |         |         |         |          |
            |         |         |         |          |
            +---------+---------+---------+----------+

        4 = NUM_ROWS

            INCREMENT TILL IT REACHES NUM_ROWS
            WHEN REACHES NUM_ROWS , DECREMENT ROW POINTER BY 2 THEN STARTS DECREMENT
            WHEN ROW POINTER REACHES 0 AGAIN START INCREMENTING

     */


    public String convert(String s, int numRows) {

        StringBuilder[] sbs = new StringBuilder[numRows];

        if(numRows==1)
            return s;

        if(numRows==0)
            return null;

        for (int i = 0; i < sbs.length; i++) {
            sbs[i] = new StringBuilder();
        }

        char[] charArray = s.toCharArray();
        int wordSize = charArray.length;

        int charPointer = 0;
        int rowPointer = 0;
        boolean increment = true;

        while (charPointer < wordSize) {
            //When row pointer comes to zero, start increment
            if (rowPointer == 0)
                increment = true;

            sbs[rowPointer].append(charArray[charPointer]);
            charPointer++;

            if (increment)
                rowPointer++;
            else
                rowPointer--;

            //When rowPointer reaches last row,go to last row - 1 and do decrements
            if (rowPointer == numRows) {
                increment = false;
                rowPointer = rowPointer - 2;
            }
        }

        StringBuilder finalString = new StringBuilder();
        for (StringBuilder sb : sbs) {
            finalString.append(sb.toString());
        }

        return finalString.toString();
    }


}
