import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] notClear = new double[N];
        int index = 0;
        int reach = stages.length;
        Map<Integer, Double> fail = new HashMap<>();
        
        for (int stage : stages) {
            if (stage <= N) {
                notClear[stage-1]++;
            }
        }
        for (double challenge : notClear) {
            if (reach == 0) {
                fail.put(index, 0.0);
            }
            else {
                fail.put(index, notClear[index] / (double) reach);
                reach -= notClear[index];
            }
            index++;
        }

        List<Map.Entry<Integer, Double>> list = new ArrayList<>(fail.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        index = 0;
        for (Map.Entry<Integer, Double> e : list) {
            answer[index++] = e.getKey() + 1;
        }
        return answer;
    }
}
