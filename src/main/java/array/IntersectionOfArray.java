package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArray {


    public static void main(String[] args) {
//

        int[] a = new int[]{4,9,5};
        int[] b = new int[]{9,4,9,8,4};
        int[] intersection = intersection(a, b);
        System.out.println(Arrays.toString(intersection));

    }

    public static int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> s = new HashSet<>();
        Set<Integer> output = new HashSet<>();

        int len1 = nums1.length;
        int len2 = nums2.length;

        if (len1 > len2) {
            for (int i : nums1) {
                s.add(i);
            }


            for (int i : nums2) {
                if(s.contains(i))
                    output.add(i);
            }
        } else {
            for (int i : nums2) {
                s.add(i);
            }

            for (int i : nums1) {
                if(s.contains(i))
                    output.add(i);
            }
        }

        return output.stream().mapToInt(Integer::intValue).toArray();
        
    }


}
