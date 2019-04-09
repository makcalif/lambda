package com.recursion.factorial;

import static com.recursion.factorial.TailCalls.call;
import static com.recursion.factorial.TailCalls.done;

public class Factorial {

    public static TailCall<Integer> factorialTailRec( final int factorial, final int number) {
        if(number == 1) {
            return done(factorial);
        }
        else {
            return call(() -> factorialTailRec(factorial * number, number - 1));
        }
    }


    public static void main(String[] args) {
        Integer f = factorialTailRec(1, 4).invoke();
        System.out.printf("Factorial: " + f);
    }
}
