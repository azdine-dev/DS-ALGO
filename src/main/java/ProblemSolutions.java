import com.azdine.dev.peakfinding.PeakFindingProblem;

/**
 * this class is playing the role
 * of the endpoint to solution of all problems
 *
 */
public class ProblemSolutions {

    public static void main(String[] args) {

        // example of given array
        int[] ex = {23,4434,435,88,6,7,34,344,85,459};

        PeakFindingProblem pf = new PeakFindingProblem();
        int solution = pf.solution1(ex);

        System.out.println("solution to the problem ==> "+ solution );

    }

}
