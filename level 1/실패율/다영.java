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


// GPT 개선버전 추가
import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        double[] notClear = new double[N];
        int reach = stages.length;
        Map<Integer, Double> fail = new HashMap<>();
        
        // 각 스테이지별 도전자 수 카운트
        for (int stage : stages) {
            if (stage <= N) {
                notClear[stage - 1]++;
            }
        }

        // 실패율 계산
        for (int i = 0; i < N; i++) {
            if (reach == 0) {
                fail.put(i + 1, 0.0);
            } else {
                fail.put(i + 1, notClear[i] / reach);
                reach -= notClear[i];
            }
        }

        // 실패율 기준 내림차순 정렬 + key만 추출
        return fail.entrySet().stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}
