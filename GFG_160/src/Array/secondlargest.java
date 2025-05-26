package Array;

//Brute force => O(N) + NlogN
//first sort the array and then find the last as largest and then iterate from back and find the second largest .


//better approach => O(N*N
//iterate the loop to find the largest and then iterate to find the second largest


// Optimal approach => O(N)

class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        if (arr.length < 2){ return -1;
        }

        int secondLargest = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;

        for ( int j = 0 ; j < arr.length ; j ++){



            if ( arr[j] > largest ) {
                secondLargest = largest ;
                largest = arr[j];
            }
            else if ( arr[j] > secondLargest && arr[j] != largest ){
                secondLargest = arr[j];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) return -1;
        return secondLargest;

    }
}
