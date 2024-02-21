package recursivecodes;

public class Factorial {

    public static void main(String[] args) {


        System.out.println(fact(5));

    }



    // hypothesis f(n) -> n * n-1 * n-2 .... 1;
    // hypothesis on smaller input f(n-1) -> n-1 * n-2 .... 1; , for completion we need to mul n to the front of f(n-1)
    // induction -> n * f(n-1);
    private static int fact(int n){

        //lowest possible output
        if(n == 0)
            return 1;

        //induction and (n-1)
        return n * fact(n-1);
    }


}
