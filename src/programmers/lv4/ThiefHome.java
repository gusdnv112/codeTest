package programmers.lv4;

public class ThiefHome {
    public static void main(String[] args) {
        int[] money = {1,2,1,3,7,5,6};
        System.out.println(solution(money));
    }
    // bottom-up방식
    public static int solution(int[] money) {
        int answer = 0;
        int[] test = new int[money.length + 5];
        int[] test2 = new int[money.length + 5];
        test[0] = money[0];
        test[1] = money[0];
        test2[0] = 0;
        test2[1] = money[1];
        for (int i=2; i<money.length-1; i++) {
            test[i] = Math.max(test[i-2] + money[i], test[i-1]);
        }
        for (int i=2; i<money.length; i++) {
            test2[i] = Math.max(test2[i-2] + money[i], test2[i-1]);
        }
        answer = Math.max(test[money.length-2], test2[money.length-1]);
        return answer;
    }
}
