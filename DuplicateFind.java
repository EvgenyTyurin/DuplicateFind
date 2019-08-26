/**
 * Find duplicates in integer array
 * Using count array, O(n) complexity
 * Aug 2019 EvgenyT
 */

public class DuplicateFind {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 2};
        // Count array
        int[] count = new int[intArray.length];
        for(int idx = 0; idx < intArray.length; idx++) {
            // Fill count array, if number repeated - show it once
            if (count[intArray[idx]]++ == 1) {
                System.out.println(intArray[idx] + " duplicates");
            }
        }
    }
}
