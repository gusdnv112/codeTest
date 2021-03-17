package programmers.lv2;

import java.util.Stack;
public class StockPrice {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};
        int[] answerArray = solution(prices);
        for (int i : answerArray) {
            System.out.print(i + " ");
        }
    }
    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int count = 0;

        for(int i=0; i<prices.length-1; i++) {
            count = 0;
            for(int j=i+1; j<prices.length; j++) {
                if(prices[i]<=prices[j]) {
                    count++;
                } else {
                    count++;
                    break;
                }
            }
            answer[i] = count;
        }
        answer[prices.length-1] = 0;

        return answer;
    }
}
