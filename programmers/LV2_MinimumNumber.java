import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LV2_MinimumNumber {

	
	public static int solution(int []A, int []B)
    {
        int answer = 0;
        int min;
        int tmp =0;

        Arrays.sort(A);
        Arrays.sort(B);
        
        
        for(int i=0; i < A.length; i++) {
        	tmp = tmp + A[i] * B[B.length-i-1];
        }
        answer = tmp;
	    System.out.println(answer);
        
        return answer;
    }
	
	
	public static void main(String[] args) {
		int[] A = {1, 4, 2};
		int[] B = {5,4,4};
		solution(A, B);
	}
	
}
