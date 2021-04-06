import java.util.List;

public class Lv2_SkillTree {

//	 public static int dfs(int idx,String cur, String[] skill, String[] skill_trees) {
//		 
//		 if(skill_trees.length == idx) {
//			 return 1;
//		 }else {
//			 int ans=0;
//			 dfs(idx+1,  skill, skill_trees[idx]);			 
//			 
//			 return ans;
//		 }
//		 
//		 
//	 }
	
	 public static int solution(String skill, String[] skill_trees) {
	        int answer = 0;
	       
	        for(String str : skill_trees) {
	        	boolean check = true;
	        	int i = 0;
    			char[] skTree = str.toCharArray();
    			
    			for(char c : skTree) {
    				if(skill.contains(String.valueOf(c))) {
    					if(c == skill.charAt(i)) {
    						i++;
    					}else {
    						check = false;
    					}
    				}
    			}
    			if(check) {
    				answer++;
    			}
    			
	        }
	        System.out.println(answer);
	        	
	        return answer;
	 }
	        
	        
	
	 
	 
	 public static void main(String[] args) {
		 String[] tree = {"BACDE", "CBADF", "AECB", "BDA"};
		 solution("CBD", tree);
	}
}
