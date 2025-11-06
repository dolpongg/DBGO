import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        PriorityQueue<Integer> pq =new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < score.length; i++){
            pq.offer(score[i]);
        }

        int count = 0;
        int min = 10;

        while(!pq.isEmpty()){
            count++;
            if(count == m){
                answer += pq.poll()*m;
                count = 0;
                min = 10;
                continue;
            }
            pq.poll();
        }
        return answer;
    }
}