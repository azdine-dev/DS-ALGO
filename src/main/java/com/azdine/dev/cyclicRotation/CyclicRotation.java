package com.azdine.dev.cyclicRotation;

/**
 * this class represent the solution to this Problem
 * @see <a>https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/</a>
 */
public class CyclicRotation {
    public static void main(String[] args) {
       int[] test = {3,8,9,7,6};
       int[] result = CyclicRotation.solution(test, 1);

       System.out.println("Result ===> " + result.toString());
    }

    /**
     *
     * @return
     */
    public static int[] solution(int[] T, int k){

       int[] solution = new int[T.length];

       for (int index = 0 ; index < T.length; index ++){
           int new_position = (index + k) % T.length;
           solution[new_position] = T[index];
       }

       return solution;

    }
}
