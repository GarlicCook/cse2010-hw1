package cse2010.hw1;
import cse2010.hw1.Utils;

public class InsertionSort {

    /**
     * Sort an array xs in a non-increasing (i.e., decreasing) order
     * @param xs integer array
     */
    // DO NOT MODIFY THIS METHOD!!
    public static void isort(int[] xs) {
        for (int i = 1; i < xs.length; i++) {
            insert(xs, i);
        }
    }

    /**
     * Insert element xs[k] to already sorted group x[0]..x[k-1]
     * @param xs integer array
     * @param k index of element to be inserted
     */
    private static void insert(int[] xs, int k) {
        for(int i = k; i > 0; i--) {
            if(xs[i-1] < xs[i]) {
                Utils.swap(xs, i, i-1);
            }
        }
    }

}
