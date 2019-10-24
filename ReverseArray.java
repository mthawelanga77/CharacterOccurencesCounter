package za.co.macbytes.coding.exercises;

import java.util.Arrays;

public class ReverseArray {
    
    public static int[] reverse(int[] arr) {
        int temp;
        for(int i = arr.length - 1, j = 0; i > 0 && j < i; i--, j++) {
           temp = arr[j];
           arr[j] = arr[i];
           arr[i] = temp;
        }
        return arr;
    }
    
    public static void main(String[] args) {
        int[] nums = new int[] {10, 20, 30, 40, 50};
        int[] newNums = ReverseArray.reverse(nums);
        System.out.println(Arrays.toString(newNums));
    }
}
