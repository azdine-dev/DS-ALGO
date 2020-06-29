package com.azdine.dev.searching;

public class LinearSearching {

    //find the position of the element to search for

    public static int linearSearch(int[] array,int elementToSearch){
        // insert Code here

        for (int i = 0 ; i< array.length; i++){
            if(array[i] == elementToSearch)
                return i;

        }

        return -1;
    }
}
