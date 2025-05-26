/*
Given an array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. Do the mentioned change in the array in place.

Note: Consider the array as circular.

Examples :

Input: arr[] = [1, 2, 3, 4, 5], d = 2
Output: [3, 4, 5, 1, 2]
Explanation: when rotated by 2 elements, it becomes 3 4 5 1 2.
Input: arr[] = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20], d = 3
Output: [8, 10, 12, 14, 16, 18, 20, 2, 4, 6]
Explanation: when rotated by 3 elements, it becomes 8 10 12 14 16 18 20 2 4 6.
Input: arr[] = [7, 3, 9, 1], d = 9
Output: [3, 9, 1, 7]
Explanation: when we rotate 9 times, we'll get 3 9 1 7 as resultant array.
 */


package Array;

public class rotateArray {


    //time complexity => O(N) space complexity => 0(d)


        static void rotateArr(int arr[], int d) {
            int n = arr.length;
            d = d % n; // Handle cases where d > n

            // Step 1: Store the first 'd' elements in a temp array
            int[] temp = new int[d];
            for (int i = 0; i < d; i++) {
                temp[i] = arr[i];
            }

            // Step 2: Shift the remaining elements to the left
            for (int i = d; i < n; i++) {
                arr[i - d] = arr[i];
            }

            // Step 3: Place the temp elements at the end
            for (int i = 0; i < d; i++) {
                arr[n - d + i] = temp[i];
            }
        }
    }

    //optimal approach time complexity O(N) space complexity O(1);

class Solution2 {
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        d = d % n;
        reverse(arr, 0, d - 1);     // Reverse first 'd' elements
        reverse(arr, d, n - 1);     // Reverse remaining elements
        reverse(arr, 0, n - 1);     // Reverse entire array
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}


}
