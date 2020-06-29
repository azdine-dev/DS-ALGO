package com.azdine.dev.searching;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] test = new int[]{3, 22, 27, 47, 57, 67, 89, 91, 95, 99};
        int index = binarySearchIterative(test ,67);

        System.out.println("index ===>"+ index);
    }

    public static int binarySearchIterative(int arr[], int elementToSearch) {

        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        // termination condition (element isn't present)
        while(firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            // if the middle element is our goal element, return its index
            if (arr[middleIndex] == elementToSearch) {
                return middleIndex;
            }

            // if the middle element is smaller
            // point our index to the middle+1, taking the first half out of consideration
            else if (arr[middleIndex] < elementToSearch)
                firstIndex = middleIndex + 1;

                // if the middle element is bigger
                // point our index to the middle-1, taking the second half out of consideration
            else if (arr[middleIndex] > elementToSearch)
                lastIndex = middleIndex - 1;

        }
        return -1;
    }

    public static int recursiveBS(int[] array,int firstElement ,int lastElement, int elementToSearch){
        if(firstElement <= lastElement){
            int mid = (firstElement + lastElement)/2;
            if (array[mid] ==elementToSearch){
                return mid;
            } if(array[mid] > elementToSearch){
               return recursiveBS(array, firstElement, mid - 1, elementToSearch);
            }
            return  recursiveBS(array, mid + 1, lastElement, elementToSearch);
        }
       return -1;
    }

}
