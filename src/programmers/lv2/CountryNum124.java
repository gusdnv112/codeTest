package programmers.lv2;

public class CountryNum124 {
    public static void main(String[] args) {
        System.out.print(solution(4));
    }
    public static String solution(int n) {
        String answer = new String("");
        int addNum = 0;
        while (n != 0) {
            addNum = n % 3 == 0 ? 4 : n%3;
            answer = Integer.toString(addNum) + answer;
            n = addNum == 4 ? n/3 - 1 : n/3;
        }
        return answer;
    }
}
