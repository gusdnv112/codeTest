import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lv2_HIndex {

	  // 논문의 번호(No)와 같거나 큰 번호(No)
	  // 인용된 논문 전체갯수 보다 피 인용횟수가 낮아지는 순위 바로 위의 순위가 h-index 
	   public static int solution(int[] citations) {
		   int answer = 0;
	        List<Integer> list = new ArrayList<>();
	        for(int i : citations) {
	        	list.add(i);
	        }
	        Collections.sort(list,Collections.reverseOrder());
	        int length = list.size();
	        int i;
	        for( i = 0 ; i < length; i++) {
	        	if(list.get(i) <= i) {
	        		break;
	        	}
	        }
	        
	        
	        return i;
	    }
	   
	   public static void main(String[] args) {
		   int[] ci = {3, 0, 6, 1, 5};
		   int[] ci2 = {10, 4, 6, 1, 5};
		   System.out.println( solution(ci));
		   System.out.println( solution(ci2));
	}
	    
}
