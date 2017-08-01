package com.company;

/**
 * Created by Alan on 8/1/2017.
 */
public class NumberUtil {

    // Returns factorial up to a result of 19!, higher would not be contained by an int type and will return -1
    public static int numFactorial(int num) {
        // Checks if negative number
        if (num < 0) {
            return -1;
        } else {
            /* Calculates factorial by iterating from 2 up to the target input and multiplies by each iterator value.
                Do not need to catch case of input 0 or 1 because it will skip this loop and return 1 */
            int factorial = 1;
            for (int i = 2; i <= num; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }
}
