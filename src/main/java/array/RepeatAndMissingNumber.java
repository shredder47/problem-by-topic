package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatAndMissingNumber {

//    Input:[3 1 2 5 3]
//
//    Output:[3, 4]
//
//    A = 3, B = 4

    //https://www.interviewbit.com/problems/repeat-and-missing-number-array/

    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {

        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        // adding numbers from 1 to N to set
        for (int i = 0; i < A.size(); i++) {
            set.add(i + 1);
        }

        for (int i = 0; i < A.size(); i++) {

            //If removal has failed that means its a duplicated number,
            if (set.remove(A.get(i)) == false)
                list.add(A.get(i));

        }
        // pending item that was not removed is the missing number
        list.add(set.stream().findFirst().get());

        return list;
    }


}
