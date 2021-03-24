package programmers.lv2;

import java.util.PriorityQueue;

public class MoreHotter {
    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        System.out.println(solution(scoville, K));
    }
    public static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> dishScovilleList = new PriorityQueue<Integer>();
        for (int i : scoville) {
            dishScovilleList.offer(i);
        }

        while (dishScovilleList.peek()<K) {
            try {
                dishScovilleList.offer(dishScovilleList.poll() + dishScovilleList.poll() * 2);
                answer++;
                if (dishScovilleList.peek() >= K) {
                    break;
                }
                if (dishScovilleList.size() == 1 && dishScovilleList.peek() < K) {
                    answer = -1;
                    break;
                }
            } catch (Exception e) {
                answer = -1;
            }
        }

        return answer;
    }
}
