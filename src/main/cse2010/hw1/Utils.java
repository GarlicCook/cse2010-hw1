package cse2010.hw1;

public class Utils {

    /**
     * Find an index of an element matching `target`.
     * @param xs int array
     * @param target element to be found
     * @return index of a matching element, -1 otherwise
     */
    public static int findIndex(int[] xs, int target) {
        for(int i = 0; i < xs.length; i++) {
            if(xs[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Calculate the sum of an array.
     * @param xs double array
     * @return sum of an array
     */
    public static double sum(double[] xs) {
        double sum = 0.0;
        for(int i = 0; i < xs.length; i++) {
            sum += xs[i];
        }
        return sum;
    }

    /**
     * Reverse the elements of a String array. For example, ["A", "BB", "C"] => ["C", "BB", "A"]
     * @param xs String array
     * @return a newly created array containing elements of xs in reversed order
     */
    public static String[] reverse(String[] xs) {
        String[] result = new String[xs.length];
        if(xs != null && xs.length != 0) {
            if(result.length % 2 == 1) {
                for(int i = 0; i < (result.length / 2); i++) {
                    result[i] = xs[result.length - i - 1];
                    result[result.length - i - 1] = xs[i];
                } result[result.length / 2] = xs[result.length / 2];
            }else{
                for(int i = 0; i < (result.length / 2); i++) {
                    result[i] = xs[result.length - i - 1];
                    result[result.length - i - 1] = xs[i];
                }
            }
        }
        return result;
    }

    /**
     * Swap elements at position i and j in array xs
     * @param xs integer array
     * @param i index of element to be swapped
     * @param j index of element to be swapped
     */
    public static void swap(int[] xs, int i, int j) {
        int tmp = xs[i];
        xs[i] = xs[j];
        xs[j] = tmp;
    }

    /**
     * Reverse the elements of a String array in place without creating a new array.
     * Input array xs itself must be transformed to an array containing elements
     * in reversed order.
     * For example, ["A", "BB", "C"] => ["C", "BB", "A"].
     * @param xs String array
     */
    public static void reverse_in_place(String[] xs) {
        for(int i = 0; i < xs.length/2; i++) {
            String tmp = xs[i];
            xs[i] = xs[xs.length - i - 1];
            xs[xs.length - i - 1] = tmp;
        }
    }

    /**
     * Returns an array containing running averages of an array.
     * @param xs int array
     * @return an array containing running average
     *
     * Given an input xs = [1, 2, 3, 4], `average()` returns a new array
     * containing running averages [1.0, 1.5, 2.0, 2.5].
     * Here,
     *      1.0 = 1 / 1
     *      1.5 = (1 + 2) / 2
     *      2.0 = (1 + 2 + 3) / 3
     *      2.5 = (1 + 2 + 3 + 4) / 4
     */
    public static double[] average(int[] xs) {
        double[] sums = new double[xs.length];
        int sum = 0;
        for(int i = 0; i < xs.length; i++) {
            sum += xs[i];
            sums[i] = sum / (i + 1.0);
        }
        return sums;
    }

}
