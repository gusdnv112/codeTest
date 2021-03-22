package programmers;

public class Programmers_LV2_Nara124 {
	
	 public static String solution(int n) {
		 	String[] temp = {"4","1","2"};
	        String answer = "";
	        
	        int tmp = n;
	        int total =0;
	        int nam =0;
	        
	        if(n == 1) {
	        	return "1";
	        }
	        else if(n == 2) {
	        	return "2";
	        }
	        else if(n == 3) {
	        	return "4";
	        }
	        tmp = n / 3; // 13 -> 4  16 -> 5
        	nam = n % 3; // 13 -> 1  16 -> 1
        	int tmp2 = tmp;
        	total = tmp/3;
        	while(tmp2 > 0) {
        		tmp2 = tmp2 / 3;
        	}
        	for(int i = 0; i < total ; i++) {
        		
        		answer = answer.concat(temp[tmp2]);
        		
        	}
        	
	        switch (nam) {
			case 0:
				answer = answer.concat(temp[0]);
				break;
			case 1:
				answer = answer.concat(temp[1]);
				break;
			case 2:
				answer = answer.concat(temp[2]);
				break;
			}
	        	
	        
	        	System.out.println(answer);
	        
	        return answer;
	        
	    }
	 
	 public static void main(String[] args) {
		solution(13);
		
	}
}

