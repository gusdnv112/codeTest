
public class LV2_Nara124 {
	
	 public static String solution(int n) {
		 	String[] temp = {"4","1","2"};
	        String answer = "";
	        
	        int mok =n;
	        int nam =0;
	        
	        while(mok > 0) {
	        	nam = mok%3;
	        	mok = mok/3;
	        	
	        	if(nam == 0) {
	        		mok = mok -1;
	        		
	        	}
	        	answer = temp[nam] + answer;
	        	
	        }
	        
	        System.out.println(answer);
	        
	        return answer;
	        
	    }
	 
	 public static void main(String[] args) {
		solution(13);
		
	}
}

