package com.azdine.dev.peakfinding;



public class PeakFindingProblem {

    /**
     * this function will give you the so called a "peak"
     * in a given array T
     * @param T
     * @return
     */
    public int solution1(int[] T){
        int peak = T[1];
        for (int i =2 ; i< T.length -1 ; i++){
            if(T[i] >= peak && T[i] >=T[i++] ){
                peak = T[i];
            }
        }
        return peak;
    }

}
