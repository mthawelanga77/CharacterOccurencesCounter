/**
Purpose: How do you remove duplicates from an array in place?
*/

package za.co.macbytes.coding.exercises;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {

    public static int[] removeDuplicates(int[] arr) {
        return Arrays.stream(arr)
               .distinct()
               .toArray();
    }

    public static void main(String[] args) {
        int[] arr = {1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5};
        System.out.println(Arrays.toString(RemoveDuplicatesFromArray.removeDuplicates(arr)));
    }
}
