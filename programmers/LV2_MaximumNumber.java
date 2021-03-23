import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LV2_MaximumNumber {

	public static String solution(int[] numbers) {
        String answer = "";
        
        String[] answerArr = new String[numbers.length];
        for(int i = 0 ; i < numbers.length; i++) {
        	answerArr[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(answerArr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s2+s1).compareTo(s1+s2);
            }
        });

        if (answerArr[0].equals("0")) return "0";

        for (int i = 0; i < answerArr.length; i++) {
            answer+=answerArr[i];
        }

        
        return answer;
    }
	
	public static void main(String[] args) {
		int[] numbers = {3, 30, 34, 5, 9};
		solution(numbers);
	}
}
