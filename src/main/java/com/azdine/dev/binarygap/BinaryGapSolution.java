package com.azdine.dev.binarygap;

/**
 * this Class represent the solution of this Problem
 * @see <a>
 * https://app.codility.com/programmers/lessons/1-iterations/binary_gap/</a>
 */
public class BinaryGapSolution{


   public int solution(int N) {
       int max_count = 0;
       int count = 0;
       boolean counting = false;

       while (N != 0) {

           if (counting == false) {
               if ((N & 1) == 1) {
                   counting = true;
               }

           } else {
               if ((N & 1) == 0) {
                   count++;
               } else {
                   max_count = Math.max(max_count, count);
                   count = 0;
               }
           }
          N = N >> 1;
       }
       return max_count;
   }

}
