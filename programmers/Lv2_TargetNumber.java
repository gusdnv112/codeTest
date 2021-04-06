public class Lv2_TargetNumber {

		    public static int solution(int[] numbers, int target) {
		    	
		        int answer = 0;
		        answer += dfs(0,0,numbers,target);
		        System.out.println(answer);
		        return answer;
		        
		    }
		    
		    public static int dfs(int num, int idx, int[] numbers, int target ) {
		    
		    	if(numbers.length == idx ) {
		    		return target == num ? 1 : 0 ;
		    	}
		    	else {
		    		int ans = 0;
		    		
		    		ans += dfs(num + numbers[idx], idx + 1, numbers, target );
		    		ans += dfs(num + (numbers[idx] * -1), idx + 1, numbers, target );
		    		
		    		return ans;
		    	}
		    	
		    	
		    }
		    
		    
		    
	 public static void main(String[] args) {
		 int[] number = {1,1,1,1,1};
		 solution(number, 3);
	}
}
