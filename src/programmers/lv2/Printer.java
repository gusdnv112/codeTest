package programmers.lv2;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Printer {

    public static void main(String[] args) {
        int location = 2;
        int[] priorities = {2, 1, 3, 2};
        System.out.print(solution(priorities, location));
    }

    public static int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> priortyQueue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : priorities){
            priortyQueue.add(i);
        }
        while (!priortyQueue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == priortyQueue.peek()) {
                    if (i == location) {
                        return ++answer;
                    }
                    priortyQueue.poll();
                    ++answer;
                }
            }
        }
        return answer;
    }
}
