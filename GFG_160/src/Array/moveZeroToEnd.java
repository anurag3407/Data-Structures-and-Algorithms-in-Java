/*
You are given an array arr[] of non-negative integers. Your task is to move all the zeros in the array to the right end while maintaining the relative order of the non-zero elements. The operation must be performed in place, meaning you should not use extra space for another array.

Examples:

Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
Output: [1, 2, 4, 3, 5, 0, 0, 0]
Explanation: There are three 0s that are moved to the end.
Input: arr[] = [10, 20, 30]
Output: [10, 20, 30]
Explanation: No change in array as there are no 0s.
Input: arr[] = [0, 0]
Output: [0, 0]
Explanation: No change in array as there are all 0s.
 */


package Array;

public class moveZeroToEnd {


    // Brute force approach => Store all the non-zero elements in an different array and then move that array into the original array and place zero to the end of it till the size of the new array will be equal to the size of the current array.
    //time complexity => O(2N)
    //space complexity => O(N)



    // optimal approach


        void pushZerosToEnd(int[] arr) {
            // code here

            int j = -1 ;

            for (int i = 0 ; i < arr.length ; i++){

                if(arr[i] == 0) {
                    j = i;
                    break;
                }
            }
            if (j == -1) return ;

            for (int i = j+1 ; i < arr.length ; i++){
                if ( arr[i] != 0){

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp ;

                    j++;
                }
            }

        }
    }

