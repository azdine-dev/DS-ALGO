package com.azdine.dev.oddoccurences;


/**
 *  this class represents my solution to this problem
 *
 */
public class OddOcucurences {

    public static void main(String[] args) {
        int[]  test = {9,3,9,3,9,7,9};
        int solution = solution(test);
    }

    public static int solution(int[] A){
        int odd = 0;

        for(int index = 0; index < A.length; index ++){

            odd = (odd ^ A[index]);

        }
        return odd;
    }

}
