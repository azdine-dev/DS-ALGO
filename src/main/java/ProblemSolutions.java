import com.azdine.dev.binarygap.BinaryGapSolution;
import com.azdine.dev.peakfinding.PeakFindingProblem;

/**
 * this class is playing the role
 * of the endpoint to solution of all problems
 *
 */
public class ProblemSolutions {

    public static void main(String[] args) {

        BinaryGapSolution binaryGapSolution = new BinaryGapSolution();
        int solution = binaryGapSolution.solution(32);

        System.out.println("solution ==> +"+ solution);


    }

}
