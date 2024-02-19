package recursivecodes;

public class Reverse {


    public static void main(String[] args) {

        String str = "shredder";

        char[] charArray = str.toCharArray();
        rev(charArray, 0, str.length() - 1);
        System.out.println(new String(charArray));

        System.out.println(Math.log(16));

    }

    private static void rev(char[] str, int l, int r) {

        if (l <= r) {{
            swap(str, l, r);
            l++;
            r--;

            rev(str, l, r);
        }}



    }

    private static void swap(char[] str, int location1, int location2) {

        char temp = str[location1];
        str[location1] = str[location2];
        str[location2] = temp;


    }


}
