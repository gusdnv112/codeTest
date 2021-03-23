package programmers.lv2;

public class CompressString {
    public static void main(String[] args) {
        System.out.println(solution("aabbaccc"));
    }
    public static int solution(String s) {
        int answer = s.length();
        for(int i = 1; i < s.length(); i++) {
            int j = 0;
            String com = new String();
            String sub = new String();
            while (j + i <= s.length()) {
                sub = s.substring(j, j+i);
                int n = 1;
                j += i;
                while(j + i <= s.length()) {
                    if(!s.substring(j, j+i).equals(sub)) {
                        break;
                    }
                    j += i;
                    n++;
                }
                if(n != 1) com += String.valueOf(n) + sub;
                else com += sub;
            }
            com += s.substring(j);
            answer = Math.min(answer, com.length());
        }
        return answer;
    }
}
