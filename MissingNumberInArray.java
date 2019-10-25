/**
 * Purpose: How do you find the missing number in a given integer array of 1 to 101 without using Arrays.binarySearch() method?
 */

package za.co.macbytes.coding.exercises;

public class MissingNumberInArray {
    
    public static int findMissingNumber(int[] numsArr, int first, int last, int search) {
        int mid = numsArr.length / 2;
        while(first <= last) {
            if(mid < search) {
                first = mid + 1;
            } else if(mid > search) {
                last = mid - 1;
            } else {
                return search;
            }
            mid = (first + last) / 2;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] numberArr = new int[101];
        for(int i = 0; i < numberArr.length; i++) {
            numberArr[i] = i + 1;
        }
        int result = MissingNumberInArray.findMissingNumber(numberArr, 1, numberArr.length, 56);
        System.out.println((result >= 0)? result + " found." : "number not found.");
    }
}
